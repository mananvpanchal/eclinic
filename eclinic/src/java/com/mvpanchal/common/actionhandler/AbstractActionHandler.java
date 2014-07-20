package com.mvpanchal.common.actionhandler;

import com.mvpanchal.common.util.DatabaseUtil;
import java.sql.Connection;
import org.mvpanchal.zefw.actionhandler.ActionHandler;
import org.mvpanchal.zefw.connector.ActionViewConnector;
import org.mvpanchal.zefw.evententities.EventEntities;
import org.mvpanchal.zefw.model.Model;

/**
 *
 * @author Manan
 */
public abstract class AbstractActionHandler implements ActionHandler {

    public String handleAction(Model[] models, ActionViewConnector connector, EventEntities entities) throws Exception {
        String view = null;
        Connection connection = DatabaseUtil.getConnection();
        try {
            view = handleAction(connection, models, connector, entities);
        } finally {
            connection.close();
        }
        return view;
    }

    public abstract String handleAction(Connection connection, Model[] models, ActionViewConnector connector, EventEntities entities) throws Exception;
}
