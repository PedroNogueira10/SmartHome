package DTO;

import com.example.smarthome.entidades.Comodo;

public class ComodoResponse {

    public ComodoResponse(){}

    public ComodoResponse(Long id, String mensagem){
        this.id = id;
        this.mensagem = mensagem;
    }

    private Long id;
    private String mensagem;

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }


    public String getMensagem(){
        return this.mensagem;
    }
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

}
