package DTO;

import com.example.smarthome.entidades.Comodo;

public class RotinaRequest {

    public RotinaRequest(){}

    private String nome;
    private Comodo comodo;
    private String status;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }



    public Comodo getComodo(){
        return this.comodo;
    }
    public void setComodo(Comodo comodo){
        this.comodo = comodo;
    }



    public String getStatus(){
        return this.status;
    }
    public void setStatus(String status){
        this.status = status;
    }


}
