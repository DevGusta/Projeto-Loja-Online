package com.gustavonascimento.projetoLoja.repositories;

import com.gustavonascimento.projetoLoja.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer> {
}
