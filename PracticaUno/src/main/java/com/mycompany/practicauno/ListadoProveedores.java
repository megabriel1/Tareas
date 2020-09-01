
package com.mycompany.practicauno;

import java.util.ArrayList;
import java.util.List;

public class ListadoProveedores {
    
    public List<Proveedor> listarProveedores(){

        List<Proveedor> lista=new ArrayList();
        
        for(int i=0; i<4; i++){
            Proveedor nuevo=new Proveedor();
            
            nuevo.setCodigoProveedor(i);
            nuevo.setContacto(i);
            nuevo.setCorreoElectronico("pepita@gmail.com"+i);
            nuevo.setDireccion("avenida"+i);
            nuevo.setNombreComercial("Empresa"+i);
            nuevo.setPais("Guate"+i);
            nuevo.setEliminado(true);
            
            lista.add(nuevo);
        }
        return lista;
    }
}
