package fundamentoslista02;

import java.util.Scanner;

public class atividade04 {
    
    public static void main(String[] args) {
        
        double menor, maior, numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = teclado.nextDouble();
        menor = numero;
        maior = numero;
        System.out.println("Digite um número");
        numero = teclado.nextDouble();
        if (numero < menor) {
            menor = numero;
        }
        if (numero > maior) {
            maior = numero;
        }
        System.out.println("Digite um número");
        numero = teclado.nextDouble();
        if (numero < menor) {
            menor = numero;
        }
        if (numero > maior) {
            maior = numero;
        }System.out.println("Digite um número");
        numero = teclado.nextDouble();
        if (numero < menor) {
            menor = numero;
        }
        if (numero > maior) {
            maior = numero;
        }System.out.println("Digite um número");
        numero = teclado.nextDouble();
        if (numero < menor) {
            menor = numero;
        }
        if (numero > maior) {
            maior = numero;
        }
        System.out.println("O menor é "+menor);
        System.out.println("O maior é "+maior);
        
        teclado.close();
    }
}