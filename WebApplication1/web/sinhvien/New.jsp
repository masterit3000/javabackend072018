<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>New Sinhvien</title>
            <link rel="stylesheet" type="text/css" href="/WebApplication1/faces/jsfcrud.css" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>New Sinhvien</h1>
            <h:form>
                <h:inputHidden id="validateCreateField" validator="#{sinhvien.validateCreate}" value="value"/>
                <h:panelGrid columns="2">
                    <h:outputText value="Ten:"/>
                    <h:inputText id="ten" value="#{sinhvien.sinhvien.ten}" title="Ten" required="true" requiredMessage="The ten field is required." />
                    <h:outputText value="Ngaysinh (MM/dd/yyyy):"/>
                    <h:inputText id="ngaysinh" value="#{sinhvien.sinhvien.ngaysinh}" title="Ngaysinh" required="true" requiredMessage="The ngaysinh field is required." >
                        <f:convertDateTime pattern="MM/dd/yyyy" />
                    </h:inputText>

                </h:panelGrid>
                <br />
                <h:commandLink action="#{sinhvien.create}" value="Create"/>
                <br />
                <br />
                <h:commandLink action="#{sinhvien.listSetup}" value="Show All Sinhvien Items" immediate="true"/>
                <br />
                <br />
                <h:commandLink value="Index" action="welcome" immediate="true" />

            </h:form>
        </body>
    </html>
</f:view>
