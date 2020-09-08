<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Proveedores</title>
        <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
    </head>
    <body>
         <STYLE type="text/css">
        h1, h2, h3 { text-align: center}
        </STYLE>
        <h1 style="color:dodgerblue;font-size:30px;">Listado de Proveedores</h1>
        <hr style="border-color:orange;">                      
        <br/>              
        

        <a href="proveedor/crearProveedor.jsp">Crear Proveedores</a>        
        <br/>
        <a href="proveedor/editarProveedor.jsp">Editar Proveedores</a>
        <br/>

        <table>
            <thead>
                <tr>
                    <th>Código</th>
                    <th>Nombre Comercial</th>
                    <th>Contacto</th>
                    <th>Dirección</th>
                    <th>Correo Electronico</th>
                    <th>Pais</th>
                    <th colspan="2">Opciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${lista}" var="proveedor">
                    <tr>
                        <td>${proveedor.codigo}</td> 
                        <td>${proveedor.nombreComercial}</td> 
                        <td>${proveedor.contacto}</td>
                        <td>${proveedor.direccion}</td> 
                        <td>${proveedor.correoElectronico}</td> 
                        <td>${proveedor.pais}</td> 
                        <td><a href="proveedor/codigo/${proveedor.codigo}">Modificar</a></td> 
                        <td><a href="proveedor/eliminar/${proveedor.codigo}">Eliminar</a></td> 
                    </tr>

                </c:forEach>

            </tbody>
        </table>
    </body>
</html>
