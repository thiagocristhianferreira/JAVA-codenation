package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {
    ArrayList<Tarefas> tarefas = new ArrayList<>();

    public void adicionar(Tarefas tarefa) {
        if (tarefa != null && tarefa.obterTamanhoDescricao() <= 20) {
            this.tarefas.add(tarefa);
        } else {
            System.out.println("Descrição com caracteres exedidos");
        }
    }

    public void adicionar(String descricao) {
        Tarefas tarefa = new Tarefas(descricao);
        adicionar(tarefa);
    }

    public void remover(int posicao) {
        this.tarefas.remove(posicao);
    }

    public void buscar(String descricao) {
        for (Tarefas tarefa: tarefas) {
            if (descricao.equals(tarefa.descricao)) {

            }
        }
    }

    public void exibirTarefas() {
        for (Tarefas tarefa: tarefas) {
            tarefa.exibirTarefa();
        }
    }
}
