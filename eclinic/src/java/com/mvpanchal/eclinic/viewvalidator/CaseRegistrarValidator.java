package com.mvpanchal.eclinic.viewvalidator;

import com.mvpanchal.common.session.UserSessionStore;
import com.mvpanchal.eclinic.model.User;
import com.mvpanchal.eclinic.model.UserType;
import org.mvpanchal.zefw.connector.ActionViewConnector;
import org.mvpanchal.zefw.evententities.EventEntities;
import org.mvpanchal.zefw.viewvalidator.ViewValidator;

/**
 *
 * @author Manan
 */
public class CaseRegistrarValidator implements ViewValidator {

    public String validate(ActionViewConnector connector, EventEntities entities) {
        if(UserSessionStore.isUserSessionAlive(entities)) {
            User user=(User)UserSessionStore.getSessionUser(entities);
            if(user.getUserType()==UserType.CASEREGISTRAR || 
                    user.getUserType()==UserType.DOCTOR || 
                    user.getUserType()==UserType.ADMIN) {
                return null;
            } else {
                return "notauthorizeduser";
            }
        } else {
            return "notloggedin";
        }
    }

}
