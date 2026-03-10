import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos dados você quer jogar?: ");
        int Dados = input.nextInt();
        System.out.println("Qual numero você deseja acertar? (1 a 6): ");
        int numero = input.nextInt();
        while (numero < 1 || numero > 6) {
            System.out.println("Tente um numero entre 1 e 6: ");
            numero = input.nextInt();
        }
        int random = 0;
        int acerto = 0;
        for (int i = 1; i <= Dados; i++) {
            random = (int) (Math.random() * 6 + 1);
            System.out.println("Resultado: " + random);
            if (random == numero) {
                acerto++;
            }
        }
        System.out.println("Você acertou essa quantidade de vezes: "+acerto);
        System.out.println("% de acerto foi: "+((float)acerto/Dados)*100);
    }
}