package br.com.io.github.matheusborbely.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(length = 8)
    private String cep;
    private Integer numero;
    private String logradouro;
    private String uf;

    @Deprecated
    public Endereco() {
    }

    public Endereco(String cep, Integer numero, String logradouro, String uf) {
        this.cep = cep;
        this.numero = numero;
        this.logradouro = logradouro;
        this.uf = uf;
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








/*
 {
         "cep": "01001-000",
         "logradouro": "Praça da Sé",
         "complemento": "lado ímpar",
         "bairro": "Sé",
         "localidade": "São Paulo",
         "uf": "SP",
         "ibge": "3550308",
         "gia": "1004",
         "ddd": "11",
         "siafi": "7107"
         } */