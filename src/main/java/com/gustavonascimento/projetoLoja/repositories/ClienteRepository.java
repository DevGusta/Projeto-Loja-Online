package com.gustavonascimento.projetoLoja.repositories;

import com.gustavonascimento.projetoLoja.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
