package org.dock.controllers;

import lombok.RequiredArgsConstructor;
import org.dock.dto.ContaDTO;
import org.dock.services.ContaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/contas")
@RequiredArgsConstructor
public class ContaController {

    private final ContaService contaService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Long save(@RequestBody final ContaDTO contaDTO) {
        return contaService.salvar(contaDTO);
    }

    @PutMapping("{contaId}/adicionar/{valorAdicionado}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void adicionaSaldo(@PathVariable("contaId") final Long contaId,
                              @PathVariable("valorAdicionado") final BigDecimal valorAdicionado) {
        contaService.adicionarSaldo(contaId, valorAdicionado);
    }

    @GetMapping("{contaId}/saldo")
    @ResponseStatus(code = HttpStatus.OK)
    public BigDecimal consultaSaldo(@PathVariable("contaId") final Long contaId) {
        return contaService.consultarSaldo(contaId);
    }

    @PutMapping("{contaId}/resgatar/{valorSacado}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void sacarSaldo(@PathVariable("contaId") final Long contaId,
                           @PathVariable("valorSacado") final BigDecimal valorSacado) {
        contaService.sacarSaldo(contaId, valorSacado);
    }

    @PutMapping("{contaId}/status/{statusConta}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void alterarStatusConta(@PathVariable("contaId") final Long contaId,
                                   @PathVariable("statusConta") final Boolean statusConta) {
        contaService.alterarStatusConta(contaId, statusConta);
    }
}
