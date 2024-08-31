package br.com.flexbank.flexBankApi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa {

    private int score;

    @ManyToOne
    @JoinColumn(name = "id_gerente")
    private Gerente gerente;

    private Date dataCriacao;

    public Cliente(Long id, String nome, String cpf, String celular, String email, Endereco endereco, Agencia agencia, boolean ativo, Gerente gerente, Date dataCriacao) {
        super(id, nome, cpf, celular, email, endereco, agencia, ativo);
        this.score = 500;
        this.gerente = gerente;
        this.dataCriacao = dataCriacao;
    }
}
