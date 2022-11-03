package org.dock.mappers;

import lombok.NonNull;
import org.dock.dto.PessoaDTO;
import org.dock.entities.PessoaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PessoaMapper {

    public abstract PessoaEntity toEntity(@NonNull PessoaDTO dto);
    public abstract PessoaDTO toDTO(@NonNull PessoaEntity pessoaEntity);

}

