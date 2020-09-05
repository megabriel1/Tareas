<%-- 
    Document   : crearProveedor
    Created on : 4/09/2020, 12:29:47
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Proveedor</title>
    </head>
    <body>
        <STYLE type="text/css">
        h1, h2, h3 { text-align: center}
        </STYLE>
        <h1 style="color:dodgerblue;font-size:30px;">Crear Proveedor</h1>
        <hr style="border-color:orange;">                      
        <br/>                      

        <span>${mensaje}</span>


        <form:form method="post" 
                   action="proveedor/crear" 
                   modelAttribute="proveedor">

            <form:label path="codigo">Código:</form:label> 
            <form:input path="codigo"  />
            <br/>

            <form:label path="nombreComercial">Nombre Comercial:</form:label> 
            <form:input path="nombreComercial" />
            <br/>

            <form:label path="direccion">Dirección:</form:label> 
            <form:textarea path="direccion" />
            <br/>

            <form:label path="contacto">Contacto:</form:label> 
            <form:input path="contacto" />
            <br/>

            <form:label path="correoElectronico">Correo Electrónico:</form:label> 
            <form:input path="correoElectronico" />
            <br/>

            <form:label path="pais">Pais:</form:label> 
            <form:input path="pais" />
            <br/>
            
            <form:button class="">Enviar</form:button>
        </form:form>
    <br/>    
    <p><a href="../index.jsp">Ir al listado de proveedores</a></p>
    </body>
</html>
