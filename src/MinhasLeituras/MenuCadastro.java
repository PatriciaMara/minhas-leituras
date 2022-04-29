package MinhasLeituras;

// Um programa para cadastrar avalia��es de livros que j� li.
// Onde posso cadastrar e, tamb�m, visualizar as avalia��es que j� fiz.


import java.util.ArrayList;
import java.util.Scanner;


public class MenuCadastro extends Cadastro {
    Scanner ent = new Scanner(System.in);
    int opcao;

    ArrayList<Cadastro> listaCadastro = new ArrayList<>();
    Cadastro cadastro = new Cadastro();

    public void menuCadastrarAvaliacao() {

        opcao = 0;
        while (opcao != 3) {
            System.out.println("##---CADASTRAR AVALIA��O---##\n\n");
            System.out.println("|----------------------------|");
            System.out.println("| 1 - Cadastrar Avalia��o    |");
            System.out.println("| 2 - Minhas Avalia��es      |");
            System.out.println("| 3 - Sair                   |");
            System.out.println("|----------------------------|");
            System.out.println("Digite uma opcao: ");
            opcao = ent.nextInt();
            this.clearBuffer(ent);

            switch (opcao) {

                case 1:
                    Cadastro cadastro = new Cadastro();
                    System.out.println("Nome do Livro:");
                    cadastro.setNomeDoLivro(ent.nextLine());
                    System.out.println("Autor do Livro:");
                    cadastro.setAutor(ent.nextLine());
                    System.out.println("Estilo Literario:");
                    cadastro.setEstiloLiterario(ent.nextLine());
                    System.out.println("Editora:");
                    cadastro.setEditora(ent.nextLine());
                    System.out.println("Data de Leitura:");
                    cadastro.setDataLeitura(ent.nextLine());
                    System.out.println("Avaliacao do Livro:");
                    cadastro.setAvaliacao(ent.nextLine());

                    listaCadastro.add(cadastro);
                    break;
                case 2:
                	for (int i = 0; i <= listaCadastro.size() - 1; i = i+1) {
                        System.out.println("Nome do Livro " + listaCadastro.get(i).getNomeDoLivro());
                        System.out.println("Nome do Autor: " + listaCadastro.get(i).getAutor());
                        System.out.println("Estilo Literario: " + listaCadastro.get(i).getEstiloLiterario());
                        System.out.println("Editora: " + listaCadastro.get(i).getEditora());
                        System.out.println("Data da Leitura: " + listaCadastro.get(i).getDataLeitura());
                        System.out.println("Avaliacao do Livro: " + listaCadastro.get(i).getAvaliacao());
                        System.out.println("----------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Ate logo!!!");
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        }

    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}