import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Seja bem-vindo ao JavaLanches! Faça seu pedido:");
        System.out.println("101 - Cachorro-Quente - R$10.00");
        float quente = 10.00f;
        System.out.println("102 - X-Burguer - R$15.00");
        float xBurguer = 15.00f;
        System.out.println("103 - X-Salada - R$12.00");
        float xSalada = 12.00f;
        System.out.println("Digite o codigo do seu pidido: ");
        int codigo = input.nextInt();
        if (codigo != 101 && codigo != 102 && codigo != 103) {
            System.out.println("Poduto invalido! tente novamente!: ");
            codigo = input.nextInt();
        }
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        switch (codigo){
            case 101:
                if (idade < 12){
                    System.out.println("Você terá que pagar: "+quente/2);
                } else if (idade > 12 && idade < 60) {
                    System.out.println("Você terá que pagar: "+quente);
                }
                else if (idade > 60) {
                    System.out.println("Você terá que pagar: "+quente/0.03f);
                }
                break;
            case 102:
                if (idade < 12){
                    System.out.println("Você terá que pagar: "+xBurguer/2);
                } else if (idade > 12 && idade < 60) {
                    System.out.println("Você terá que pagar: "+xBurguer);
                }
                else if (idade > 60) {
                    System.out.println("Você terá que pagar: "+xBurguer/0.03f);
                }
                break;
            case 103:
                if (idade < 12){
                    System.out.println("Você terá que pagar: "+xSalada/2);
                } else if (idade > 12 && idade < 60) {
                    System.out.println("Você terá que pagar: "+xSalada);
                }
                else if (idade > 60) {
                    System.out.println("Você terá que pagar: "+xSalada/0.03f);
                }
                break;
        }
    }
}