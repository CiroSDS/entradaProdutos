package models;

import java.util.List;
import java.util.Scanner;

import db.ProdutosDB;
import db.UsuarioDB;
import user.Cliente;
import user.Usuario;
import user.Admin;

public class ProdutosMain {
    static ProdutosDB produtosDB = new ProdutosDB();
    static UsuarioDB usuarioDB = new UsuarioDB();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("<GARIBALDI EQUIPAMENTOS>");
        System.out.println("Soliciatção de produtos");
        int opcao;
        do {
            System.out.println("1- cadastrar produtos");
            System.out.println("2-listar produtos");
            System.out.println("3- Cadastrar Administrador");
            System.out.println("4- Cadastrar Clientes");
            System.out.println("5- Listar Usuarios");
            System.out.println("6-Listar Usuario/Produtos");
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
            case 2: {
                List<Produtos> produtosList = produtosDB.getProdutosList();
                for (Produtos produtos : produtosList) {
                    System.out.println("-----------PRODUTOS--------------------");
                    System.out.println("Tipo: " + produtos.getTipo());
                    System.out.println("Marca: " + produtos.getMarca());
                    System.out.println("Modelo: " + produtos.getModelo());
                    System.out.println("Id: " + produtos.getId());
                    System.out.println("-----------------");
                    System.out.println("=====================================");
                }
                break;
            }
            case 3: {
                System.out.println("Digite o nome do ADM:");

                String nome = scan.nextLine();
                Admin novoAdmin = new Admin(nome);
                usuarioDB.addNovoUsuario(novoAdmin);

                break;
            }
            case 4: {
                System.out.println("Digite o nome do Cliente:");

                String nome = scan.nextLine();
                Cliente noCliente = new Cliente(nome);
                usuarioDB.addNovoUsuario(noCliente);
                break;
            }
            case 5: {
                for (Usuario usuario : usuarioDB.getUsuarioList()) {
                    System.out.println("----------USUARIO--------------------");
                    System.out.println("---ID: " + usuario.getId());
                    System.out.println("---NOME: " + usuario.getNome());
                    System.out.println("---TIPO: " + usuario.getTipoUsuario());
                    System.out.println("=====================================");
                }
                break;
            }
            case 6: {
                List<Produtos> produtosList = produtosDB.getProdutosList();
                for (Produtos produtos : produtosList) {
                    System.out.println("-----------PRODUTOS--------------------");
                    System.out.println("Tipo: " + produtos.getTipo());
                    System.out.println("Marca: " + produtos.getMarca());
                    System.out.println("Modelo: " + produtos.getModelo());
                    System.out.println("Id: " + produtos.getId());
                    System.out.println("-----------------");
                    System.out.println("=====================================");
                }
                for (Usuario usuario : usuarioDB.getUsuarioList()) {
                    System.out.println("----------USUARIO--------------------");
                    System.out.println("---ID: " + usuario.getId());
                    System.out.println("---NOME: " + usuario.getNome());
                    System.out.println("---TIPO: " + usuario.getTipoUsuario());
                    System.out.println("=====================================");
                }
                break;
            }
        }
    }
}
