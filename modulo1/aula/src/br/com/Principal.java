package br.com;

//import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListaTarefas;
//import br.com.tarefas.Tarefas;

public class Principal {

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();
        tarefas.adicionar("Trabalhar");
        tarefas.adicionar("Estudar");
        tarefas.adicionar("Lavar roupa");

        System.out.println("Minhas Tarefas");
        System.out.println("----------------------");
        tarefas.exibirTarefas();

    }

}
