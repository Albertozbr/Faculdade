package sistema;
import java.time.LocalDate;


public abstract class Pessoa {
    
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String cpf;
    
    public Pessoa(String nome, LocalDate dataNascimento, String email, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public abstract String mostrarDados();
}
