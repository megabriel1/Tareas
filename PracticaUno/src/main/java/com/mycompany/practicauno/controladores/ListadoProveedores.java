
package com.mycompany.practicauno.controladores;

import com.mycompany.practicauno.controladores.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class ListadoProveedores {
    
   public static List<Proveedor> lista = new ArrayList<>();

    public static boolean agregarProveedor(Proveedor proveedor) {
        
        boolean existe = lista.stream().anyMatch(p -> p.equals(proveedor));

        existe=!existe?lista.add(proveedor):!existe;
        
        return !existe;
    }

    public static Proveedor buscarProveedor(String codigo) {
       
        return lista.stream()
                .filter(p -> p.getCodigo().equalsIgnoreCase(codigo))
                .findFirst()
                .orElse(null);
    }

}
