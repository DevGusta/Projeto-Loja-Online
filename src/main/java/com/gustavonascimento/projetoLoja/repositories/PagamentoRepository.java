package com.gustavonascimento.projetoLoja.repositories;

import com.gustavonascimento.projetoLoja.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Integer> {
}
