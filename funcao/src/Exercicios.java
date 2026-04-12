import java.util.Scanner;

public class Exercicios {
    public static double calcularAreaAT(double base, double altura){
        return (base * altura);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        double base = input.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = input.nextDouble();
        System.out.println("Área do retângulo: "+calcularAreaAT(base,altura));
    }
}