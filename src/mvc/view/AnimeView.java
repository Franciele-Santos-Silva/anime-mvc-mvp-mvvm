package mvc.view;

import mvc.model.Anime;
import java.util.List;

public class AnimeView{

    public void mostrarMenu(){
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Adicionar anime");
        System.out.println("2 - Listar animes");
        System.out.println("0 - Sair");
        System.out.println("Escolha: ");
    }

    public void mostrarAnime(Anime anime){
        System.out.println(anime);
    }

    public void mostrarLista(List<Anime> animes){
        if (animes.isEmpty()) {
            System.out.println("Nenhum anime cadastrado.");
        } else{
            System.out.println("\nLista de animes.");
            for(Anime anime : animes){
                System.out.println(anime);
            }
        }
    }

    public void mostrarMensagem(String msg){
        System.out.println(msg);
    }
}