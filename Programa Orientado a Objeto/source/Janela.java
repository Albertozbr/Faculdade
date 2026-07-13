import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Janela implements ActionListener {
        public static void main(String[]args){
            JFrame framePrincipal = new JFrame("Minha Janela");

            JPanel painel = new JPanel();
            painel.setLayout(null);

            JLabel jlDigiteNome = new JLabel("Digite seu nome:");
            jlDigiteNome.setBounds(283, 116, 153, 24);

            JTextField jtNome = new JTextField();
            jtNome.setBounds(283, 164, 446, 38);
            
            JLabel jlResultado = new JLabel();
            jlResultado.setBounds(283, 116, 205, 48);

            JButton jbSalvar = new JButton("Salvar");
            jbSalvar.setBounds(283, 266, 77, 16);

            JButton jbApagar = new JButton("Apagar");
            jbApagar.setBounds(388, 266, 119, 17);

            painel.add(jlDigiteNome);
            painel.add(jtNome);
            painel.add(jlResultado);
            painel.add(jbSalvar);
            painel.add(jbApagar);

            jbSalvar.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    JOptionPane.showMessageDialog(null, "Arquivo salvo");
                }
            });

            jbApagar.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    JOptionPane.showMessageDialog(null, "Arquivo apagado");
                }
            });

            framePrincipal.add(painel);

            framePrincipal.setSize(1440, 1024);
            framePrincipal.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
}
