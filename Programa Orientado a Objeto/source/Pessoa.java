

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 * 
 * @author Alberto Santos Entreportes
 * @since 23/04/2026
 * @version beta1
 */

public class Pessoa{
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private String genero;
    private String cidadeNas;
    private String estadoNas;
    private String paisNas;
    private String email;
    private String telefone;
    private Pessoa afiliacaoMaterna;
    private Pessoa afiliacaoPaterna;

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, String genero, String cidadeNas, String estadoNas, String paisNas, String email, String telefone){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.genero = genero;
        this.cidadeNas = cidadeNas;
        this.estadoNas = estadoNas;
        this.paisNas = paisNas;
        this.email = email;
        this.telefone = telefone;
    }

    /**
     * Mostra os dados da pessoa em uma caixa de diálogo.
     */
    public void mostrarDados(){
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nData de Nascimento: " + dataNascimento.toString() + "\nCPF: " + cpf + "\nGênero: " + genero + "\nCidade de Nascimento: " + cidadeNas + "\nEstado de Nascimento: " + estadoNas + "\nPaís de Nascimento: " + paisNas + "\nEmail: " + email + "\nTelefone: " + telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCidadeNas() {
        return cidadeNas;
    }

    public void setCidadeNas(String cidadeNas) {
        this.cidadeNas = cidadeNas;
    }

    public String getEstadoNas() {
        return estadoNas;
    }

    public void setEstadoNas(String estadoNas) {
        this.estadoNas = estadoNas;
    }

    public String getPaisNas() {
        return paisNas;
    }

    public void setPaisNas(String paisNas) {
        this.paisNas = paisNas;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
