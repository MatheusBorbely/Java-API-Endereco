package br.com.io.github.matheusborbely.model.dto;

import br.com.io.github.matheusborbely.model.Endereco;
import br.com.io.github.matheusborbely.model.request.EnderecoRequest;

public class EnderecoDto {

    private String cep;
    private String logradouro;
    private String uf;

    @Deprecated
    public EnderecoDto() {
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getUf() {
        return uf;
    }

    public Endereco build(EnderecoRequest enderecoRequest){
      return   new Endereco( enderecoRequest.getCep().replaceAll("\\p{Punct}", ""),
                enderecoRequest.getNumero(),
                this.logradouro,
                this.getUf());
    }
}
