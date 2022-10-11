/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentoslista02;
import java.util.Scanner;
/**
 *
 * @author aula
 */
public class atividade03 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        
        double x;
        System.out.println("Digite um numero");
        x = tec.nextDouble ();
        if ((x % 10) == 0) {
        System.out.println("o numero"+ x + "é divisivel por 10" );
    }
       if ((x % 5) == 0) {
        System.out.println("o numero"+ x + "é divisivel por 5" );  
    }
        if ((x % 2) == 0) {
        System.out.println("o numero"+ x + "é divisivel por 2" );
        }
    }
}