package br.com.flexbank.flexBankApi.domain;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Agencia {

    private Long id;

    private String numeroAgencia;

    @OneToOne
    private Endereco endereco;

    @OneToMany(mappedBy = "agencia")
    private ArrayList<Gerente> listaGerente;

    @OneToMany(mappedBy = "agencia")
    private ArrayList<Cliente> listaCliente;

    public Agencia(Long id, String agencia, Endereco endereco, ArrayList<Gerente> listaGerente, ArrayList<Cliente> listaCliente) {
        this.id = id;
        this.numeroAgencia = agencia;
        this.endereco = endereco;
        this.listaGerente = listaGerente;
        this.listaCliente = listaCliente;
    }
}
