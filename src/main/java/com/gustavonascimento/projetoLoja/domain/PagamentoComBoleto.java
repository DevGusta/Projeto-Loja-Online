package com.gustavonascimento.projetoLoja.domain;

import com.gustavonascimento.projetoLoja.domain.enums.EstadoPagamento;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class PagamentoComBoleto extends Pagamento {

    private Date dataVencimento;
    private Date dataPagamento;

    public PagamentoComBoleto(){}

    public PagamentoComBoleto(Integer id, Integer estadoPagamento, Pedido pedido, Date dataVencimento, Date dataPagamento) {
        super(id, estadoPagamento, pedido);
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
