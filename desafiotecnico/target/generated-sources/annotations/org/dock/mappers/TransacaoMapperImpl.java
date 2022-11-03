package org.dock.mappers;

import javax.annotation.processing.Generated;
import org.dock.dto.ContaDTO;
import org.dock.dto.PessoaDTO;
import org.dock.dto.TransacaoDTO;
import org.dock.entities.ContaEntity;
import org.dock.entities.PessoaEntity;
import org.dock.entities.TransacaoEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-03T19:24:41-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class TransacaoMapperImpl extends TransacaoMapper {

    @Override
    public TransacaoEntity toEntity(TransacaoDTO transacaoDTO) {
        if ( transacaoDTO == null ) {
            return null;
        }

        TransacaoEntity.TransacaoEntityBuilder transacaoEntity = TransacaoEntity.builder();

        transacaoEntity.id( transacaoDTO.getId() );
        transacaoEntity.conta( contaDTOToContaEntity( transacaoDTO.getConta() ) );
        transacaoEntity.valor( transacaoDTO.getValor() );
        transacaoEntity.dataTransacao( transacaoDTO.getDataTransacao() );

        return transacaoEntity.build();
    }

    @Override
    public TransacaoDTO toDTO(TransacaoEntity transacaoEntity) {
        if ( transacaoEntity == null ) {
            return null;
        }

        TransacaoDTO.TransacaoDTOBuilder transacaoDTO = TransacaoDTO.builder();

        transacaoDTO.id( transacaoEntity.getId() );
        transacaoDTO.conta( contaEntityToContaDTO( transacaoEntity.getConta() ) );
        transacaoDTO.valor( transacaoEntity.getValor() );
        transacaoDTO.dataTransacao( transacaoEntity.getDataTransacao() );

        return transacaoDTO.build();
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

    protected ContaEntity contaDTOToContaEntity(ContaDTO contaDTO) {
        if ( contaDTO == null ) {
            return null;
        }

        ContaEntity.ContaEntityBuilder contaEntity = ContaEntity.builder();

        contaEntity.id( contaDTO.getId() );
        contaEntity.pessoa( pessoaDTOToPessoaEntity( contaDTO.getPessoa() ) );
        contaEntity.saldo( contaDTO.getSaldo() );
        contaEntity.limiteSaqueDiario( contaDTO.getLimiteSaqueDiario() );
        contaEntity.ativo( contaDTO.getAtivo() );
        contaEntity.tipoConta( contaDTO.getTipoConta() );
        contaEntity.dataCriacao( contaDTO.getDataCriacao() );

        return contaEntity.build();
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

    protected ContaDTO contaEntityToContaDTO(ContaEntity contaEntity) {
        if ( contaEntity == null ) {
            return null;
        }

        ContaDTO.ContaDTOBuilder contaDTO = ContaDTO.builder();

        contaDTO.id( contaEntity.getId() );
        contaDTO.pessoa( pessoaEntityToPessoaDTO( contaEntity.getPessoa() ) );
        contaDTO.saldo( contaEntity.getSaldo() );
        contaDTO.limiteSaqueDiario( contaEntity.getLimiteSaqueDiario() );
        contaDTO.ativo( contaEntity.getAtivo() );
        contaDTO.tipoConta( contaEntity.getTipoConta() );
        contaDTO.dataCriacao( contaEntity.getDataCriacao() );

        return contaDTO.build();
    }
}
