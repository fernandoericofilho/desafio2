package org.dock.filters;

import lombok.NonNull;
import org.dock.dto.PessoaDTO;

public interface PessoaFilter {
    boolean filter(@NonNull PessoaDTO pessoaDTO);
}
