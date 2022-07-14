package br.com.io.github.matheusborbely.shared;

import java.util.Arrays;
import java.util.List;

public class ErrorsMessages {

    List<String> erros;

    public ErrorsMessages(List<String> erros) {
        this.erros = erros;
    }

    public ErrorsMessages(String mensagemErro) {
        this.erros = Arrays.asList(mensagemErro);
    }

    public List<String> getErros() {
        return erros;
    }
}
