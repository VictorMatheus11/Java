/*
 5)Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% 
se o valor da compra for menor que R$ 20,00 caso contrário, o lucro será de 30%.
Entrar com o valor do produto e imprimir o valor da venda.
 */
package fundamentoslista02;

import javax.swing.JOptionPane;

/**
 *
 * @author aula
 */
public class atividade05 {
    public static void main(String[] args) {
        
       Double venda1;
       
        venda1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto: ", "produto", 1));
        
        if (venda1>20 ){
            //o valor do lucro sera de 45%
            venda1 = 1.45 * venda1;
        } 
        else {
        //o valor do lucro sera de 30%
            venda1 = 1.30 * venda1;
        }
                
        JOptionPane.showMessageDialog(null, "valor da compra: " + venda1);
       
       
    }
   
}
