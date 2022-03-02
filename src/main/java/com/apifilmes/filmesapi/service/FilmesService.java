package com.apifilmes.filmesapi.service;

import com.apifilmes.filmesapi.entity.Filmes;
import com.apifilmes.filmesapi.repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class FilmesService {
    List<Filmes> filmes;
    FilmesService(){
        this.filmes = new ArrayList<>();
    }
    @Autowired
    private FilmesRepository filmesRepository;

    public List<Filmes> add(Filmes filme){
        return filmesRepository.add(filme);
    }

    public List<Filmes>get(){
        return filmesRepository.get();
    }

    public void upDate(Filmes filme){
        filmesRepository.upDate(filme);
    }

    public void delete(Integer id){
        filmesRepository.delete(id);
    }
}


