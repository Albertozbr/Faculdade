package janela;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class janelaPrincipal extends JFrame {
    private JButton btnCadastrarCurso;
    private JButton btnCadastrarDisciplina;
    private JButton btnCadastrarProfessor;
    private JButton btnCadastrarAluno;

    public janelaPrincipal() {
        setJanela();
        criarComponentes();
    }

    private void setJanela() {
        setTitle("Sistema Acadêmico POO");
        setSize(1440, 720);
        setLayout(null);
        setResizable(false);

        getContentPane().setBackground(new Color(225, 235, 250));
    }

    private void criarComponentes() {
        try {
            btnCadastrarCurso = new JButton("Cadastrar curso",
                    new ImageIcon(getClass().getResource("/IMG/Icone_Cadastro_Curso.png")));
            btnCadastrarDisciplina = new JButton("Cadastrar disciplina",
                    new ImageIcon(getClass().getResource("/IMG/Icone_Cadastro_Disciplina.png")));
            btnCadastrarAluno = new JButton("Cadastrar Aluno",
                    new ImageIcon(getClass().getResource("/IMG/Icone_Cadastro_Aluno.png")));
            btnCadastrarProfessor = new JButton("Cadastrar Professor",
                    new ImageIcon(getClass().getResource("/IMG/Icone_Cadastro_Prof.png")));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERRO ao carregar a imagem, verifique" + e.getMessage());
            btnCadastrarCurso = new JButton("Cadastrar curso");
            btnCadastrarDisciplina = new JButton("Cadastrar disciplina");
            btnCadastrarAluno = new JButton("Cadastrar Aluno");
            btnCadastrarProfessor = new JButton("Cadastrar Professor");
        }
        btnCadastrarCurso.setBounds(40, 40, 180, 150);
        btnCadastrarDisciplina.setBounds(250, 40, 180, 150);
        btnCadastrarAluno.setBounds(460, 40, 180, 150);
        btnCadastrarProfessor.setBounds(670, 40, 180, 150);

        add(btnCadastrarCurso);
        add(btnCadastrarDisciplina);
        add(btnCadastrarAluno);
        add(btnCadastrarProfessor);
    }

    
}
