package sistema;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, LocalDate dataNascimento, String email, String cpf, String matricula) {
        super(nome, dataNascimento, email, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String mostrarDados(){
        return "Nome: " + super.getNome() + "CPF: "+ super.getCpf()+ "e-mail: "+ super.getEmail()+ "Data de nascimento: "+ super.getDataNascimento()+
        "Matricula: "+ this.matricula;
    }
    
}
