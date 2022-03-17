package com.br.avaliacoes.Questao1;

import com.br.avaliacoes.Questao1.model.Cliente;
import com.br.avaliacoes.Questao1.model.Evento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instancias de Cliente
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();
        Cliente cliente5 = new Cliente();

        // Array dos Clientes para Adicionar os dados na classe Cliente atravez de um loop
        Cliente[] clientes = {cliente1, cliente2, cliente3, cliente4, cliente5};

        // Instancias classe Evento
        Evento evento1 = new Evento();
        Evento evento2 = new Evento();
        Evento evento3 = new Evento();

        // Array dos Eventos para Adicionar os dados na classe Evento atraves de um loop
        Evento [] eventos = {evento1, evento2, evento3};

        // Inicio Formulario de Cadastro dos Eventos e dos Clientes
        for (int c = 0; c < 3; c++) {
            System.out.println("------------------------------");
            System.out.println("Registrador de Eventos e seus Clientes");
            System.out.println("------------------------------");
            System.out.println("Evento "+(c+1));
            System.out.println("------------------------------");

            // Nome Evento
            System.out.print("Nome do Evento: ");
            if (c > 0) {
                String nomeEvent = scanner.next();
                eventos[c].setNome(nomeEvent);
            }
            else {
                String nomeEvent = scanner.nextLine();
                eventos[c].setNome(nomeEvent);
            }
            System.out.println("------------------------------");

            // Data Evento
            System.out.print("Data: ");
            if (c > 0){
                String dataEvent = scanner.next();
                eventos[c].setData(dataEvent);
            }
            else{
                String dataEvent = scanner.nextLine();
                eventos[c].setData(dataEvent);
            }


            System.out.println("------------------------------");
            System.out.println("Clientes evento "+(c+1));
            System.out.println("------------------------------");

            // Loop para cadastro dos clientes
            for (int i = 0; i < 5; i++) {
                System.out.println("Cliente " + (i+1));

                // Nome cliente
                System.out.println("------------------------------");
                System.out.print("Nome: ");
                String nomeCliente = scanner.next();
                clientes[i].setNome(nomeCliente);
                eventos[c].setClientes(nomeCliente);

                //Cpf cliente
                System.out.println("------------------------------");
                System.out.print("CPF: ");
                String cpfCliente = scanner.next();
                clientes[i].setCpf(cpfCliente);

                //Email cliente
                System.out.println("------------------------------");
                System.out.print("Email: ");
                String emailCliente = scanner.next();
                clientes[i].setEmail(emailCliente);

                //Telefone cliente
                System.out.println("------------------------------");
                System.out.print("Telefone: ");
                String telefoneCliente = scanner.next();
                clientes[i].setTelefone(telefoneCliente);
                System.out.println("------------------------------\n");
            }

            // Printar na tela o Evento
            System.out.println("------------------------------");
            System.out.println("Evento "+(c+1));
            System.out.println("------------------------------");
            System.out.println(eventos[c]);
            System.out.println("\n------------------------------");
            System.out.println("Clientes Evento "+(c+1));
            System.out.println("------------------------------");

            //Loop para printar todas as informações dos clientes do evento
            for (int cont = 0; cont < 5; cont++){
                System.out.println("Cliente "+ (cont+1));
                System.out.println(clientes[cont]);
                System.out.println("------------------------------");
            }

            // Verifica se está nos primeiros dois eventos, caso esteja no ultimo evento printa os 3 eventos no final
            if (c < 2){
                System.out.print("Digite qualquer coisa para continuar: ");
                String resp = scanner.next();
            }
            else{
                System.out.println("\n------------------------------");
                System.out.println("Evento 1");
                System.out.println("------------------------------");
                System.out.println(evento1);
                System.out.println("------------------------------");
                System.out.println("Evento 2");
                System.out.println(evento2);
                System.out.println("------------------------------");
                System.out.println("Evento 3");
                System.out.println(evento3);
                System.out.println("------------------------------");

            }

        }
    }
}
