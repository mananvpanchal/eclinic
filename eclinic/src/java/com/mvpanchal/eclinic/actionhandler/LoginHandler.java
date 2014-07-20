package com.mvpanchal.eclinic.actionhandler;

import com.mvpanchal.common.actionhandler.AbstractActionHandler;
import com.mvpanchal.common.constants.CommonConstants;
import com.mvpanchal.common.dao.DefaultDAO;
import com.mvpanchal.common.session.UserSessionStore;
import com.mvpanchal.eclinic.model.User;
import com.mvpanchal.eclinic.model.UserType;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.mvpanchal.zefw.applicationmessage.ApplicationMessage;
import org.mvpanchal.zefw.applicationmessage.ApplicationMessageType;
import org.mvpanchal.zefw.applicationmessage.ApplicationMessagesStore;
import org.mvpanchal.zefw.applicationproperties.ApplicationProperties;
import org.mvpanchal.zefw.connector.ActionViewConnector;
import org.mvpanchal.zefw.evententities.EventEntities;
import org.mvpanchal.zefw.model.Model;

/**
 *
 * @author Manan
 */
public class LoginHandler extends AbstractActionHandler {

    @Override
    public String handleAction(Connection connection, Model[] models, ActionViewConnector connector, EventEntities entities) throws Exception {
        String viewName;
        ApplicationMessagesStore.clear(entities);
        User user = (User) models[0];
        String sql = ApplicationProperties.getProperty("login_select");
        DefaultDAO dao = new DefaultDAO();
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(user.getUsername());
        ArrayList<String> paramTypes = new ArrayList<String>();
        paramTypes.add(CommonConstants.STRING_TYPE);
        ResultSet set = dao.getResultSet(connection, sql, paramTypes, params);
        if (set.next()) {
            String dbPassword = set.getString("password");
            user.setUserType(UserType.valueOf(set.getString("usertype")));
            if (user.getPassword().equals(dbPassword)) {
                UserSessionStore.createUserSession(entities, user);
                if (user.getUserType() != null && user.getUserType().equals(UserType.CASEREGISTRAR)) {
                    viewName = "caseregisterhome";
                } else if (user.getUserType() != null && user.getUserType().equals(UserType.DOCTOR)) {
                    viewName = "doctorhome";
                } else if (user.getUserType() != null && user.getUserType().equals(UserType.PHARMACIST)) {
                    viewName = "pharmacyhome";
                } else if (user.getUserType() != null && user.getUserType().equals(UserType.ADMIN)) {
                    viewName = "adminhome";
                } else {
                    int id = Integer.parseInt(ApplicationProperties.getProperty("usertype_not_assigned_id"));
                    String message = ApplicationProperties.getProperty("usertype_not_assigned_msg");
                    ApplicationMessagesStore.addMessage(entities, new ApplicationMessage(id, message, ApplicationMessageType.ERROR));
                    viewName = null;
                }
            } else {
                int id = Integer.parseInt(ApplicationProperties.getProperty("pswd_wrong_id"));
                String message = ApplicationProperties.getProperty("pswd_wrong_msg");
                ApplicationMessagesStore.addMessage(entities, new ApplicationMessage(id, message, ApplicationMessageType.ERROR));
                viewName = null;
            }
        } else {
            int id = Integer.parseInt(ApplicationProperties.getProperty("user_no_exist_id"));
            String message = ApplicationProperties.getProperty("user_no_exist_msg");
            ApplicationMessagesStore.addMessage(entities, new ApplicationMessage(id, message, ApplicationMessageType.ERROR));
            viewName = null;
        }
        if (viewName != null) {
            params = new ArrayList<Object>();
            params.add(user.getUsername());
            paramTypes = new ArrayList<String>();
            paramTypes.add(CommonConstants.STRING_TYPE);
            dao.saveData(connection, ApplicationProperties.getProperty("update_logintime"), paramTypes, params);
        }
        return viewName;
    }
}
