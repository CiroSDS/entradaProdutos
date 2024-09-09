import java.util.List;
import java.util.Scanner;

public class ProdutosMain {
    static ProdutosDB produtosDB = new ProdutosDB();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("<GARIBALDI EQUIPAMENTOS>");
        System.out.println("Soliciatção de produtos");
        int opcao;
        do {
            System.out.println("1- cadastrar produtos");
            System.out.println("2-listar produtos");
            System.out.println("0 -sair");

            opcao = scan.nextInt();
            processar(opcao);
        } while (opcao != 0);

    }

    public static void processar(int opcao) {
        Scanner scan = new Scanner(System.in);
        switch (opcao) {
            case 0: {
                System.out.println("Obrigado, volte sempre");
                System.out.println("Saindo...");
                break;
            }
            case 1: {
                System.out.println("Digite as caracteristicas do produto:");

                System.out.print("Tipo: ");
                String tipo = scan.nextLine();

                System.out.print("Marca: ");
                String marca = scan.nextLine();

                System.out.print("Modelo: ");
                String modelo = scan.nextLine();

                System.out.print("Id: ");
                int id = scan.nextInt();

                Produtos pProdutos = new Produtos(tipo, modelo, marca, id);
                produtosDB.addNovoProduto(pProdutos);

                break;
            }
            case 2:{
                List<Produtos>produtosList = produtosDB.getProdutosList();
                for(Produtos produtos:produtosList){

                    System.out.println("Tipo: "+produtos.getTipo());
                    System.out.println("Marca: "+produtos.getMarca());
                    System.out.println("Modelo: "+produtos.getModelo());
                    System.out.println("Id: "+produtos.getId());
                    System.out.println("-----------------");
                }
                break;
            }
        }
    }
}
// private String tipo;
// private String marca;
// private String modelo;
// private int id;
