package med.voll.api.domain.enderecos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(

        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,

        String complemento,

        @Pattern(regexp = "\\d{8}")
        String numero) {
}
