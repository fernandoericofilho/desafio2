package org.dock.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pessoa")
@Entity(name = "pessoa")
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoa", columnDefinition = "serial", nullable = false, updatable = false)
    private Long id;

    @Column(name = "nome", nullable = false, updatable = false)
    private String nome;

    @Column(name = "cpf", nullable = false, updatable = false)
    private String cpf;

    @Column(name = "data_nascimento")
    private Instant dataNascimento;

}
