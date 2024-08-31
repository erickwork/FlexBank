package br.com.flexbank.flexBankApi.domain;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {

    private Long id;

    private String nome;

    private String cpf;

    private String celular;

    private String email;

    @OneToOne
    private Endereco endereco;

    @ManyToOne
    private Agencia agencia;

    private boolean ativo;


    public Pessoa(Long id, String nome, String cpf, String celular, String email, Endereco endereco, Agencia agencia, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.agencia = agencia;
        this.ativo = ativo;
    }

}