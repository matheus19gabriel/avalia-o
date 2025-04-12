package org.example;

public class Camisa {
    private String cor;
    private String tamanho;
    private double preco;

    public Camisa() {
    }

    public Camisa(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Camisa:");
        System.out.println("Cor da camisa: " + cor);
        System.out.println("Tamanho da camisa: " + tamanho);
        System.out.println("Preço da camisa: " + preco);
        System.out.println("Preço com desconto: " + calcularDesconto());
    }

    public double calcularDesconto() {
        return preco * 0.90;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
