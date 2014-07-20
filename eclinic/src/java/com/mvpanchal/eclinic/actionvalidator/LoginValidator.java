package com.mvpanchal.eclinic.actionvalidator;

import com.mvpanchal.eclinic.model.User;
import java.util.List;
import org.mvpanchal.zefw.actionvalidator.ActionValidationError;
import org.mvpanchal.zefw.actionvalidator.ActionValidator;
import org.mvpanchal.zefw.applicationproperties.ApplicationProperties;
import org.mvpanchal.zefw.evententities.EventEntities;
import org.mvpanchal.zefw.model.Model;

/**
 *
 * @author Manan
 */
public class LoginValidator implements ActionValidator {

    public boolean validate(Model[] models, List<ActionValidationError> errorList, EventEntities entities) {
        User user=(User)models[0];
        if(user.getUsername()==null) {
            int id=Integer.parseInt(ApplicationProperties.getProperty("login_user_empty_id"));
            String msg=ApplicationProperties.getProperty("login_user_empty_msg");
            errorList.add(new ActionValidationError(id, msg, 1));
        }
        if(user.getPassword()==null) {
            int id=Integer.parseInt(ApplicationProperties.getProperty("login_pswd_empty_id"));
            String msg=ApplicationProperties.getProperty("login_pswd_empty_msg");
            errorList.add(new ActionValidationError(id, msg, 1));
        }
        return true;
    }

}
