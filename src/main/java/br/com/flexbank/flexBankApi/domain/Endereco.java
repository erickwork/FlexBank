package br.com.flexbank.flexBankApi.domain;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Endereco {

    private Long id;

    private String cep;

    private String logradouro;

    private String numero;

    private String bairro;

    private String localidade;


    public Endereco (long id, String cep, String logradouro, String numero, String bairro, String localidade){
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.localidade = localidade;
    }

}