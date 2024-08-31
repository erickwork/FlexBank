package br.com.flexbank.flexBankApi.domain;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Gerente extends Pessoa{

    private Long id;

    private Date dataContratacao;

    @ManyToOne
    private Agencia agencia;

    public Gerente(Long id, String nome, String cpf, String celular, String email, Endereco endereco, Agencia agencia, boolean ativo, Date dataContratacao) {
        super(id, nome, cpf, celular, email, endereco, agencia, ativo);
        this.dataContratacao = dataContratacao;
    }

}