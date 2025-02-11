import mathelper1.Mathelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Mathelper calculadora = new Mathelper();

        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Próximo número");
            System.out.println("2 - Juntar nome e apelido");
            System.out.println("3 - Maior número");
            System.out.println("4 - Soma dos números");
            System.out.println("5 - Média dos números");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Escreva um número: ");
                    int numero = scanner.nextInt();
                    System.out.println("O próximo número é: " + calculadora.numeroSeguinte(numero));
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Escreva o primeiro nome:\n");
                    String nome = scanner.nextLine();
                    System.out.print("Escreva o apelido:\n");
                    String apelido = scanner.nextLine();
                    System.out.println("Nome completo: " + calculadora.juntarNome(nome, apelido));
                    break;

                case 3:
                    System.out.print("Quantos números deseja inserir? ");
                    int tamanho = scanner.nextInt();
                    int[] numeros = new int[tamanho];

                    System.out.println("Escreva os números:");
                    for (int i = 0; i < tamanho; i++) {
                        numeros[i] = scanner.nextInt();
                    }

                    System.out.println("O maior número é: " + calculadora.maior(numeros));
                    break;

                case 4:
                    System.out.print("Quantos números deseja inserir? ");
                    tamanho = scanner.nextInt();
                    numeros = new int[tamanho];

                    System.out.println("Escreva os números:");
                    for (int i = 0; i < tamanho; i++) {
                        numeros[i] = scanner.nextInt();
                    }

                    System.out.println("A soma dos números é: " + calculadora.soma(numeros));
                    break;

                case 5:
                    System.out.print("Quantos números deseja inserir? ");
                    tamanho = scanner.nextInt();
                    double[] numerosV = new double[tamanho];

                    System.out.println("Escreva os números:");
                    for (int i = 0; i < tamanho; i++) {
                        numerosV[i] = scanner.nextDouble();
                    }

                    System.out.println("A média dos números é: " + calculadora.media(numerosV));
                    break;

                case 0:
                    System.out.println("A sair...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
