package br.com.ufabc.simulasistemasenha;

public class CaixaDeAtendimento {

    public CaixaDeAtendimento(int id){
        this.id = id;
    }

    private int id;
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void chamaProximoFila(){
        System.out.println("Proxima senha: " + senha + " se dirigir ao caixa " + id);
    }
}
