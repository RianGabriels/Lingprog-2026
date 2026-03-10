import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* int condicao = 1;
        float soma = 0f;
        while(condicao <= 10) {
            System.out.println("Me passe a nota de um aluno: ");
            int nota = input.nextInt();
            if (nota < 0 || nota > 10) {
                break;
            }
            soma += nota;
            condicao++;
        }
        if (soma == 11) {
            float media = soma / condicao;
            System.out.println("Essa é a media da sala: "+media);
        }
        else {
            System.out.println("Nota Inválida");
        } */

        int condicao = 1;
        float nota = 0;
        float soma = 0f;
        while(condicao <= 10) {
            nota = input.nextInt();
            if(nota < 0 || nota > 10) {
                System.out.println("Nota invalida, tente novamente");
                continue;
            }
            condicao++;
            soma += nota;
        }
        float media = soma / 10;
        System.out.println("Media é: "+media);
    }
}