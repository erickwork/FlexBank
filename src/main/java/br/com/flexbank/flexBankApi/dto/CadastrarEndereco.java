package br.com.flexbank.flexBankApi.dto;

import jakarta.validation.constraints.NotBlank;

public record CadastrarEndereco(

        @NotBlank
        String cep,

        @NotBlank
        String logradouro,

        @NotBlank
        String numero,

        @NotBlank
        String bairro,

        @NotBlank
        String localidade
){
}
