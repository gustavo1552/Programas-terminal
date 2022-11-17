package Clientes;

import java.util.ArrayList;
import java.util.Scanner;
import src.ControlaBanco;

public class Cliente {
    public static ArrayList<String> nomes = new ArrayList<String>();
    public static ArrayList<String> cpfs = new ArrayList<String>();
    public static ArrayList<String> profissao = new ArrayList<String>();

    public static void adicionarCliente() {
        String tempNome;
        String tempCPF;
        String tempWork;
        // Perguntas
        Scanner inputDados = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        tempNome = inputDados.nextLine();
        System.out.println("Digite seu CPF: ");
        tempCPF = inputDados.nextLine();
        System.out.println("Qual a sua profissao? ");
        tempWork = inputDados.nextLine();

        // Verifica se já existe cadastro
        if (cpfs.contains(tempCPF)) {
            System.out.println("Este cliente já está cadastrado.");
            ControlaBanco.acessarMenu();
        } else {
            cpfs.add(tempCPF);
            nomes.add(tempNome);
            profissao.add(tempWork);
        }
        System.out.println("Cliente criado com sucesso!");
        ControlaBanco.acessarMenu();
        inputDados.close();

    };

};
