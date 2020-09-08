<%-- 
    Document   : editarProveedor
    Created on : 4/09/2020, 12:30:00
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Proveedor</title>
    </head>
    <body>
        <STYLE type="text/css">
        h1, h2, h3 { text-align: center}
        </STYLE>
        <h1 style="color:dodgerblue;font-size:30px;">Editar Proveedor</h1>
        <hr style="border-color:orange;">                      
        <br/>                   

        <span>${mensaje}</span>       
        
        <form:form method="post"  
                   action="../editar"
                   modelAttribute="proveedor">
            
            <form:label path="codigo">Código:</form:label> 
            <form:input path="codigo" readonly="true"  />
            <br/>

            <form:label path="nombreComercial">Nombre Comercial:</form:label> 
            <form:input path="nombreComercial" />
            <br/>

            <form:label path="contacto">Contacto:</form:label> 
            <form:input path="contacto" />
            <br/>
            
            <form:label path="direccion">Dirección:</form:label> 
            <form:textarea path="direccion" />
            <br/>


            <form:label path="correoElectronico">Correo Electrónico:</form:label> 
            <form:input path="correoElectronico" />
            <br/>

            <form:label path="pais">Pais:</form:label> 
            <form:input path="pais" />
            <br/>
            
            <form:button class="">Enviar</form:button>
        </form:form>
    <p><a href="../index.jsp">Ir al listado de proveedores</a></p>
    </body>
</html>
