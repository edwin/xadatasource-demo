<%-- 
    Document   : demo
    Created on : Sep 3, 2014, 9:29:44 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>XA Demo</title>
    </head>
    <form  method="post">
        <table>
            <tr>
                <td>First Name</td>
                <td><input name="firstName" maxlength="30"></td>
            </tr>
            <tr>
                <td>Middle Name</td>
                <td><input name="middleName" maxlength="30"></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input name="lastName" maxlength="30"></td>
            </tr>
            <tr>
                <td>Customer Information</td>
                <td></td>
            </tr>
            <tr>
                <td>CIF</td>
                <td><input name="cif" maxlength="10"></td>
            </tr>
            <tr>
                <td>Product Code</td>
                <td>
                    <select name="productCode">
                        <c:forEach items="${productCodesList}" var="productCode">
                            <option value="${productCode}">${productCode}</option>
                        </c:forEach>
                    </select>                    
                </td>
            </tr>
            <tr>
                <td>Currency Code</td>
                <td>
                    <select name="currencyCode">
                        <c:forEach items="${currencyCodesList}" var="currencyCode">
                            <option value="${currencyCode}">${currencyCode}</option>
                        </c:forEach>
                    </select>                              
                </td>
            </tr>
            <tr>
                <td>Credit Card Information</td>
                <td></td>
            </tr>
            
            <tr>
                <td>Credit Card No</td>
                <td><input name="cardNo" maxlength="20"></td>
            </tr>
            <tr>
                <td>Credit Card Product Code</td>
                <td>
                    <select name="productCardCode">
                        <c:forEach items="${ccProductCodesList}" var="ccProductCode">
                            <option value="${ccProductCode}">${ccProductCode}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>            
            <tr>
                <td>&nbsp;</td>
                <td><input type="submit" value="Save"/></td>
            </tr>
        </table>
    </form>
    <body>        
        <h1>XA Demo</h1>
        <h1>Credit Card Table On Database 1</h1>
        <table border="1">
            <tr>
                <td>First Name</td>
                <td>Middle Name</td>
                <td>Last Name</td>                
                <td>Card Number</td>
                <td>Product Code</td>
                <td>Limit Max</td>
                <td>Limit Use</td>
                <td>Status</td>                
            </tr>
            <c:forEach items="${creditcardcustomers}" var="creditcardcustomer">
            <tr>
                <td>${creditcardcustomer.firstName}</td>
                <td>${creditcardcustomer.middleName}</td>
                <td>${creditcardcustomer.lastName}</td>                
                <td>${creditcardcustomer.cardNo}</td>
                <td>${creditcardcustomer.productCardCode}</td>                
                <td>${creditcardcustomer.limitMax}</td>                
                <td>${creditcardcustomer.limitUse}</td>                
                <td>${creditcardcustomer.status}</td>                
                
            </tr>                
            </c:forEach>
        </table>
        
        <h1>Customer Table On Database 2</h1>
        <table border="1">
            <tr>
                <td>First Name</td>
                <td>Middle Name</td>
                <td>Last Name</td>                                
                <td>CIF</td>
                <td>Product Code</td>
                <td>Currency Code</td>
                <td>Balance</td>
                <td>Outstanding Balance</td>
                <td>Outstanding Status</td>                
            </tr>            
            <c:forEach items="${customers}" var="customer">
            <tr>
                <td>${customer.firstName}</td>
                <td>${customer.middleName}</td>
                <td>${customer.lastName}</td>                                
                <td>${customer.cif}</td>
                <td>${customer.productCode}</td>
                <td>${customer.currencyCode}</td>
                <td>${customer.balance}</td>
                <td>${customer.outstandingBalance}</td>
                <td>${customer.status}</td>                
            </tr>                
            </c:forEach>
        </table>

        
        
        
    </body>
</html>
