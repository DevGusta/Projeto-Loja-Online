package com.gustavonascimento.projetoLoja.services;

import com.gustavonascimento.projetoLoja.domain.Categoria;
import com.gustavonascimento.projetoLoja.domain.Cliente;
import com.gustavonascimento.projetoLoja.repositories.CategoriaRepository;
import com.gustavonascimento.projetoLoja.repositories.ClienteRepository;
import com.gustavonascimento.projetoLoja.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id +
                ",Tipo: " + Categoria.class.getName()));
    }
}
