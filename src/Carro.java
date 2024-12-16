public class Carro {

    String placa, modelo;
    int ano_de_fabricacao;
    int ano_atual = 2024;
    int imposto;
    int diferenca;
    int total_de_Isentos = 0;
    int total_de_Imposto = 0;

    public Carro(){

    }

    void calcularImposto(){
        diferenca = ano_atual - ano_de_fabricacao;

        if (diferenca == 0){
            imposto = 500;
            total_de_Imposto += imposto;
        } else if (diferenca <= 3){
            imposto = 500 - (diferenca * 100);
            total_de_Imposto += imposto;
        } else if (diferenca <= 9){
            imposto = 100;
            total_de_Imposto += imposto;
        } else
            imposto = 0;
    }

    int totalIsentos (){
        if (diferenca > 9)
            total_de_Isentos++;

        return total_de_Isentos;
    }

    void Relatorio(){
        System.out.println("\n\n----------------------------------------------");
        System.out.println("\nRelatório:");
        System.out.println("Total de imposto pago: R$" + total_de_Imposto);
        System.out.println("Total de isentos:" + total_de_Isentos);
    }
}
