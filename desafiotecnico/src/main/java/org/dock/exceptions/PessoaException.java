package org.dock.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PessoaException extends RuntimeException {

    public PessoaException(final String message) {
        super(message);
    }
}
