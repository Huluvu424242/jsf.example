<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
 
<f:view>
    <html>
    <head>
        <title>Hello World JSF Example</title>
    </head>
    <body>
    <h:form>
        <p>Dieser Text wurde eingegeben:</p>
        <p><h:outputText value="#{messageModel.newValue}" /></p>
        <h:commandButton value="Submit" action="#{pageController.processPage1}"/>
    </h:form>
    </body>
    </html>
</f:view>