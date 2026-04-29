package mvp.presenter;

import mvp.model.Anime;
import mvp.view.AnimeView;

import java.util.ArrayList;
import java.util.List;

public class AnimePresenter {

    private List<Anime> lista = new ArrayList<>();
    private AnimeView view;

    public AnimePresenter(AnimeView view){
        this.view = view;
    }

    public void adicionarAnime(String nome, String genero, double nota){
        Anime anime = new Anime(nome, genero, nota);
        lista.add(anime);
        view.mostrarMensagem("Anime adicionado com sucesso.");
    }

    public void listarAnimes(){
        view.mostrarLista(lista);
    }
}
