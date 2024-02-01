package com.gustavonascimento.projetoLoja.repositories;

import com.gustavonascimento.projetoLoja.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {
}
