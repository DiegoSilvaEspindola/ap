package com.apifilmes.filmesapi.repository;

import com.apifilmes.filmesapi.entity.Filmes;
import com.apifilmes.filmesapi.service.IfilmesService;

import java.util.ArrayList;
import java.util.List;

public class FilmesRepository implements IfilmesService {

    List<Filmes> filmes;
    FilmesRepository(){
        this.filmes = new ArrayList<>();
    }

    @Override
    public List<Filmes> add(Filmes filme) {
        if(filmes.equals(filme) || filme.getNota() > 5 || filme.getNota()<1){
            return null;
        }else{
            filmes.add(filme);
            return null;
        }
    }

    @Override
    public List<Filmes> get() {
        return filmes;
    }

    @Override
    public void upDate(Filmes filme) {
        filmes.stream().forEach(f->f.setId(filme.getId()));
        filmes.stream().forEach(f->f.setAno(filme.getAno()));
        filmes.stream().forEach(f->f.setNome(filme.getNome()));
        filmes.stream().forEach(f->f.setNomeDiretor(filme.getNomeDiretor()));
        filmes.stream().forEach(f->f.setNota(filme.getNota()));


    }

    @Override
    public void delete(Integer id) {
        filmes.stream().filter(f->f.getId().equals(id));
        filmes.remove(id);
    }
}
