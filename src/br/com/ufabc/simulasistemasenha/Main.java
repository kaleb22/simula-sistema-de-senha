package br.com.ufabc.simulasistemasenha;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){

        int qtdDeSenhas = 16;
        CaixaDeAtendimento caixa1 = new CaixaDeAtendimento(1);
        CaixaDeAtendimento caixa2 = new CaixaDeAtendimento(2);
        CaixaDeAtendimento caixa3 = new CaixaDeAtendimento(3);
        CaixaDeAtendimento caixa4 = new CaixaDeAtendimento(4);
        CaixaDeAtendimento caixa5 = new CaixaDeAtendimento(5);
        CaixaDeAtendimento caixaTemp;

        Queue<CaixaDeAtendimento> filaDoCaixa = new LinkedList<>();

        filaDoCaixa.add(caixa1);
        filaDoCaixa.add(caixa2);
        filaDoCaixa.add(caixa3);
        filaDoCaixa.add(caixa4);
        filaDoCaixa.add(caixa5);

        for (int i = 1; i <= qtdDeSenhas; i++) {
            filaDoCaixa.peek().setSenha(i);
            filaDoCaixa.peek().chamaProximoFila();
            caixaTemp = filaDoCaixa.element();
            filaDoCaixa.poll();
            filaDoCaixa.add(caixaTemp); // leva ele pro fim da fila
        }
    }
}
