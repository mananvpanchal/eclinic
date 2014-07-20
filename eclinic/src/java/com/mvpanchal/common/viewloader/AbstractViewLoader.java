package com.mvpanchal.common.viewloader;

import com.mvpanchal.common.util.DatabaseUtil;
import java.sql.Connection;
import org.mvpanchal.zefw.connector.ActionViewConnector;
import org.mvpanchal.zefw.evententities.EventEntities;
import org.mvpanchal.zefw.model.Model;
import org.mvpanchal.zefw.viewloader.ViewLoader;

/**
 *
 * @author Manan
 */
public abstract class AbstractViewLoader implements ViewLoader {

    public void loadView(Model[] models, ActionViewConnector connector, EventEntities entities) throws Exception {
        Connection connection = DatabaseUtil.getConnection();
        try {
            loadView(connection, models, connector, entities);
        } finally {
            connection.close();
        }
    }
    
    public abstract void loadView(Connection connection, Model[] models, ActionViewConnector connector, EventEntities entities) throws Exception;

}
