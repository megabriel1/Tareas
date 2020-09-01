
package com.mycompany.practicauno;

import java.util.ArrayList;
import java.util.List;

public class ListadoProveedores {
    
    public List<Proveedor> listarProveedores(){

        List<Proveedor> lista=new ArrayList();
        
        for(int i=0; i<lista.size(); i++){
            Proveedor nuevo=new Proveedor();
            
            lista.add(nuevo);
        }
        return lista;
    }
}
