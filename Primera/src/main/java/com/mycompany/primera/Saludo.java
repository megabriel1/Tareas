
package com.mycompany.primera;

import java.time.LocalDate;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;       

public class Saludo {
    public static void main (String args[]){
        
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

Validator validator = factory.getValidator();

Usuario usuario = new Usuario();
usuario.setEdad(18);
usuario.setNombre("Pablo");
usuario.setEmail("loro@gmail.com");
usuario.setLocalDate(LocalDate.now().plusYears(1));

Set<ConstraintViolation<Usuario>> violations = validator.validate(usuario);

for (ConstraintViolation<Usuario> violation : violations) {
System.out.println(violation.getMessage());
}
        
    }
}