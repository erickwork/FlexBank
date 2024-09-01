package br.com.flexbank.flexBankApi.domain;

import br.com.flexbank.flexBankApi.dto.CadastrarAgencia;
import br.com.flexbank.flexBankApi.repository.EnderecoRepository;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "agencia")
public class Agencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroAgencia;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
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


    public Agencia(CadastrarAgencia cadastrarAgencia, EnderecoRepository enderecoRepository) {
        this.numeroAgencia = cadastrarAgencia.numeroAgencia();
        this.endereco = enderecoRepository.save(new Endereco(cadastrarAgencia.cadastrarEndereco()));
    }
}
