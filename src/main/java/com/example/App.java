package com.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    GestorEventos gestor = new GestorEventos();
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;

    System.out.println("Bem-vindo ao Gestor de Eventos!");

    do {
      System.out.println("Selecione uma opção:");
      System.out.println("1 - Cadastrar evento");
      System.out.println("2 - Inscrever participante");
      System.out.println("3 - Buscar evento");
      System.out.println("4 - Listar eventos");
      System.out.println("5 - Gerar relatório de eventos");
      System.out.println("6 - Sair");
      opcao = scanner.nextInt();
      scanner.nextLine();

      if (opcao == 1) {
        System.out.println("Digite o nome do evento:");
        String nome = scanner.nextLine();
        System.out.println("Digite a data do evento:");
        String data = scanner.nextLine();
        System.out.println("Digite o local do evento:");
        String local = scanner.nextLine();
        System.out.println("Digite a quantidade de Ingressos Vip:");
        int vip = scanner.nextInt();
        System.out.println("Digite a quantidade de Ingressos Camarote:");
        int camarote = scanner.nextInt();
        System.out.println("Digite a quantidade de Ingressos Pista:");
        int pista = scanner.nextInt();
        gestor.cadastrarEvento(nome, data, local, vip, camarote, pista);
      } else if (opcao == 2) {
        System.out.println("Digite o nome do evento:");
        String nome = scanner.nextLine();
        if (gestor.inscreverEmEvento(nome)) {
          System.out.println("Inscrição realizada com sucesso!");
        } else {
          System.out.println("Evento lotado ou não encontrado.");
        }
      } else if (opcao == 3) {
        System.out.println("Digite o nome do evento:");
        String nome = scanner.nextLine();
        Eventos evento = gestor.buscarEventoPorNome(nome);
        if (evento != null) {
          System.out.println(evento);
        } else {
          System.out.println("Evento não encontrado.");
        }
      } else if (opcao == 4) {
        gestor.listarEventos();
      } else if (opcao == 5) {
        System.out.println("Digite o caminho do arquivo:");
        String caminho = scanner.nextLine();
        gestor.gerarRelatorioCSV(caminho);
      }

    } while (opcao != 6);

  }
}