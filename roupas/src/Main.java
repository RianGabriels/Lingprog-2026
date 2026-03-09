import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de camisas produzidas: ");
        int camisas = input.nextInt();
        if (camisas <= 0) {
            System.out.println("Digite um numero valido");
            camisas = input.nextInt();
        }
        System.out.println("Digite o numero de camisas vendidas: ");
        int venda = input.nextInt();
        if (venda > camisas) {
            System.out.println("Digite um numero valido");
            venda = input.nextInt();
        }
        else if (venda <= 0) {
            System.out.println("Digite um numero valido");
            venda = input.nextInt();
        }
        int custo = 15*camisas;
        int fixo = 200;
        int valorc = 35*venda;
        int custot = custo+fixo;
        int lucro = valorc-custot;
        System.out.println("Custo total: "+custot);
        System.out.println("Receita: "+valorc);
        if (lucro < 0) {
            System.out.println("Seu prejuizo foi de: "+lucro);
        }
        System.out.println("Seu lucro foi: "+lucro);
        double val = (40*40)-4*(-0.05)*(-500);
        System.out.println("Seu lucro mensal foi: "+val);
    }
}