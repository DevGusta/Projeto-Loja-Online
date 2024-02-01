package com.gustavonascimento.projetoLoja.resources;

import com.gustavonascimento.projetoLoja.domain.Categoria;
import com.gustavonascimento.projetoLoja.domain.Cliente;
import com.gustavonascimento.projetoLoja.services.CategoriaService;
import com.gustavonascimento.projetoLoja.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResourse {

    @Autowired
    private ClienteService service;

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Cliente obj = service.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
}
