<%-- 
    Document   : caseregister
    Created on : Jun 22, 2014, 2:23:40 PM
    Author     : Himanshu
--%>
<%@taglib prefix="zfw" uri="/WEB-INF/zefw.tld" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="zfw" uri="/WEB-INF/zefw.tld" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Case Desk</title>
<link rel="stylesheet" type="text/css" href="eclinic.css"/>
</head>
<body>
<div align="center" class="header"><h3 style="color:#FFFFFF; padding-top: 27px;">E-Clinic - Case Desk - New Case</h3></div>
<div align="center" class="navbar">
<div class="navitem" style="width: 12%;"><a href="searchcase.html" class="navlink">Search Case</a></div>
<div class="navitem"><a href="newcase.html" class="navlink">New Case</a></div>
<div class="navitem"><a href="#" class="navlink">Waiting</a></div>
<div class="navitem" style="width: 12%;"><a href="#" class="navlink">Dispatched</a></div>
<div class="navitemlast"><a href="#" class="navlink">Logout</a></div>
</div>
<br/>
<br/>
<div align="center">
<label style="font-size: 16px;">Enter patient detail</label>
</div>
<br/>
<zfw:form action="create_new_case" method="post">
<table align="center" style=" padding: 40px; border: solid; border-color: #A2ADBC;">
<tr>
<td><label id="namelbl" for="namefield">Name&nbsp;</label></td>
<td><zfw:textfield id="namefield" name="namefield" size="30" valueto="m{patient.name}"/></td>
</tr>
<tr>
<td><label id="agelbl" for="agefield">Age&nbsp;</label></td>
<td><zfw:textfield id="agefield" name="agefield" size="5" valueto="m{patient.age}"/></td>
</tr>
<tr>
<td><label id="sexlbl" for="sexfield">Sex&nbsp;</label></td>
<td>
    <zfw:combobox id="sexfield" name="sexfield" valueto="m{patient.sex}">
        <option>Male</option>
        <option>Female</option>
    </zfw:combobox>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><label id="addresslbl" for="addressfield">Address&nbsp;</label></td>
<td><zfw:textarea id="addressfield" name="addressfield" rows="4" cols="30" valueto="m{patient.address}"></zfw:textarea></td>
</tr>
<tr>
<td style="vertical-align: top;"><label id="phonenolbl" for="phonenofield">Phone No.&nbsp;</label></td>
<td><zfw:textfield id="phonenofield" name="phonenofield" size="20" valueto="m{patient.phoneNo}"/></td>
</tr>
<tr height="20px;">
</tr>
<tr>
<td></td>
<td><input type="submit" value="Create" class="button"/>&nbsp;<input type="reset" value="Clear" class="button"/></td>
</tr>
</table>
</zfw:form>
</body>
</html>
