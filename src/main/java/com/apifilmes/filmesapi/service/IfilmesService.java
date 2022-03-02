package com.apifilmes.filmesapi.service;

import com.apifilmes.filmesapi.entity.Filmes;

import java.util.List;

public interface IfilmesService {


    List<Filmes> add(Filmes filme);
    public List<Filmes> get();
    public void upDate(Filmes filme);
    public void delete(Integer id);

}
