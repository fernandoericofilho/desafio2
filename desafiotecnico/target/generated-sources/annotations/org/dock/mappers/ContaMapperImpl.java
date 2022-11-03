package org.dock.mappers;

import javax.annotation.processing.Generated;
import org.dock.dto.ContaDTO;
import org.dock.dto.PessoaDTO;
import org.dock.entities.ContaEntity;
import org.dock.entities.PessoaEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-03T19:24:42-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class ContaMapperImpl extends ContaMapper {

    @Override
    public ContaEntity toEntity(ContaDTO ContaDTO) {
        if ( ContaDTO == null ) {
            return null;
        }

        ContaEntity.ContaEntityBuilder contaEntity = ContaEntity.builder();

        contaEntity.id( ContaDTO.getId() );
        contaEntity.pessoa( pessoaDTOToPessoaEntity( ContaDTO.getPessoa() ) );
        contaEntity.saldo( ContaDTO.getSaldo() );
        contaEntity.limiteSaqueDiario( ContaDTO.getLimiteSaqueDiario() );
        contaEntity.ativo( ContaDTO.getAtivo() );
        contaEntity.tipoConta( ContaDTO.getTipoConta() );
        contaEntity.dataCriacao( ContaDTO.getDataCriacao() );

        return contaEntity.build();
    }

    @Override
    public ContaDTO toDTO(ContaEntity ContaEntity) {
        if ( ContaEntity == null ) {
            return null;
        }

        ContaDTO.ContaDTOBuilder contaDTO = ContaDTO.builder();

        contaDTO.id( ContaEntity.getId() );
        contaDTO.pessoa( pessoaEntityToPessoaDTO( ContaEntity.getPessoa() ) );
        contaDTO.saldo( ContaEntity.getSaldo() );
        contaDTO.limiteSaqueDiario( ContaEntity.getLimiteSaqueDiario() );
        contaDTO.ativo( ContaEntity.getAtivo() );
        contaDTO.tipoConta( ContaEntity.getTipoConta() );
        contaDTO.dataCriacao( ContaEntity.getDataCriacao() );

        return contaDTO.build();
    }

    protected PessoaEntity pessoaDTOToPessoaEntity(PessoaDTO pessoaDTO) {
        if ( pessoaDTO == null ) {
            return null;
        }

        PessoaEntity.PessoaEntityBuilder pessoaEntity = PessoaEntity.builder();

        pessoaEntity.id( pessoaDTO.getId() );
        pessoaEntity.nome( pessoaDTO.getNome() );
        pessoaEntity.cpf( pessoaDTO.getCpf() );
        pessoaEntity.dataNascimento( pessoaDTO.getDataNascimento() );

        return pessoaEntity.build();
    }

    protected PessoaDTO pessoaEntityToPessoaDTO(PessoaEntity pessoaEntity) {
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
