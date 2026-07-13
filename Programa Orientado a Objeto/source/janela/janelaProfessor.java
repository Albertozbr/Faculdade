package janela;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class janelaProfessor extends JFrame {

    // 1. Declarando Textos (Labels)
    private JLabel lblTitulo;
    private JLabel lblNome;
    private JLabel lblDataNascimento;
    private JLabel lblFormacao;
    private JLabel lblEmail;
    private JLabel lblEspecializacao;
    private JLabel lblCpf;
    private JLabel lblId;

    // 2. Declarando as Caixas de Digitação (TextFields)
    private JTextField txtNome;
    private JTextField txtDataNascimento;
    private JTextField txtFormacao;
    private JTextField txtEmail;
    private JTextField txtEspecializacao;
    private JTextField txtCpf;
    private JTextField txtId;

    // 3. Declarando os Botões (Buttons)
    private JButton btnSalvar;
    private JButton btnApagar;

    // 4. Declarando o painel cinza da direita
    private JPanel painelDireito;

    public janelaProfessor() {
        setJanela();
        criarComponentes();
    }

    private void setJanela() {
        setTitle("Cadastrar Professor");
        setSize(800, 600);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(225, 235, 250));
    }

    private void criarComponentes() {

        // --- TÍTULO ---
        lblTitulo = new JLabel("Cadastro Professor");
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 24));
        lblTitulo.setBounds(260, 5, 250, 38);
        add(lblTitulo);

        // --- NOME DO PROFESSOR (Linha inteira) ---
        lblNome = new JLabel("Nome do Professor:");
        lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
        lblNome.setBounds(26, 43, 200, 24);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(20, 69, 462, 50);
        add(txtNome);

        // --- DATA DE NASCIMENTO (Coluna Esquerda) ---
        lblDataNascimento = new JLabel("Data de nascimento:");
        lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 20));
        lblDataNascimento.setBounds(26, 143, 200, 24);
        add(lblDataNascimento);

        txtDataNascimento = new JTextField();
        txtDataNascimento.setBounds(20, 167, 200, 50);
        add(txtDataNascimento);

        // --- FORMAÇÃO (Coluna Direita) ---
        lblFormacao = new JLabel("Formação:");
        lblFormacao.setFont(new Font("Arial", Font.PLAIN, 20));
        lblFormacao.setBounds(272, 143, 100, 38);
        add(lblFormacao);

        txtFormacao = new JTextField();
        txtFormacao.setBounds(266, 167, 200, 50);
        add(txtFormacao);

        // --- E-MAIL (Coluna Esquerda) ---
        lblEmail = new JLabel("E-mail:");
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
        lblEmail.setBounds(26, 222, 100, 24);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(20, 246, 230, 50);
        add(txtEmail);

        // --- ESPECIALIZAÇÃO (Coluna Direita) ---
        lblEspecializacao = new JLabel("Especialização:");
        lblEspecializacao.setFont(new Font("Arial", Font.PLAIN, 20));
        lblEspecializacao.setBounds(272, 222, 150, 24);
        add(lblEspecializacao);

        txtEspecializacao = new JTextField();
        txtEspecializacao.setBounds(266, 246, 200, 50);
        add(txtEspecializacao);

        // --- CPF (Coluna Esquerda) ---
        lblCpf = new JLabel("Cpf:");
        lblCpf.setFont(new Font("Arial", Font.PLAIN, 20));
        lblCpf.setBounds(26, 313, 80, 24);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(20, 342, 200, 50);
        add(txtCpf);

        // --- ID (Coluna Direita) ---
        lblId = new JLabel("Id:");
        lblId.setFont(new Font("Arial", Font.PLAIN, 20));
        lblId.setBounds(272, 320, 50, 24);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(266, 342, 200, 50);
        add(txtId);

        // --- BOTÕES ---
        // Alinhados no eixo Y para não ficarem tortos (ambos no Y: 462)
        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(132, 462, 100, 40);
        add(btnSalvar);

        btnApagar = new JButton("Apagar");
        btnApagar.setBounds(327, 462, 100, 40);
        add(btnApagar);

        // --- PAINEL DIREITO (Retângulo cinza) ---
        painelDireito = new JPanel();
        painelDireito.setBackground(new Color(210, 210, 210));
        painelDireito.setBounds(497, 77, 244, 419);
        add(painelDireito);
    }
}