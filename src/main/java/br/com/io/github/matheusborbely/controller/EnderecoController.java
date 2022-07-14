package br.com.io.github.matheusborbely.controller;

import br.com.io.github.matheusborbely.model.Endereco;
import br.com.io.github.matheusborbely.model.dto.EnderecoDto;
import br.com.io.github.matheusborbely.model.request.EnderecoRequest;
import br.com.io.github.matheusborbely.model.response.EnderecoResponse;
import br.com.io.github.matheusborbely.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import java.net.URI;


@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @PostMapping
    public ResponseEntity<EnderecoResponse> salvar(@RequestBody  @Valid EnderecoRequest enderecoRequest,
                                                   UriComponentsBuilder uriBuilder){

        Endereco endereco =  enderecoService.adicionar(enderecoRequest);

        entityManager.persist(endereco);

        URI uri = uriBuilder.path("/enderecos/{id}").buildAndExpand(endereco.getId()).toUri();

        return ResponseEntity.created(uri).body(new EnderecoResponse(endereco));

    }

}
