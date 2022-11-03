package org.dock.mappers;

import javax.annotation.processing.Generated;
import org.dock.dto.PessoaDTO;
import org.dock.entities.PessoaEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-03T19:24:42-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class PessoaMapperImpl extends PessoaMapper {

    @Override
    public PessoaEntity toEntity(PessoaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PessoaEntity.PessoaEntityBuilder pessoaEntity = PessoaEntity.builder();

        pessoaEntity.id( dto.getId() );
        pessoaEntity.nome( dto.getNome() );
        pessoaEntity.cpf( dto.getCpf() );
        pessoaEntity.dataNascimento( dto.getDataNascimento() );

        return pessoaEntity.build();
    }

    @Override
    public PessoaDTO toDTO(PessoaEntity pessoaEntity) {
        if ( pessoaEntity == null ) {
            return null;
        }

        PessoaDTO.PessoaDTOBuilder pessoaDTO = PessoaDTO.builder();

        pessoaDTO.id( pessoaEntity.getId() );
        pessoaDTO.nome( pessoaEntity.getNome() );
        pessoaDTO.cpf( pessoaEntity.getCpf() );
        pessoaDTO.dataNascimento( pessoaEntity.getDataNascimento() );

        return pessoaDTO.build();
    }
}
