package mvvm.viewmodel;

import mvvm.model.Anime;

import java.util.ArrayList;
import java.util.List;

public class AnimeViewModel {

    private List<Anime> lista = new ArrayList<>();

    public void adicionarAnime(String nome, String genero, double nota){
        Anime anime = new Anime(nome, genero, nota);
        lista.add(anime);
    }

    public List<Anime> getLista(){
        return lista;
    }
}
