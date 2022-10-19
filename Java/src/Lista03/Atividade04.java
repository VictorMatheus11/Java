/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

/**
 *
 * @author aula
 */
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        //4 - Faça um algoritmo que deixe 
        //escolher qual a tabuada de 
        //multiplicar que se deseja imprimir.
        int numero, resultado;
        int cont = 1;
        System.out.println("Programa de tabuada");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número da tabuada desejada.");
        numero = teclado.nextInt();
        while (cont <= 10) {            
            resultado = numero * cont;
            System.out.println(numero + " X " +
                    cont + " = " + resultado);
            
            cont++;
        }
        
        teclado.close();
    }
  
}
