package mvp.view;

import mvp.model.Anime;

import java.util.List;

public class AnimeView {

    public void mostrarMenu(){
        System.out.println("\n=== ANIMES ===");
        System.out.println("1 - Adicionar anime");
        System.out.println("2 - Listar animes");
        System.out.println("0 - Sair");
        System.out.println("Escolha: ");
    }

    public void mostrarMensagem(String msg){
        System.out.println(msg);
    }

    public void mostrarLista(List<Anime> lista){
        System.out.println("\n=== LISTA DE ANIMES ===");
        for(Anime a : lista){
            System.out.println(a);
        }
    }
}
