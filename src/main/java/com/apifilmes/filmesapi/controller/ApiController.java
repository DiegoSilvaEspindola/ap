package com.apifilmes.filmesapi.controller;

import com.apifilmes.filmesapi.entity.Filmes;
import com.apifilmes.filmesapi.service.IfilmesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
@RestController
public class ApiController {

    public List<Filmes> filmes;
    ApiController(){
        this.filmes = new ArrayList<>();
    }
    @Autowired
    IfilmesService filmesService;

    @PostMapping
    public List<Filmes> post(Filmes filme){
        return filmesService.add(filme);
    }

    @GetMapping
    public List<Filmes> get(){

        return filmesService.get() ;
    }

    @PutMapping
    public void put(Filmes filme){
        filmesService.upDate(filme);
    }

    @DeleteMapping
    public void delete(Integer id){
        filmesService.delete(id);
    }
}
