package org.dock.mappers;

import lombok.NonNull;
import org.dock.dto.TransacaoDTO;
import org.dock.entities.TransacaoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TransacaoMapper {

    public abstract TransacaoEntity toEntity(@NonNull TransacaoDTO transacaoDTO);
    public abstract TransacaoDTO toDTO(@NonNull TransacaoEntity transacaoEntity);

}

