package com.gustavonascimento.projetoLoja.repositories;

import com.gustavonascimento.projetoLoja.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
