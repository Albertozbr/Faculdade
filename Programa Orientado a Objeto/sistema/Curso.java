package sistema;

import java.util.ArrayList;

public class Curso {

    private String nome;
    
    private ArrayList<Aluno> alunos;
    /*Alunos */
    private String serie;
    private ArrayList<Professor> professor;
    /*Professor */
    private String diario;
    private ArrayList<Disciplina> disciplina;
    /*Disciplina */
    public Curso(String nome, String serie, String diario, ArrayList<Disciplina> disciplina) {
        this.nome = nome;
        this.serie = serie;
        this.diario = diario;
        this.disciplina = disciplina;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public ArrayList<Professor> getProfessor() {
        return professor;
    }
    public void setProfessor(ArrayList<Professor> professor) {
        this.professor = professor;
    }
    public String getDiario() {
        return diario;
    }
    public void setDiario(String diario) {
        this.diario = diario;
    }
    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

}
