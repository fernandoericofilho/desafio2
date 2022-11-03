package org.dock.dto;

import lombok.*;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PessoaDTO {

    private Long id;
    private String nome;
    private String cpf;
    private Instant dataNascimento;

}
