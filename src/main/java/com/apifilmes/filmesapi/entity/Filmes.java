package com.apifilmes.filmesapi.entity;

public class Filmes {

    private Integer id;
    private Integer nota;
    private String nome;
    private String nomeDiretor;
    private String ano;

    public Filmes(){
    }

    public Filmes(Integer id, Integer nota, String nome, String nomeDiretor, String ano) {
        this.id = id;
        this.nota = nota;
        this.nome = nome;
        this.nomeDiretor = nomeDiretor;
        this.ano = ano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "id=" + id +
                ", nota=" + nota +
                ", nome='" + nome + '\'' +
                ", nomeDiretor='" + nomeDiretor + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
