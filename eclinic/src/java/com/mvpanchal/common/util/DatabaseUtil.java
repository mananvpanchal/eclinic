package com.mvpanchal.common.util;

import com.mvpanchal.common.constants.CommonConstants;
import java.sql.Connection;
import java.sql.DriverManager;
import org.mvpanchal.zefw.applicationproperties.ApplicationProperties;

/**
 *
 * @author Manan
 */
public class DatabaseUtil {
    public static Connection getConnection() throws Exception {
        Class.forName(ApplicationProperties.getProperty(CommonConstants.DATABASE_DRIVER));
        String url = ApplicationProperties.getProperty(CommonConstants.DATABASE_URL);
        String username = ApplicationProperties.getProperty(CommonConstants.DATABASE_USERNAME);
        String password = ApplicationProperties.getProperty(CommonConstants.DATABASE_PASSWORD);
        return DriverManager.getConnection(url, username, password);
    }
}
