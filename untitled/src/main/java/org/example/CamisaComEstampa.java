package org.example;

public class CamisaComEstampa extends Camisa {
    private String estampa;

    public CamisaComEstampa() {
    }

    public CamisaComEstampa(String cor, String tamanho, double preco, String estampa) {
        super(cor, tamanho, preco);
        this.estampa = estampa;
    }


    public void exibirDetalhes() {
        System.out.println("Camisa Estampada:");
        System.out.println("Cor da camisa: " + getCor());
        System.out.println("Tamanho da camisa: " + getTamanho());
        System.out.println("Estampa: " + estampa);
        System.out.println("Preço da camisa: " + getPreco());
        System.out.println("Preço com desconto: " + calcularDesconto());
    }


    public double calcularDesconto() {
        return getPreco() * 0.95;
    }

    public String getEstampa() {
        return estampa;
    }

    public void setEstampa(String estampa) {
        this.estampa = estampa;
    }
}

