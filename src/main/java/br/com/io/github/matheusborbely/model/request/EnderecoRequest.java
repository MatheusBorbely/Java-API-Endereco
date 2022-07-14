package br.com.io.github.matheusborbely.model.request;

import br.com.io.github.matheusborbely.shared.ExistCep;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EnderecoRequest {

    @NotNull(message = "{numero.vazio}")
    private Integer numero;


    @ExistCep
    @Size(max = 9, min = 8, message = "{cep.invalido}")
    private String cep;

    @Deprecated
    public EnderecoRequest() {
    }

    public Integer getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }
}
