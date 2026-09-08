package com.example.smarthome.entidades;

import org.springframework.cglib.core.Local;

import java.time.LocalTime;

public class Rotina {

    public Rotina(){}

    public Rotina(String nome, Comodo comodo, String status) {
        this.id = 1L;
        this.nome = nome;
        this.comodo = comodo;
        this.status = status;
    }

    private Long id;
    private String nome;
    private Comodo comodo;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    public Comodo getComodo() {
        return comodo;
    }
    public void setComodo(Comodo comodo) {
        this.comodo = comodo;
    }



    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }



}
