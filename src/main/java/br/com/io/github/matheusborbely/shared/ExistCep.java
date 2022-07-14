package br.com.io.github.matheusborbely.shared;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = ExistCepValitador.class)
public @interface ExistCep {

    String message() default "CEP invalido.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
