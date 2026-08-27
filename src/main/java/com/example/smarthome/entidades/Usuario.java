package com.example.smarthome.entidades;


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



}
