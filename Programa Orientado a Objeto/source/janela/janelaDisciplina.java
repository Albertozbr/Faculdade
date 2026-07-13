package janela;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class janelaDisciplina extends JFrame {

    // 1. Declarando Textos (Labels)
    private JLabel lblTitulo;
    private JLabel lblNome;
    private JLabel lblCargaHoraria;
    private JLabel lblCapacidade;

    // 2. Declarando as Caixas de Digitação (TextFields)
    private JTextField txtNome;
    private JTextField txtCargaHoraria;
    private JTextField txtCapacidade;

    // 3. Declarando os Botões (Buttons)
    private JButton btnSalvar;
    private JButton btnApagar;

    // 4. Declarando o painel cinza da direita
    private JPanel painelDireito;

    public janelaDisciplina() {
        setJanela();
        criarComponentes();
    }

    private void setJanela() {
        setTitle("Cadastrar Disciplina");
        // Ajustei o tamanho da janela para 800x600 para caber o painel direito com
        // folga
        setSize(800, 600);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(225, 235, 250));
    }

    private void criarComponentes() {

        // --- TÍTULO ---
        lblTitulo = new JLabel("Cadastro de Disciplina");
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 24));
        lblTitulo.setBounds(15, 28, 250, 38);
        add(lblTitulo);

        // --- NOME ---
        lblNome = new JLabel("Nome:");
        lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
        lblNome.setBounds(66, 89, 80, 24);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(66, 115, 350, 50);
        add(txtNome);

        // --- CARGA HORÁRIA ---
        lblCargaHoraria = new JLabel("Carga horária:");
        lblCargaHoraria.setFont(new Font("Arial", Font.PLAIN, 20));
        lblCargaHoraria.setBounds(67, 229, 150, 24);
        add(lblCargaHoraria);

        txtCargaHoraria = new JTextField();
        txtCargaHoraria.setBounds(66, 253, 350, 50);
        add(txtCargaHoraria);

        // --- CAPACIDADE ---
        lblCapacidade = new JLabel("Capacidade:");
        lblCapacidade.setFont(new Font("Arial", Font.PLAIN, 20));
        lblCapacidade.setBounds(66, 367, 130, 24);
        add(lblCapacidade);

        txtCapacidade = new JTextField();
        txtCapacidade.setBounds(66, 396, 350, 50);
        add(txtCapacidade);

        // --- BOTÕES ---
        // Aumentei um pouco L e H (para 100x40) em relação ao Figma para o botão não
        // ficar muito espremido
        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(105, 479, 100, 40);
        add(btnSalvar);

        btnApagar = new JButton("Apagar");
        btnApagar.setBounds(284, 479, 100, 40);
        add(btnApagar);

        // --- PAINEL DIREITO (Retângulo cinza) ---
        painelDireito = new JPanel();
        painelDireito.setBackground(new Color(210, 210, 210)); // Cinza claro
        painelDireito.setBounds(479, 78, 244, 419);
        add(painelDireito);
    }
}