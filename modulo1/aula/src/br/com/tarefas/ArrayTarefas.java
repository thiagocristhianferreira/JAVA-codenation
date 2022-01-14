package br.com.tarefas;

public class ArrayTarefas {
    Tarefas[] tarefas;
    int contador = 0;

    public ArrayTarefas(int tamanho) {
        tarefas = new Tarefas[tamanho];
    }

    public void adicionar(Tarefas tarefa) {
        tarefas[contador] = tarefa;
        contador++;
    }

    public void removerTarefa(int posicao) {
        tarefas[posicao] = null;
    }

    public void exibirTarefas() {
        for (Tarefas tarefa : tarefas) {
            tarefa.exibirTarefa();
        }
    }

}
