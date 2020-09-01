<%@page import="javax.validation.ConstraintViolation"%>
<%@page import="java.util.Set"%>
<%@page import="com.mycompany.practicauno.Proveedor"%>
<%@page import="javax.faces.validator.Validator"%>
<%@page import="javax.validation.ValidatorFactory"%>
<%@page import="javax.validation.Validation"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String titulo = "Listado de clientes";%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%=titulo%></title>
    </head>
    <body>
        <h1><%=titulo%></h1>

        ${codigoProveedor}        
        ${nombreComercial}
        ${contacto}
        ${direccion}
        ${correoElectronico}
        ${pais}
        ${eliminado}

        <%/*            
            ValidatorFactory fabrica = Validation.buildDefaultValidatorFactory();
            
            Validator validador = (Validator) fabrica.getValidator();
            
            Proveedor usuario = new Proveedor();

            usuario.setCodigoProveedor(12);  
            usuario.setContacto(12);
            
            Set<ConstraintViolation<Proveedor>> violacion=validador.validate(usuario);

            for (int i = 0; i < violacion.size(); i++) {
                System.out.println(violacion);
            }*/
        %>

        <table>
            <thead>
            <th>Codigo del proveedor</th>
            <th>Nombre comercial</th>
            <th>Contacto</th>
            <th>Direccion</th>
            <th>Correo electronico</th>
            <th>Pais</th>
            <th>Eliminado</th>                
        </thead>
        <tbody>                
            <c:forEach items="${lista}" var="lista">
                <tr>
                    <td>${lista.codigoProveedor}</td>
                    <td>${lista.nombreComercial}</td>
                    <td>${lista.contacto}</td>
                    <td>${lista.direccion}</td>
                    <td>${lista.correoElectronico}</td>
                    <td>${lista.pais}</td>
                    <td>${lista.eliminado}</td>

                </tr>

            </c:forEach>                    

        </tbody>

    </table>


</body>
</html>
