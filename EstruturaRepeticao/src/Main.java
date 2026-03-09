import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int condicao = 1;
        float soma = 0f;
        while(condicao <= 10) {
            System.out.println("Me passe a nota de um aluno: ");
            int nota = input.nextInt();
            soma = soma + nota;
            condicao++;
        }
        System.out.println("Essa é a media da sala: "+soma/10);
    }
}