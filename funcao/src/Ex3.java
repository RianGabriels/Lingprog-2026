import java.util.Scanner;

public class Ex3 {
    public static float converteTemp (float celsius) {

        return (celsius * 1.8f + 32);
    }
    public static  void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um temperatura em Celsius:");
        float celsius = input.nextFloat();
        System.out.println("Fahrenheit: "+converteTemp(celsius));
        }
    }
