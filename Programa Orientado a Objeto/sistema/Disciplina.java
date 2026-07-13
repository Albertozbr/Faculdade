package sistema;

import java.util.ArrayList;

public class Disciplina {
    
    private int cargaHorario;
    private String nome;
    private int capacidade;
    private Professor responsavel;
    private ArrayList<Aluno>alunos;
    public Disciplina(int cargaHorario, String nome, int capacidade) {
        this.cargaHorario = cargaHorario;
        this.nome = nome;
        this.capacidade = capacidade;
    }
    public int getCargaHorario() {
        return cargaHorario;
    }
    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public Professor getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Professor responsavel) {
        this.responsavel = responsavel;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    } 
}
