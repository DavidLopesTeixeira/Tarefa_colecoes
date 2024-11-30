package br.com.davidlopes.models;

public class Pessoa implements Comparable<Pessoa> {
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

    @Override
    public int compareTo(Pessoa outraPessoa) {

        int comparacaoSobrenome = this.sobrenome.compareTo(outraPessoa.getSobrenome());

        if (comparacaoSobrenome != 0) {
            return comparacaoSobrenome;
        }

        return this.nome.compareTo(outraPessoa.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " " + sobrenome + ", Sexo: " + sexo;
    }

}
