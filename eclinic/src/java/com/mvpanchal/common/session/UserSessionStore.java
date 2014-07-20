package com.mvpanchal.common.session;

import org.mvpanchal.zefw.evententities.EventEntities;

/**
 *
 * @author Manan
 */
public class UserSessionStore {
    
    public static void createUserSession(EventEntities entities, Object user) {
        entities.getRequest().getSession(true).setAttribute("user", user);
    }
    
    public static boolean isUserSessionAlive(EventEntities entities) {
        Object user=entities.getRequest().getSession().getAttribute("user");
        return user!=null;
    }
    
    public static Object getSessionUser(EventEntities entities) {
        return entities.getRequest().getSession().getAttribute("user");
    }
}
