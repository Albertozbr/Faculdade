package janela;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class janelaAluno extends JFrame {

    // 1. Declarando Textos (Labels)
    private JLabel lblTitulo;
    private JLabel lblNome;
    private JLabel lblDataNascimento;
    private JLabel lblEmail;
    private JLabel lblCpf;
    private JLabel lblMatricula;

    // 2. Declarando as Caixas de Digitação (TextFields)
    private JTextField txtNome;
    private JTextField txtDataNascimento;
    private JTextField txtEmail;
    private JTextField txtCpf;
    private JTextField txtMatricula;

    // 3. Declarando os Botões (Buttons)
    private JButton btnSalvar;
    private JButton btnApagar;

    // 4. Declarando o painel cinza da direita
    private JPanel painelDireito;

    public janelaAluno() {
        setJanela();
        criarComponentes();
    }

    private void setJanela() {
        setTitle("Cadastrar Aluno");
        // Altura aumentada para 650 para comportar os 5 campos com folga
        setSize(800, 650);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(225, 235, 250));
    }

    private void criarComponentes() {

        // --- TÍTULO ---
        lblTitulo = new JLabel("Cadastro Aluno");
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 24));
        lblTitulo.setBounds(260, 5, 250, 38);
        add(lblTitulo);

        // --- NOME DO ALUNO ---
        lblNome = new JLabel("Nome do Aluno:");
        lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
        // Aumentei um pouco a largura (L) do texto para não cortar a palavra
        lblNome.setBounds(26, 43, 160, 24);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(20, 69, 462, 50);
        add(txtNome);

        // --- DATA DE NASCIMENTO ---
        lblDataNascimento = new JLabel("Data de nascimento:");
        lblDataNascimento.setFont(new Font("Arial", Font.PLAIN, 20));
        lblDataNascimento.setBounds(26, 143, 200, 24);
        add(lblDataNascimento);

        txtDataNascimento = new JTextField();
        txtDataNascimento.setBounds(20, 167, 462, 50);
        add(txtDataNascimento);

        // --- E-MAIL ---
        lblEmail = new JLabel("E-mail:");
        lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
        lblEmail.setBounds(26, 222, 100, 24);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(20, 246, 462, 50);
        add(txtEmail);

        // --- CPF ---
        lblCpf = new JLabel("Cpf:");
        lblCpf.setFont(new Font("Arial", Font.PLAIN, 20));
        lblCpf.setBounds(26, 313, 80, 24);
        add(lblCpf);

        txtCpf = new JTextField();
        txtCpf.setBounds(20, 342, 462, 50);
        add(txtCpf);

        // --- MATRÍCULA ---
        lblMatricula = new JLabel("Matrícula:");
        lblMatricula.setFont(new Font("Arial", Font.PLAIN, 20));
        lblMatricula.setBounds(26, 420, 120, 24);
        add(lblMatricula);

        txtMatricula = new JTextField();
        txtMatricula.setBounds(20, 442, 462, 50);
        add(txtMatricula);

        // --- BOTÕES ---
        // Padronizados para o mesmo tamanho das outras telas (100x40)
        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(146, 512, 100, 40);
        add(btnSalvar);

        btnApagar = new JButton("Apagar");
        btnApagar.setBounds(341, 512, 100, 40);
        add(btnApagar);

        // --- PAINEL DIREITO (Retângulo cinza) ---
        painelDireito = new JPanel();
        painelDireito.setBackground(new Color(210, 210, 210));
        painelDireito.setBounds(497, 77, 244, 419);
        add(painelDireito);
    }
}