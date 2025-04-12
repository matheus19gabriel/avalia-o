package org.example;

public class Main {
    public static void main(String[] args) {
        Camisa camisaSimples = new Camisa();
        camisaSimples.setCor("Vermelho");
        camisaSimples.setPreco(50.0);
        camisaSimples.setTamanho("M");
        camisaSimples.exibirDetalhes();

        System.out.println();

        CamisaComEstampa camisaEstampada = new CamisaComEstampa();
        camisaEstampada.setCor("Preta");
        camisaEstampada.setPreco(90.0);
        camisaEstampada.setTamanho("M");
        camisaEstampada.setEstampa("Estampa do estigma de Berserk");
        camisaEstampada.exibirDetalhes();
    }
}
