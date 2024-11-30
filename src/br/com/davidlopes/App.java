package br.com.davidlopes;

import br.com.davidlopes.models.Pessoa;

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
                                    //TODO criar o obj Pessoa
                                    String[] dadosSeparados = dados.split(" ");
                                    if (dadosSeparados.length == 3) {
                                        String nome = dadosSeparados[0];
                                        String sobrenome = dadosSeparados[1];
                                        String sexo = dadosSeparados[2].toLowerCase();

                                        if (!nome.isEmpty() || !sobrenome.isEmpty() || !sexo.isEmpty()) {
                                            Pessoa pessoa = new Pessoa(nome, sobrenome, sexo);
                                            tratarGeneros(pessoa);
                                            dadosValidos = true;
                                        }
                                    } else {
                                        System.out.println("Você precisa preencher todas as informações solicitadas.");
                                    }


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

    private static void tratarGeneros(Pessoa pessoa) {
        System.out.println("Pessoa nome: " + pessoa.getNome() + " sobrenome: " + pessoa.getSobrenome() + " sexo: " + pessoa.getSexo());
        String sexo = pessoa.getSexo().toLowerCase();
        switch (sexo) {
            case "masculino":
            case "homem":
            case "m":
                pessoa.setSexo("m");
                break;

            case "feminino":
            case "mulher":
            case "f":
                pessoa.setSexo("f");
                break;
            default:
                System.out.println("Não identifiquei seu sexo, tente novamente.");
                return;
        }
        System.out.println("Sexo -> " + pessoa.getSexo());
    }
}
