<%@page import="javax.validation.ConstraintViolation"%>
<%@page import="java.util.Set"%>
<%@page import="com.mycompany.practicauno.Proveedor"%>
<%@page import="javax.faces.validator.Validator"%>
<%@page import="javax.validation.ValidatorFactory"%>
<%@page import="javax.validation.Validation"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2 style="color:dodgerblue;font-size:30px;">Lista de Proveedores</h2>
<hr style="border-color:orange;">
<STYLE type="text/css">
    h2, table { text-align: center}
</STYLE>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <style>

        table {

            font-family: sans-serif;
            border-spacing: 5px;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <body>        

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
                <th style="color:tomato">Codigo del proveedor</th>
                <th style="color:tomato">Nombre comercial</th>
                <th style="color:tomato">Contacto</th>                    
                <th style="color:tomato">Direccion</th>                    
                <th style="color:tomato">Correo electrónico</th>                    
                <th style="color:tomato">País</th>                    
                <th style="color:tomato">Eliminado</th>                    
                
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
            <p style="color:dodgerblue;font-size:20px;"><a href="index.jsp">Regresar al indice</a></p>


    </body>
</html>
