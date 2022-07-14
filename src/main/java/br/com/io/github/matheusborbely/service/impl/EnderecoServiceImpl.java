package br.com.io.github.matheusborbely.service.impl;

import br.com.io.github.matheusborbely.model.Endereco;
import br.com.io.github.matheusborbely.model.dto.EnderecoDto;
import br.com.io.github.matheusborbely.model.request.EnderecoRequest;
import br.com.io.github.matheusborbely.service.EnderecoService;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Service
public class EnderecoServiceImpl implements EnderecoService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Endereco adicionar(EnderecoRequest enderecoRequest) {

        RestTemplate restTemplate = new RestTemplateBuilder()
                .rootUri("https://viacep.com.br/ws").build();

        EnderecoDto enderecoDto = restTemplate.getForObject("/{cep}/json/", EnderecoDto.class, enderecoRequest.getCep());

        return enderecoDto.build(enderecoRequest);


    }
}
