<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
            <title>Listing Sinhvien Items</title>
            <link rel="stylesheet" type="text/css" href="/WebApplication1/faces/jsfcrud.css" />
        </head>
        <body>
            <h:panelGroup id="messagePanel" layout="block">
                <h:messages errorStyle="color: red" infoStyle="color: green" layout="table"/>
            </h:panelGroup>
            <h1>Listing Sinhvien Items</h1>
            <h:form styleClass="jsfcrud_list_form">
                <h:outputText escape="false" value="(No Sinhvien Items Found)<br />" rendered="#{sinhvien.pagingInfo.itemCount == 0}" />
                <h:panelGroup rendered="#{sinhvien.pagingInfo.itemCount > 0}">
                    <h:outputText value="Item #{sinhvien.pagingInfo.firstItem + 1}..#{sinhvien.pagingInfo.lastItem} of #{sinhvien.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{sinhvien.prev}" value="Previous #{sinhvien.pagingInfo.batchSize}" rendered="#{sinhvien.pagingInfo.firstItem >= sinhvien.pagingInfo.batchSize}"/>&nbsp;
                    <h:commandLink action="#{sinhvien.next}" value="Next #{sinhvien.pagingInfo.batchSize}" rendered="#{sinhvien.pagingInfo.lastItem + sinhvien.pagingInfo.batchSize <= sinhvien.pagingInfo.itemCount}"/>&nbsp;
                    <h:commandLink action="#{sinhvien.next}" value="Remaining #{sinhvien.pagingInfo.itemCount - sinhvien.pagingInfo.lastItem}"
                                   rendered="#{sinhvien.pagingInfo.lastItem < sinhvien.pagingInfo.itemCount && sinhvien.pagingInfo.lastItem + sinhvien.pagingInfo.batchSize > sinhvien.pagingInfo.itemCount}"/>
                    <h:dataTable value="#{sinhvien.sinhvienItems}" var="item" border="0" cellpadding="2" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Ma"/>
                            </f:facet>
                            <h:outputText value="#{item.ma}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Ten"/>
                            </f:facet>
                            <h:outputText value="#{item.ten}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Ngaysinh"/>
                            </f:facet>
                            <h:outputText value="#{item.ngaysinh}">
                                <f:convertDateTime pattern="MM/dd/yyyy" />
                            </h:outputText>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText escape="false" value="&nbsp;"/>
                            </f:facet>
                            <h:commandLink value="Show" action="#{sinhvien.detailSetup}">
                                <f:param name="jsfcrud.currentSinhvien" value="#{jsfcrud_class['fdddd.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][sinhvien.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Edit" action="#{sinhvien.editSetup}">
                                <f:param name="jsfcrud.currentSinhvien" value="#{jsfcrud_class['fdddd.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][sinhvien.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                            <h:outputText value=" "/>
                            <h:commandLink value="Destroy" action="#{sinhvien.remove}">
                                <f:param name="jsfcrud.currentSinhvien" value="#{jsfcrud_class['fdddd.util.JsfUtil'].jsfcrud_method['getAsConvertedString'][item][sinhvien.converter].jsfcrud_invoke}"/>
                            </h:commandLink>
                        </h:column>

                    </h:dataTable>
                </h:panelGroup>
                <br />
                <h:commandLink action="#{sinhvien.createSetup}" value="New Sinhvien"/>
                <br />
                <br />
                <h:commandLink value="Index" action="welcome" immediate="true" />


            </h:form>
        </body>
    </html>
</f:view>
