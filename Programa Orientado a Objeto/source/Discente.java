import java.time.LocalDate;

public class Discente extends Pessoa {

    private int matricula;
    private String curso;
    public Discente(String nome, LocalDate dataNascimento, String cpf, String genero, String cidadeNas,
            String estadoNas, String paisNas, String email, String telefone, int matricula, String curso) {
        super(nome, dataNascimento, cpf, genero, cidadeNas, estadoNas, paisNas, email, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public int getMatricula() {
        return matricula;
    }
    public String getCurso(){
        return curso;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    
}
