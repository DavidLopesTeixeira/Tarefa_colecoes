package br.com.davidlopes.models;

public class Pessoa {
    String nome;
    String sobrenome;
    String sexo;


    public Pessoa(String nome, String sobrenome, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}