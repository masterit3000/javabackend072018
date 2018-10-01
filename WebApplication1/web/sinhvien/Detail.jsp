<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Sinhvien Detail</title>
            <link rel="stylesheet" type="text/css" href="/WebApplication1/faces/jsfcrud.css" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Sinhvien Detail</h1>
            <h:form>
                <h:panelGrid columns="2">
                    <h:outputText value="Ma:"/>
                    <h:outputText value="#{sinhvien.sinhvien.ma}" title="Ma" />
                    <h:outputText value="Ten:"/>
                    <h:outputText value="#{sinhvien.sinhvien.ten}" title="Ten" />
                    <h:outputText value="Ngaysinh:"/>
                    <h:outputText value="#{sinhvien.sinhvien.ngaysinh}" title="Ngaysinh" >
                        <f:convertDateTime pattern="MM/dd/yyyy" />
                    </h:outputText>


                </h:panelGrid>
                <br />
                <h:commandLink action="#{sinhvien.remove}" value="Destroy">
                    <f:param name="jsfcrud.currentSinhvien" value="#{jsfcrud_class['fdddd.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][sinhvien.sinhvien][sinhvien.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <br />
                <h:commandLink action="#{sinhvien.editSetup}" value="Edit">
                    <f:param name="jsfcrud.currentSinhvien" value="#{jsfcrud_class['fdddd.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][sinhvien.sinhvien][sinhvien.converter].jsfcrud_invoke}" />
                </h:commandLink>
                <br />
                <h:commandLink action="#{sinhvien.createSetup}" value="New Sinhvien" />
                <br />
                <h:commandLink action="#{sinhvien.listSetup}" value="Show All Sinhvien Items"/>
                <br />
                <br />
                <h:commandLink value="Index" action="welcome" immediate="true" />

            </h:form>
        </body>
    </html>
</f:view>
