
/* import java.util.List;

public class Turma {
    private String codigo;
    private String disciplina;
    private int capacidade;
    private List<Discente> alunos;
    private Coordenador coordenadorCurso;
    public Turma(String codigo, String disciplina, int capacidade, List<Discente> alunos, Coordenador coordenadorCurso) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.capacidade = capacidade;
        this.alunos = alunos;
        this.coordenadorCurso = coordenadorCurso;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public List<Discente> getAlunos() {
        return alunos;
    }
    public Coordenador getCoordenadorCurso() {
        return coordenadorCurso;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public void setAlunos(List<Discente> alunos) {
        this.alunos = alunos;
    }
    public void setCoordenadorCurso(Coordenador coordenadorCurso) {
        this.coordenadorCurso = coordenadorCurso;
    }
    
     boolean matricularDiscente(Discente discente){
        boolean existeDiscente = false;
        for(int i=0;i<alunos.size();i++){
            if(discente.getMatricula()==alunos.get(i).getMatricula()){
                existeDiscente = true;
            }
        }
        if(existeDiscente){
            return false;
        }
        if(alunos.size()>=capacidade){
            return false;
        }
        alunos.add(discente);
        return true;
    }

    boolean cancelarMatricula(Discente discente){

            return alunos.remove(discente);
    }
    public String toString(){
        return "Código turma : "+codigo+"\n Disciplina: "+disciplina+"\n Total matriculados: "+alunos.size()+"\n tamanho total da turma"+capacidade+"\n";
    }
} */
