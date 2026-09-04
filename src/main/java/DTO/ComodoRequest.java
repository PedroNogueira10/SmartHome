package DTO;

public class ComodoRequest {

    public ComodoRequest(){}

    private String nome;
    private String categoria;

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
}
