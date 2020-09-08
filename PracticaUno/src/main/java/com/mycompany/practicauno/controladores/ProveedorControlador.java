
package com.mycompany.practicauno.controladores;

import com.mycompany.practicauno.controladores.ListadoProveedores;
import com.mycompany.practicauno.controladores.Proveedor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Gabriel
 */
@Controller
public class ProveedorControlador {
  @GetMapping("/proveedor")
    public String get(Model model) {
        
        model.addAttribute("proveedor", new Proveedor());

        return "proveedor/crearProveedor";
    }

    @GetMapping("/proveedor/codigo/{codigo}")
    public String getByCodigo(Model model, @PathVariable("codigo") String codigo) {
        
        var proveedor = ListadoProveedores.buscarProveedor(codigo);
        
        model.addAttribute("proveedor", proveedor);

        return "proveedor/editarProveedor";
    }

    @PostMapping("/proveedor/crear")
    public String create(Model model, @ModelAttribute("proveedor") Proveedor proveedor) {

        boolean agregado = ListadoProveedores.agregarProveedor(proveedor);

        if (agregado) {
            model.addAttribute("proveedor", new Proveedor());
            model.addAttribute("mensaje", "Proveedor agregado satisfactoriamente");
        } else {
            model.addAttribute("mensaje", "¡¡Proveedor ya existe!!");
        }

        return "proveedor/crearProveedor";
    }  
    
    @PostMapping("/proveedor/editar")
    public String edit(Model model, @ModelAttribute("proveedor") Proveedor proveedor) {
       
        return "proveedor/editarProveedor";
    }

}
