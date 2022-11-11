/*
Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:
Não eleitor (abaixo de 16 anos)
Eleitor obrigatório (entre 18 e 65 anos) 
Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos) 
 */
package fundamentoslista02;

import javax.swing.JOptionPane;

/**
 *
 * @author aula
 */
public class atividade07 {
    public static void main(String[] args) {
        int naoeleitor = 0;
        int obrigatorio = 0;
        int facultativo = 0;
        int idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:" ));
        
        if( idade <= 16 ){
            
            JOptionPane.showMessageDialog(null, "Não eleitor");
        
        }
        
            
        if ( idade > 18 && idade <= 65) {
            
            JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
        
        }
        
        //if ((idade > 16 && idade <= 18) || (idade > 65)){
        if (idade > 16 && idade <= 18){
            
           JOptionPane.showMessageDialog(null, "Eleitor facultativo");
        }
        if (idade > 65) {
             JOptionPane.showMessageDialog(null, "Eleitor facultativo");
        }
        
    }

}
