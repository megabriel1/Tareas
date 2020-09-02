
package controladores;

import com.mycompany.practicauno.ListadoProveedores;
import com.mycompany.practicauno.Proveedor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class ControladorIndex extends HttpServlet {

    ListadoProveedores usuario=new ListadoProveedores();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
    
        List<Proveedor>lista=this.usuario.listarProveedores();
        
        request.setAttribute("lista", lista);                  
        
        request.setAttribute("codigoProveedor", request.getParameter("codigoProveedor"));
        request.setAttribute("nombreComercial", request.getParameter("nombreComercial"));
        request.setAttribute("contacto", request.getParameter("contacto"));
        request.setAttribute("direccion", request.getParameter("direccion"));
        request.setAttribute("correoElectronico", request.getParameter("correoElectronico"));
        request.setAttribute("pais", request.getParameter("pais"));
        request.setAttribute("eliminado", request.getParameter("eliminado"));       
        
        request.getRequestDispatcher("vistas/index.jsp").forward(request, response);        
    }   
}