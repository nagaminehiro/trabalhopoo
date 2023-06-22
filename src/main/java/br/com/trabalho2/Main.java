package br.com.trabalho2;



import br.com.trabalho2.controller.Simulador;
import br.com.trabalho2.util.CommonVeiculos;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Simulador simulador = new Simulador();

        // Loop principal do programa
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    // Adicionar o veículo ao simulador
                    System.out.println("== Incluir Veículo ==");
                    simulador.incluirVeiculo(); // OK
                    break;
                }

                case 2: {   // Remover um veículo do simulador
                    System.out.println("== Remover Veículo ==");
                    System.out.print("Informe o ID do veículo a ser removido: ");
                    int idVeiculo = scanner.nextInt();
                    simulador.removerVeiculo(idVeiculo);// OK
                    break;
                }

                case 3: {// Abastecer um veículo do simulador
                    System.out.println("== Abastecer Veículo ==");
                    System.out.print("Informe o ID do veículo a ser abastecido: ");
                    int idVeiculo = scanner.nextInt();
                    simulador.abastecerVeiculo(idVeiculo); // OK
                    break;
                }

                case 4: {
                    // Movimentar um veículo específico
                    System.out.println("== Movimentar Veículo Específico ==");
                    System.out.print("Informe o ID do veículo a ser movimentado: ");
                    int idVeiculo = scanner.nextInt();
                    simulador.movimentarVeiculoEspecifico();

                    break;
                }

                case 5: {
                    // Movimentar veículos por tipo
                    System.out.println("== Movimentar Veículos por tipo ==");
                    simulador.movimentarVeiculosPorTipo();
                    break;
                }
                case 6: {// Movimentar todos os veículos
                    System.out.println("== Movimentar Todos os Veículos ==");
                    //simulador.movimentarTodosVeiculos();
                    break;
                }

                case 7: {   // imprimir todos os dados de todos os veículos
                    System.out.println("== Imprimir Todos os dados de todos os Veículos ==");
                    simulador.imprimirVeiculos();//ok
                    break;
                }
                case 8: {   // imprimir dados de veículos por tipo
                    System.out.println("== Imprimir Dados de Veículos por tipo ==");
                    System.out.print("Informe o ID do veículo: ");
                    int idVeiculo = scanner.nextInt();
                    simulador.imprimirVeiculo(idVeiculo);
                    break;//ok
                }
                case 9: {
                    // Esvaziar ou calibrar um pneu específico de um veículo
                    System.out.println("== Esvaziar ou Calibrar Pneu Específico ==");
                    System.out.print("Informe o ID do veículo: ");
                    int idVeiculo = scanner.nextInt();
                    simulador.calibrarEsvaziarPneuEspecifico(idVeiculo);
                    break;//ok
                }
                case 10: {// Calibrar ou Esvaziar todos os pneus de veículos por tipo
                    System.out.println("== Calibrar ou Esvaziar todos os Pneus de Veículos por Tipo ==");
                    System.out.println("Informe o tipo do veiculo: EX: " + CommonVeiculos.listTipoVeiculo());
                    var ret = scanner.next();
                    do{
                        if(!CommonVeiculos.verifyValidValue(ret)){
                            System.out.println("Veiculo inválido selecione: EX: " + CommonVeiculos.listTipoVeiculo());
                            ret = scanner.next();
                        }
                    }while (!CommonVeiculos.verifyValidValue(ret));


                    simulador.calibrarEsvaziarTodos(CommonVeiculos.getClassName(ret));
                    break;//ok
                }
                case 11: {
                    // Imprimir a pista de corrida do simulador
                    System.out.println("== Imprimir Pista de Corrida ==");
                    //simulador.imprimirPistaCorrida();
                    break;
                }
                case 12: {   // Gravar veículos em arquivo
                    System.out.println("== Gravar Veículos em Arquivo ==");
                    simulador.gravarVeiculosArquivo();
                    break;//ok
                }
                case 13: {   // Ler veículos de arquivo
                    System.out.println("== Ler Veículos de Arquivo ==");
                    simulador.lerVeiculosArquivo();
                    break;//ok
                }
                case 14: {   // Encerrar o programa
                    System.out.println("Encerrando o programa...");
                    break;//ok
                }
                default: {   // Opção inválida
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            }
        } while (opcao != 14);

        // Encerrando o programa
        System.out.println("Encerrando o programa...");
    }


    private static void exibirMenu() {
        System.out.println("\n======= Menu =======");
        System.out.println("1. Incluir Veículo");
        System.out.println("2. Remover Veículo");
        System.out.println("3. Abastecer Veículo");
        System.out.println("4. Movimentar Veículo Específico");
        System.out.println("5. Movimentar Veículos por Tipo");
        System.out.println("6. Movimentar todos os Veículos");
        System.out.println("7. Imprimir todos os dados de todos os veículos");
        System.out.println("8. Imprimir dados de Veículos por Tipo");
        System.out.println("9. Esvaziar/Calibrar Pneu Específico de Veículo Específico");
        System.out.println("10. Esvaziar/Calibrar todos os pneus de veículos por Tipo");
        System.out.println("11. Imprimir pista de corrida");
        System.out.println("12. Gravar Veículos em Arquivo");
        System.out.println("13. Ler Veículos de Arquivo");
        System.out.println("14. Sair do Aplicativo");
        System.out.println("Digite o número da opção desejada:");
    }
}
