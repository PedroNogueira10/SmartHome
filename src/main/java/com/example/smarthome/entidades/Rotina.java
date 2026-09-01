package com.example.smarthome.entidades;

import org.springframework.cglib.core.Local;

import java.time.LocalTime;

public class Rotina {

    public Rotina(String nome, LocalTime horario) {
        this.id = 1L;
        this.nome = nome;
        this.horario = horario;
    }

    private Long id;
    private String nome;
    private LocalTime horario;


    public Long getId() {
        return this.id;
    }



    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }



    public LocalTime getHorario(){
        return this.horario;
    }
    public void setHorario(LocalTime horario){
        this.horario = horario;
    }
}
