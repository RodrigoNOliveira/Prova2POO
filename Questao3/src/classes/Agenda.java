package classes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Contato> lista = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Agenda() {
    }

    public void addContato() {
        int codigo = 0;
        System.out.print("Insira o codigo de identificação do contato: ");
        boolean valorInteiro = true;
        do {
            do {
                try {
                    codigo = scanner.nextInt();
                    scanner.nextLine();
                    valorInteiro = true;
                } catch (InputMismatchException e) {
                    System.out.print("\nOpção inválida! Digite um valor inteiro: ");
                    scanner.nextLine();
                    valorInteiro = false;
                }
            } while (valorInteiro == false);
        } while (verificaCdg(codigo) == false);

        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira o telefone: ");
        String tel = scanner.nextLine();
        System.out.print("Insira o email: ");
        String email = scanner.nextLine();
        Contato c1 = new Contato(codigo, nome, tel, email);
        lista.add(c1);
    }

    public Contato buscaContato() {
        int cdg = 0;
        boolean existe = false;
        System.out.print("Insira o código do contato: ");
        try {
            cdg = scanner.nextInt();
            scanner.nextLine();
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo() == cdg) {
                existe = true;
                return lista.get(i);
            }
        }
        if (existe == false) {
            System.out.println("Contato não encontrado");
        }
    } catch (InputMismatchException e) {
            System.out.print("\nOpção inválida! Digite um valor inteiro!\n");
            scanner.nextLine();
        }
        return null;
    }

    public void rmvContato() {
        if (lista.remove(buscaContato()) != false) {
            System.out.println("Contato removido com sucesso");
        }
    }

    public void attContato() {
        Contato c = buscaContato();
        if (c != null) {
            System.out.print("Novo nome: ");
            String nome = scanner.nextLine();
            c.setNome(nome);
            System.out.print("Novo telefone: ");
            String tel = scanner.nextLine();
            c.setTelefone(tel);
            System.out.print("Novo email: ");
            String email = scanner.nextLine();
            c.setEmail(email);
        }
    }

    private boolean verificaCdg(int c) {
        boolean validacao = true;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo() == c) {
                System.out.print("Codigo utilizado, insira outro: ");
                return false;
            }
        }
        return validacao;
    }

    public void iniciar() {
        int opcao = 0;
        do {

            System.out.println();
            System.out.println("------ Agenda Eletrônica ------");
            System.out.println();
            System.out.println("1- Adicionar Contato");
            System.out.println("2- Buscar contato");
            System.out.println("3- Remover contato");
            System.out.println("4- Editar contato");
            System.out.println("0- Sair");
            System.out.println();
            System.out.print("Insira a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    addContato();
                    break;
                case 2:
                    Contato teste = buscaContato();
                    if (teste != null) {
                        System.out.println(teste);
                    }
                    break;
                case 3:
                    rmvContato();
                    break;
                case 4:
                    attContato();
                    break;
                case 0:
                    System.out.println("Encerrando agenda");
                    break;
                default:
                    System.out.println("Opção inserida invalida");
                    break;

            }

        } while (opcao != 0);
    }

}
