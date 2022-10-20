/*
 * -  Entrar com 20 números e imprimir a soma dos positivos e o total de números negativos
 *
 */
package Lista03;

import javax.swing.JOptionPane;
/**
 *
 * @author mteixeira
 */
public class Atividade03 {
    
    public static void main(String args[]) 
    {
        
        double positivo = 0;
        double negativo = 0;
        double num = 0;
        for(int i=1; i<=20;i++)
        {
            num = Double.parseDouble(JOptionPane.showInputDialog("digite o "+i+". Numero"));
            if (num > 0)
                positivo = positivo + num;
            else if (num < 0) negativo = negativo + num;
        }
           
            
        JOptionPaneOptionPane.showMessageDialog(null,"dos 20 numeros lidos, a soma dos posistivo é "+positivo+" "
            + "e a soma dos negativos é" + negativo);
    }
}
    

    
