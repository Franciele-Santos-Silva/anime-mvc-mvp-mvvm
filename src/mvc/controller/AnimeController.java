package mvc.controller;

import mvc.model.Anime;
import mvc.view.AnimeView;

import java.util.ArrayList;
import java.util.List;

public class AnimeController {

    private List<Anime> lista = new ArrayList<>();
    private AnimeView view;

    public AnimeController(AnimeView view){
        this.view = view;
    }

    public void adicionarAnime(String nome, String genero, double nota){
        Anime anime = new Anime(nome, genero, nota);
        lista .add(anime);
        view.mostrarMensagem("Anime adicionado com sucesso.");
    }

    public void listarAnimes(){
        view.mostrarLista(lista);
    }
}