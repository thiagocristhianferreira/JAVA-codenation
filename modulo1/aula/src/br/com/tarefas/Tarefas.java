package br.com.tarefas;

public class Tarefas {

    String descricao;

    public Tarefas(String descricao) { this.descricao = descricao; }

    public void exibirTarefa() { System.out.println(descricao); }

    public int obterTamanhoDescricao() { return descricao.length(); }
}
