package mvvm;

import mvvm.view.AnimeView;
import mvvm.viewmodel.AnimeViewModel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AnimeView view = new AnimeView();
        AnimeViewModel viewModel = new AnimeViewModel();

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

                    viewModel.adicionarAnime(nome, genero, nota);
                    view.mostrarMensagem("Anime adicionado com sucesso.");
                    break;

                case 2:
                    view.mostrarLista(viewModel.getLista());
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
