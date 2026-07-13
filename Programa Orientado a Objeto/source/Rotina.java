import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.JapaneseEra;
import java.awt.Font;

import javax.swing.JOptionPane;

public class Rotina implements ActionListener {
    public static void main(String[]args){
        JFrame frameEscolha = new JFrame("Escolha do dia");

        JPanel painel = new JPanel();
        painel.setLayout(null);

        JLabel jlOrganizadorDeRotina = new JLabel("Organizador de rotina");
        jlOrganizadorDeRotina.setBounds(514, 107, 411, 48);
        jlOrganizadorDeRotina.setFont(jlOrganizadorDeRotina.getFont().deriveFont(40.0f));

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
