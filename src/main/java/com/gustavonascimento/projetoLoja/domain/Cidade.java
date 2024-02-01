package com.gustavonascimento.projetoLoja.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nome;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    public Cidade(){
    }

    public Cidade(Integer id, String nome, Estado estado) {
        this.id = id;
        Nome = nome;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return id.equals(cidade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
