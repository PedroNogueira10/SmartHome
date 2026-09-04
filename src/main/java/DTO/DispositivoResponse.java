package DTO;

public class DispositivoResponse {

    public DispositivoResponse(){}

    private Long id;
    private String mensagem;

    public DispositivoResponse(Long id, String mensagem){
        this.id = id;
        this.mensagem = mensagem;
    }

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
