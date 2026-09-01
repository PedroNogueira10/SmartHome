package com.example.smarthome.entidades;

public class Comodo {

    public Comodo(String nome, String categoria){
        this.id = 1L;
        this.nome = nome;
        this.categoria = categoria;
    }

    private Long id;
    private String nome;
    private String categoria;


    public Long getId() {
        return this.id;
    }



    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCategoria() {
        return this.categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
