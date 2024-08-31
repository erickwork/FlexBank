package br.com.flexbank.flexBankApi.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "gerente")
public class Gerente extends Pessoa{

    @Id
    @Column(name = "id")
    private Long idPessoa;

    private Date dataContratacao;

    @ManyToOne
    private Agencia agencia;

    public Gerente(Long id, String nome, String cpf, String celular, String email, Endereco endereco, Agencia agencia, boolean ativo, Date dataContratacao) {
        super(id, nome, cpf, celular, email, endereco, agencia, ativo);

        this.dataContratacao = dataContratacao;
    }

}