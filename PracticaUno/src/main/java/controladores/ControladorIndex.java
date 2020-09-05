
package controladores;

import ListadoProveedores.ListadoProveedores;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Gabriel
 */
public class ControladorIndex {
 @GetMapping("/index")
    public String get(Model model) {

        model.addAttribute("ListadoProveedores", ListadoProveedores.lista);

        return "index";
    }

}
