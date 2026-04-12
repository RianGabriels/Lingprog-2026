import java.util.Scanner;

public  class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int soma = 0;
    int[][] matriz = new int[4][4];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        matriz[i][j] = (int) (Math.random() * 10);
        if (i == j) {
          System.out.print("Elemento faz parte da DP: " +matriz[i][j]);
          soma += matriz[i][j];
        }
      }
    }
    System.out.print("Soma do elemento da DP: "+soma);
  }
}