
package com.mycompany.primera;

import java.time.LocalDate;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class Usuario {    

@NotNull(message="no puede ser null")
@Email(message="no es un email valido")
private String email;    

@Past(message="fecha no valida")
private LocalDate localdate;
    
  @NotNull(message="Nombre no puede ser nulo")
private String nombre;

@NotNull(message="Edad no puede ser nula")
@Min(value=18, message="Edad debe ser mayor o igual a 18")
@Max(value=150, message="Edad debe ser menor o igual a 150")
private Integer edad;

@Min(value=0, message="Edad debe ser mayor o igual a cero")
private int credito;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    } 
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    } 

    public LocalDate getLocalDate() {
        return localdate;
    }

    public void setLocalDate(LocalDate localdate) {
        this.localdate = localdate;
    }
    
}
