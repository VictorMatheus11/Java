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
public class atividade01 {
    public static void main(String[] args) {
        Scanner t= new Scanner (System.in);
        double x;
        double z;
        System.out.println("digite o primeiro numero");
        x = t.nextDouble();
        System.out.println("digite o primeiro segundo");
        z = t.nextDouble();
        
        if (x==z) {
            System.out.println("Os numeros são iguais");
        }
        else {
            System.out.println("Os numeros são diferentes");
        }
             
        
        t.close(); 
    }
}
