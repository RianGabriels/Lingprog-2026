import java.util.Scanner;

public class AcimaMedia {
    public static void infoSalario(float[] salarios) {
        Scanner input = new Scanner(System.in);
        float soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o salario do "+(i+1)+": ");
            salarios[i] = input.nextFloat();
            soma = soma + salarios[i];
        }
    }
    public static void media(float[] salarios) {
        Scanner input = new Scanner(System.in);
        float soma = 0;
        float media = soma / salarios.length;
        int acima = 0, abaixo = 0, exatamenteigual = 0;
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acima++;
            }
            else if (salarios[i] < media) {
                abaixo++;
            }
            else {
                exatamenteigual++;
            }
        }
        System.out.println("Media: "+media);
        System.out.println("Acima: "+acima);
        System.out.println("Exatamenteigual: "+exatamenteigual);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] salarios = new float[5];
        
        infoSalario(salarios);
        media(salarios);
    }
}
