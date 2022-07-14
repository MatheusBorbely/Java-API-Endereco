package br.com.io.github.matheusborbely.service;

import br.com.io.github.matheusborbely.model.Endereco;
import br.com.io.github.matheusborbely.model.request.EnderecoRequest;
import br.com.io.github.matheusborbely.model.response.EnderecoResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

public interface EnderecoService {

    public Endereco adicionar(EnderecoRequest enderecoRequest);

}
