package br.com.flexbank.flexBankApi.domain;

import br.com.flexbank.flexBankApi.dto.CadastrarEndereco;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cep;

    private String logradouro;

    private String numero;

    private String bairro;

    private String localidade;


    public Endereco (String cep, String logradouro, String numero, String bairro, String localidade){
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.localidade = localidade;
    }

    public Endereco(CadastrarEndereco cadastrarEndereco) {
        this.cep = cadastrarEndereco.cep();
        this.logradouro = cadastrarEndereco.logradouro();
        this.numero = cadastrarEndereco.numero();
        this.bairro = cadastrarEndereco.bairro();
        this.localidade = cadastrarEndereco.localidade();
    }
}