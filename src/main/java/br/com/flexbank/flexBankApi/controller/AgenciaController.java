package br.com.flexbank.flexBankApi.controller;

import br.com.flexbank.flexBankApi.domain.Agencia;
import br.com.flexbank.flexBankApi.dto.CadastrarAgencia;
import br.com.flexbank.flexBankApi.repository.AgenciaRepository;
import br.com.flexbank.flexBankApi.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agencia")
public class AgenciaController {

    @Autowired
    AgenciaRepository agenciaRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    @PostMapping
    public ResponseEntity<?> novaAgencia(@RequestBody CadastrarAgencia cadastrarAgencia) {
        agenciaRepository.save(new Agencia(cadastrarAgencia, enderecoRepository));
        return ResponseEntity.ok().build();
    }

}