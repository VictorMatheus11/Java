package fundamentoslista02;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 Entrar com o ano de nascimento de uma pessoa e o ano atual.Imprimir a idade da pessoa. 
 * Não se esqueça de verificar se o ano de nascimento é um ano válido
 */
public class atividade06 {
    public static void main(String[] args) {
        
       int anoatual;
       int anonasc;
       int idade;
        
        anonasc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de nascimento", "Ano de Nascimento",1));
        anoatual = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano atual:","Ano Atual", 1));
        idade = anoatual - anonasc;
        JOptionPane.showMessageDialog(null,"idade: \n" + idade );
        
        
                
    }
    
}
