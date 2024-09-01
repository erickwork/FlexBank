package br.com.flexbank.flexBankApi.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record CadastrarAgencia(

        @NotBlank
        String numeroAgencia,

        @Valid
        CadastrarEndereco cadastrarEndereco
) {

}
