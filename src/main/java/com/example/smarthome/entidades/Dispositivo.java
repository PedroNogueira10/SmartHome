package com.example.smarthome.entidades;

public class Dispositivo {

    public Dispositivo(){
        this.id = 1L;
    }

    public Dispositivo(String nome, String categoria, Boolean status, Boolean conexao, double consumoWatts){
        this.id = 1000L;
        this.nome = nome;
        this.categoria = categoria;
        this.status = status;
        this.conexao = conexao;
        this.consumoWatts = consumoWatts;
    }

    private Long id;
    private String nome;
    private String categoria;
    private Boolean status;
    private Boolean conexao;
    private double consumoWatts;





    public Long getId(){
        return this.id;
    }


    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }



    public String getCategoria(){
        return this.categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }



    public Boolean getStatus() {
        return this.status;
    }
    public void setStatus(Boolean status){
        this.status = status;
    }



    public Boolean getConexao(){
        return this.conexao;
    }
    public void setConexao(Boolean conexao){
        this.conexao = conexao;
    }



    public double getConsumoWatts(){
        return this.consumoWatts;
    }
    public void setConsumoWatts(double consumoWatts){
        this.consumoWatts = consumoWatts;
    }

}

