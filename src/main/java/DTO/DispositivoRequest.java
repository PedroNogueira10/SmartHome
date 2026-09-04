package DTO;

import com.example.smarthome.entidades.Dispositivo;

public class DispositivoRequest {

    public DispositivoRequest(){}

    private String nome;
    private String categoria;
    private Boolean status;
    private Boolean conexao;
    private double consumoWatts;

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


    public Boolean getStatus(){
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
