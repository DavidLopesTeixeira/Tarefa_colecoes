package br.com.davidlopes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //TODO trabalhar com interfaces
        //TODO ler do console nome, sobrenome, sexo
        // TODO Separar o nome e sobrenome por virgula
        //TODO organizar o nome por ordem alfabetica
        //TODO parte 2 separar as respostar por generos

        solicitaInfos();
    }

    private static void solicitaInfos() {
        Scanner scan = new Scanner(System.in);
        String dados;
        boolean isCompleted = false;
        boolean dadosValidos = false;
        int opcao;

        System.out.println("Seja bem-vindo!");

        do {
            try {

                System.out.println("Selecione uma opção:");
                System.out.println("Opção 1 - Cadastrar pessoa.");
                System.out.println("Opção 2 - Exibir pessoas cadastradas.");
                System.out.println("Opção 3 - Sair");

                if (scan.hasNextInt()) {
                    opcao = scan.nextInt();
                    scan.nextLine();
                    switch (opcao) {
                        case 1:
                            System.out.println("OK,você selecionou a op 1 cadastrar uma pessoa!");
                            System.out.println("Digite o nome, sobrenome e sexo separados por um espaço");

                            while (!dadosValidos) {
                                dados = scan.nextLine();
                                System.out.println("Você digitou: " + dados);
                                System.out.println("Verifique se os dados estão corretos, digite S para confirmar ou N para corrigir.");
                                String correto = scan.nextLine().toUpperCase();
                                if (correto.equals("S")) {
                                    dadosValidos = true;
                                } else if (correto.equals("N")) {
                                    System.out.println("OK, vamoos corrigir as informações");
                                    System.out.println("Digite o nome, sobrenome e sexo separados por um espaço");
                                } else {
                                    System.out.println("Entrada inválida. Digite S para confirmar ou N para corrigir.");
                                }
                            }
                            break;

                        case 2:
                            System.out.println("OK, você selecionou a op 2 Exibir pessoas cadastradas!");
                            // TODO Desenvolver a logica para exibir e separar as pessoas por grupos M ou F
                            isCompleted = false;
                            break;

                        case 3:
                            System.out.println("OK, você selecionou a op 3 sair do programa");
                            scan.close();
                            isCompleted = true;
                    }

                } else {
                    System.out.println("Entrada inválida. Apenas números são permitidos.");
                    scan.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Erro ao processar a entrada. Tente novamente.");
                scan.nextLine();
            }

        } while (!isCompleted);

    }
}
