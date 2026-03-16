import java.util.Scanner;

public  class tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero principal da tabuada: ");
        int tabuada = input.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada+" x "+i+" = "+tabuada*i);
        }
    }
}