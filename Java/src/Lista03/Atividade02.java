/**Entrar com 20 números e imprimir a soma desses números.
 */
package Lista03;

import java.util.Scanner;
/**
 *
 * @author aula
 */
public class Atividade02 {
    public static void main(String[] args) {
        int numero;
        int resultado;
        int cont = 1;
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("digite um número: ");
        numero = teclado.nextInt();
        
        while (cont <= 20) {
            resultado = numero + cont;
            System.out.println("Resultado" + resultado);
            
            cont++;
            
        }
        teclado.close();
    }
}
