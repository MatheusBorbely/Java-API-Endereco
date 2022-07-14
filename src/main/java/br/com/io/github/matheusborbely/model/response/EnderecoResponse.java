package br.com.io.github.matheusborbely.model.response;

import br.com.io.github.matheusborbely.model.Endereco;

import java.util.UUID;

public class EnderecoResponse {

    private UUID id;
    private String cep;
    private Integer numero;
    private String logradouro;
    private String uf;

    public EnderecoResponse(Endereco endereco){
        this.id = endereco.getId();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.logradouro = endereco.getLogradouro();
        this.uf = endereco.getUf();
    }

    public UUID getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getUf() {
        return uf;
    }
}
