package mvp;

import mvc.controller.AnimeController;
import mvc.view.AnimeView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        mvc.view.AnimeView view = new AnimeView();
        AnimeController controller = new AnimeController(view);

        int opcao;

        do {
            view.mostrarMenu();
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Gênero: ");
                    String genero = sc.nextLine();

                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();

                    controller.adicionarAnime(nome, genero, nota);
                    break;

                case 2:
                    controller.listarAnimes();
                    break;

                case 0:
                    view.mostrarMensagem("Saindo...");
                    break;

                default:
                    view.mostrarMensagem("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

