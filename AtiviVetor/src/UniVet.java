import java.util.Scanner;

public class UniVet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Digite um numero: ");
            vet1[i] = input.nextInt();
        }
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("Digite um numero: ");
            vet2[i] = input.nextInt();
        }
        int[] vet3 = new int[10];
        for (int i = 0; i < vet1.length; i++) {
            vet3[i] = vet1[i];
        }
        for (int i = 0; i < vet2.length; i++) {
            vet3[i + 5] = vet2[i];
        }
        System.out.println("Vetor unido: ");
        for (int i = 0; i < vet3.length; i++) {
            System.out.print(vet3[i] + " ");
        }
    }
}
