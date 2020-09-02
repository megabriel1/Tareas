
package com.mycompany.practicauno;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Proveedor {
    
    @NotNull(message="Este campo no puede estar vacio")    
    private int codigoProveedor;
    @NotEmpty(message="Este campo no puede estar vacio")
    private String nombreComercial;        
    @Min(value=8, message="El numero de telefono tiene que tener 8 digitos")
    @Max(value=8, message="El numero de telefono tiene que tener 8 digitos")
    private int contacto;
    @NotEmpty(message="Este campo no puede estar vacio")
    private String direccion;
    @Email(message="Ingresar un correo electronico valido")
    private String correoElectronico;
    @NotNull(message="Este campo no puede estar vacio")
    private String pais;
    private boolean eliminado;

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() {
        return "Los datos del proveedor son: " + "codigoProveedor=" + codigoProveedor + ", nombreComercial=" + nombreComercial + ", contacto=" + contacto + ", direccion=" + direccion + ", correoElectronico=" + correoElectronico + ", pais=" + pais + ", eliminado=" + eliminado;
    }  
}
