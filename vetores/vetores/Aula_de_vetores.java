package vetores;

import java.util.Scanner;

public class Aula_de_vetores {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int n = 11; 
    int v[] = new int[n];
    int i; 


    for (i=0; i<n; i++) {
      System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
      v[i] = ler.nextInt();
    }


    int soma = 0;
    int menor = v[0];
    int maior = v[0];
    for (i=0; i<n; i++) {
      soma = soma + v[i];

      if (v[i] < menor)
         menor = v[i];

      if (v[i] > maior)
         maior = v[i];
    }

// Saída (resultados)
    System.out.printf("\n");
    for (i=0; i<n; i++) {
      if (v[i] == menor)
        System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
      else if (v[i] == maior)
              System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
           else System.out.printf("v[%d] = %2d\n", i, v[i]);
    }

    System.out.printf("\nSoma = %d\n", soma);
  }

}