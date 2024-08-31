package br.com.flexbank.flexBankApi.domain;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Cliente extends Pessoa{

    private Long id;

    private int score;

    @ManyToOne
    private Gerente gerente;

    private Date dataCriacao;

    public Cliente(Long id, String nome, String cpf, String celular, String email, Endereco endereco, Agencia agencia, boolean ativo, int score, Gerente gerente, Date dataCriacao) {
        super(id, nome, cpf, celular, email, endereco, agencia, ativo);
        this.score = score;
        this.gerente = gerente;
        this.dataCriacao = dataCriacao;
    }

}