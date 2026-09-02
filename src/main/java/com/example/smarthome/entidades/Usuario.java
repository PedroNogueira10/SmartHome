package com.example.smarthome.entidades;


import java.time.LocalDateTime;

public class Usuario {

    public Usuario(){
        this.id = 1L;
    }

    public Usuario(String nome, String CPF, String dataNascimento) {
        this.id = 1000L;
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    private Long id;
    private String nome;
    private String CPF;
    private String dataNascimento;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;
    private String status;

    public Long getId() {
        return this.id;
    }



    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getCPF() {
        return this.CPF;
    }
    public void setCPF(String cpf) {
        this.CPF = cpf;
    }



    public String getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
