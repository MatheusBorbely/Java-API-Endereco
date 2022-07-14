package br.com.io.github.matheusborbely.shared;

import br.com.io.github.matheusborbely.model.dto.EnderecoDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ExistCepValitador implements ConstraintValidator<ExistCep, String> {
    @Override
    public void initialize(ExistCep constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        if(s == null) return false;

        RestTemplate restTemplate = new RestTemplateBuilder()
                .rootUri("https://viacep.com.br/ws").build();

        return restTemplate.getForObject("/{cep}/json/", EnderecoDto.class, s) == null;
    }
}
