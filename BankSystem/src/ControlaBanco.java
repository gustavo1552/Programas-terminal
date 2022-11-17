package src;

import java.util.Scanner;

import Clientes.Cliente;
import Contas.Conta;

public class ControlaBanco {

        public static void acessarMenu() {
                Scanner inputSeletor = new Scanner(System.in);
                // Tela principal
                while (true) {
                        String selecionar;
                        System.out.println(
                                        "Selecione o que voce deseja:\n1 - Selecionar conta\n2 - Novo cliente\n3 - Criar nova conta\n4 - Verificar saldo\n5 - Imprimir lista de clientes\n6 - Sair do sistema");
                        selecionar = inputSeletor.nextLine();

                        if (selecionar.equals("1")) {
                                System.out.println("Digite o código da conta: ");
                                Integer codConta;
                                Scanner inputSeletor2 = new Scanner(System.in);
                                codConta = inputSeletor2.nextInt();
                                if (Conta.numConta.containsKey(codConta)) {
                                        System.out.println("Selecione:\n1 - Deposito \n2 - Saque \n3 - Transferencia");
                                }
                                Integer inputSectMov;
                                inputSectMov = inputSeletor2.nextInt();

                                switch (inputSectMov) {
                                        case 1:
                                                System.out.println("Quanto voce quer depositar?:");
                                                Scanner inputDeposit = new Scanner(System.in);
                                                Float valorDeposito = inputDeposit.nextFloat();
                                                Conta.adicionarDinheiro(codConta, valorDeposito); // chama metodo
                                                                                                  // deposito
                                                inputDeposit.close();
                                        case 2:
                                                System.out.println("Quanto voce quer sacar?:");
                                                Scanner inputSaque = new Scanner(System.in);
                                                Float valorSaque = inputSaque.nextFloat();
                                                Conta.sacarDinheiro(codConta, valorSaque); // chama metodo saque

                                        case 3:
                                                System.out.println("Deseja transferir para qual conta?");
                                                Scanner inputRecebedor = new Scanner(System.in);
                                                Integer recebedor = inputRecebedor.nextInt();

                                                System.out.println("Digite o valor que voce quer transferir:");
                                                Scanner inputValorTransfer = new Scanner(System.in);
                                                Float valorTransfer = inputValorTransfer.nextFloat();
                                                Conta.transferir(codConta, recebedor, valorTransfer);

                                                System.out.println("Tenha um bom dia!");
                                                ControlaBanco.acessarMenu();

                                                inputRecebedor.close();
                                                inputValorTransfer.close();
                                        default:
                                                System.exit(0);
                                }

                                inputSeletor2.close();
                                break;
                        } else if (selecionar.equals("2")) {
                                System.out.println("Novo cliente");
                                Cliente.adicionarCliente();
                                break;
                        } else if (selecionar.equals("3")) {
                                System.out.println("Nova conta");
                                Conta.cadastraConta();
                                break;
                        } else if (selecionar.equals("4")) {
                                System.out.println("Digite o numero da conta: ");
                                Scanner inputSaldo = new Scanner(System.in);
                                Integer numContaSaldo = inputSaldo.nextInt();
                                if (Conta.numConta.containsKey(numContaSaldo)) {
                                        System.out.println(Conta.numConta.get(numContaSaldo));
                                        ControlaBanco.acessarMenu();
                                } else {
                                        System.out.println("Conta inexistente!");
                                        ControlaBanco.acessarMenu();
                                }

                                inputSaldo.close();
                                break;
                        } else if (selecionar.equals("5")) {
                                System.out.println("Lista de clientes: ");
                                System.out.println(Cliente.nomes);
                                // System.out.println(Cliente.cpfs);
                                // System.out.println(Cliente.profissao);
                                // System.out.println(Conta.numConta);
                                ControlaBanco.acessarMenu();
                                break;
                        } else if (selecionar.equals("6")) {
                                System.exit(0);
                                break;
                        } else if (selecionar.equals("7")) {
                                Conta.numConta.put(1, 0f);
                                Conta.numConta.put(2, 0f);
                                ControlaBanco.acessarMenu();
                                break;
                        } else {
                                System.out.println("Tente novamente");
                                continue;
                        }
                }
                inputSeletor.close();
        }

}