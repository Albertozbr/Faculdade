package janela;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class janelaCurso extends JFrame {

    // 1. Declarando Textos (Labels)
    private JLabel lblTitulo;
    private JLabel lblNome;
    private JLabel lblSerie;
    private JLabel lblDiario;
    private JLabel lblDisciplina;

    // 2. Declarando as Caixas de Digitação (TextFields)
    private JTextField txtNome;
    private JTextField txtSerie;
    private JTextField txtDiario;
    private JTextField txtDisciplina;

    // 3. Declarando os Botões (Buttons)
    private JButton btnSalvar;
    private JButton btnApagar;

    // 4. Declarando o quadro cinza da direita
    private JPanel painelDireito;

    public janelaCurso() {
        setJanela();
        criarComponentes();
    }

    private void setJanela() {
        setTitle("Cadastrar Curso");
        // Ajustei o tamanho da janela para caber o painel da direita sem cortar
        setSize(850, 650);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(225, 235, 250));
    }

    private void criarComponentes() {

        // --- TÍTULO ---
        lblTitulo = new JLabel("Cadastro do Curso");
        lblTitulo.setFont(new Font("Arial", Font.PLAIN, 24));
        lblTitulo.setBounds(15, 28, 250, 38);
        add(lblTitulo);

        // --- NOME ---
        lblNome = new JLabel("Nome:");
        lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
        lblNome.setBounds(35, 114, 80, 38);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(169, 102, 350, 50);
        add(txtNome);

        // --- SÉRIE ---
        lblSerie = new JLabel("Série:");
        lblSerie.setFont(new Font("Arial", Font.PLAIN, 20));
        lblSerie.setBounds(35, 219, 80, 38);
        add(lblSerie);

        txtSerie = new JTextField();
        txtSerie.setBounds(169, 206, 350, 50);
        add(txtSerie);

        // --- DIÁRIO ---
        lblDiario = new JLabel("Diário:");
        lblDiario.setFont(new Font("Arial", Font.PLAIN, 20));
        lblDiario.setBounds(35, 322, 80, 38);
        add(lblDiario);

        txtDiario = new JTextField();
        txtDiario.setBounds(169, 312, 350, 50);
        add(txtDiario);

        // --- DISCIPLINA ---
        lblDisciplina = new JLabel("Disciplina:");
        lblDisciplina.setFont(new Font("Arial", Font.PLAIN, 20));
        lblDisciplina.setBounds(8, 426, 152, 38);
        add(lblDisciplina);

        txtDisciplina = new JTextField();
        txtDisciplina.setBounds(169, 414, 350, 50);
        add(txtDisciplina);

        // --- BOTÕES ---
        // Peguei as coordenadas do botão em si (L:82, H:40) para ficar um tamanho bom
        // de clique
        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(174, 493, 100, 40);
        add(btnSalvar);

        btnApagar = new JButton("Apagar");
        btnApagar.setBounds(363, 491, 100, 40);
        add(btnApagar);

        // --- PAINEL DIREITO (Retângulo cinza) ---
        // No seu Figma estava H:50, mas pela proporção da imagem parece ter uns 500 de
        // altura
        painelDireito = new JPanel();
        painelDireito.setBackground(new Color(210, 210, 210)); // Cinza claro
        painelDireito.setBounds(550, 52, 244, 500);
        add(painelDireito);
    }
}