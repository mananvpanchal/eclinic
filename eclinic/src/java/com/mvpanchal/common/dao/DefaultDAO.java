package com.mvpanchal.common.dao;

import com.mvpanchal.common.constants.CommonConstants;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Manan
 */
public class DefaultDAO {

    public ResultSet getResultSet(Connection connection, String sql, ArrayList<String> paramTypes, ArrayList<Object> params) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(sql);
        setParameters(statement, paramTypes, params);
        return statement.executeQuery();
    }

    public void saveData(Connection connection, String sql, ArrayList<String> paramTypes, ArrayList<Object> params) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(sql);
        setParameters(statement, paramTypes, params);
        statement.executeUpdate();
    }

    protected void setParameters(PreparedStatement statement, ArrayList<String> paramTypes, ArrayList<Object> params) throws SQLException {
        if (paramTypes == null || params == null) {
            return;
        }
        for (int i = 0; i < params.size(); i++) {
            if (paramTypes.get(i).equals(CommonConstants.STRING_TYPE)) {
                statement.setString(i + 1, (String) params.get(i));
            } else if (paramTypes.get(i).equals(CommonConstants.INTRGER_TYPE)) {
                statement.setInt(i + 1, (Integer) params.get(i));
            } else if (paramTypes.get(i).equals(CommonConstants.NUMBER_TYPE)) {
                statement.setDouble(i + 1, (Double) params.get(i));
            } else if (paramTypes.get(i).equals(CommonConstants.DATE_TYPE)) {
                statement.setDate(i + 1, (Date) params.get(i));
            } else if (paramTypes.get(i).equals(CommonConstants.TIME_TYPE)) {
                statement.setTime(i + 1, (Time) params.get(i));
            } else if (paramTypes.get(i).equals(CommonConstants.DATETIME_TYPE)) {
                statement.setTimestamp(i + 1, (Timestamp) params.get(i));
            }
        }
    }
}
