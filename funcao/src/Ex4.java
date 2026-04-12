import java.util.Scanner;

public class Ex4 {
    public static String avaliacao (float media) {
        if (media >= 6) {
            return "Aprovado";
        }
        else if (media >= 4) {
            return "Recuperação";
        }
        else
            return "Reprovado";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a media do aluno: ");
        float media = input.nextFloat();
        System.out.print("Situação do aluno: "+avaliacao(media));
    }
}
