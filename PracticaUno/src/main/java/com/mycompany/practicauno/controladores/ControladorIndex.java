
package com.mycompany.practicauno.controladores;

import com.mycompany.practicauno.controladores.ListadoProveedores;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Gabriel
 */
@Controller
public class ControladorIndex {
 @GetMapping("/index")
    public String get(Model model) {

        model.addAttribute("ListadoProveedores", ListadoProveedores.lista);

        return "index";
    }

}
