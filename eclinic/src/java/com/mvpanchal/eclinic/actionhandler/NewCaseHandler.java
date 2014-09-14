package com.mvpanchal.eclinic.actionhandler;

import com.mvpanchal.common.actionhandler.AbstractActionHandler;
import com.mvpanchal.common.constants.CommonConstants;
import com.mvpanchal.common.dao.DefaultDAO;
import com.mvpanchal.eclinic.model.Patient;
import java.sql.Connection;
import java.util.ArrayList;
import org.mvpanchal.zefw.connector.ActionViewConnector;
import org.mvpanchal.zefw.evententities.EventEntities;
import org.mvpanchal.zefw.model.Model;

/**
 *
 * @author Manan
 */
public class NewCaseHandler extends AbstractActionHandler {

    @Override
    public String handleAction(Connection connection, Model[] models, ActionViewConnector connector, EventEntities entities) throws Exception {
        Patient patient=(Patient)models[0];
        System.out.println(patient.getName());
        System.out.println(patient.getAge());
        System.out.println(patient.getAddress());
        System.out.println(patient.getSex());
        System.out.println(patient.getPhoneNo());
        ArrayList columnTypes=new ArrayList();
        columnTypes.add(CommonConstants.STRING_TYPE);
        columnTypes.add(CommonConstants.INTRGER_TYPE);
        columnTypes.add(CommonConstants.STRING_TYPE);
        columnTypes.add(CommonConstants.STRING_TYPE);
        columnTypes.add(CommonConstants.STRING_TYPE);
        ArrayList values=new ArrayList();
        values.add(patient.getName());
        values.add(patient.getAge());
        values.add(patient.getSex().equals("Male")?"M":"F");
        values.add(patient.getAddress());
        values.add(patient.getPhoneNo());
        DefaultDAO dao=new DefaultDAO();
        dao.saveData(connection, "insert into patient (name, age, sex, address, phone_no) values (?, ?, ?, ?, ?)", columnTypes, values);
        return null;
    }

}
