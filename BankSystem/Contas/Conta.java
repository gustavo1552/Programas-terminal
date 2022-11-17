package Contas;

import java.util.ArrayList;
import java.util.Scanner;
import src.ControlaBanco;
import Clientes.Cliente;
import java.util.HashMap;

public class Conta {
    public static ArrayList<String> cpfConta = new ArrayList<String>();
    public static ArrayList<String> agConta = new ArrayList<String>();
    public static HashMap<Integer, Float> numConta = new HashMap<Integer, Float>(); // Numero de conta, saldo

    public static void cadastraConta() {
        String tempCPFconta;
        Scanner inputDados = new Scanner(System.in);
        System.out.println("Digite o CPF do cliente:");
        tempCPFconta = inputDados.nextLine();

        if (Cliente.cpfs.contains(tempCPFconta)) {

            cpfConta.add(tempCPFconta); // adiciona cpf
            System.out.println("Digite um numero de agencia:");
            agConta.add(inputDados.nextLine());
            System.out.println("Digite um numero de conta novo:");

            Integer tempNumConta;
            tempNumConta = inputDados.nextInt();
            // Verifica numero de contas duplicados
            if (numConta.containsKey(tempNumConta)) {
                System.out.println("Conta já existente!");
                ControlaBanco.acessarMenu();
            } else {
                numConta.put(tempNumConta, 0f);
                ControlaBanco.acessarMenu();
            }

        } else {
            System.out.println("Cliente inexistente");
            ControlaBanco.acessarMenu();
        }

        inputDados.close();
    };

    public static void adicionarDinheiro(Integer chave, Float deposito) {
        numConta.put(chave, numConta.get(chave) + deposito);
        System.out.println("Depósito concluido!");
        ControlaBanco.acessarMenu();
    }

    public static void sacarDinheiro(Integer chave, Float saque) {
        numConta.put(chave, numConta.get(chave) - saque);
        System.out.println("Saque concluido!");
        ControlaBanco.acessarMenu();
    }

    public static void transferir(Integer contaPagador, Integer contaRecebedor, Float valorTransfer) {
        numConta.put(contaPagador, numConta.get(contaPagador) - valorTransfer);
        numConta.put(contaRecebedor, numConta.get(contaRecebedor) + valorTransfer);

        System.out.println("Foi transferido " + valorTransfer + " R$ da conta " + contaPagador + " para a conta: "
                + contaRecebedor);
        ControlaBanco.acessarMenu();
    }

}
