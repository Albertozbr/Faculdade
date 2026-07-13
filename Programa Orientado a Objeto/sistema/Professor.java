package sistema;

import java.time.LocalDate;

public  abstract class Professor extends Pessoa {
    private String id;
    private String formacao;
    private String especialidade;

    public Professor(String nome, LocalDate dataNascimento, String email, String cpf, String id, String formacao, String especialidade) {
        super(nome, dataNascimento, email, cpf);
        this.id = id;
        this.formacao = formacao;
        this.especialidade = especialidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String mostrarDados(){
        return ("Nome: "+super.getNome()+"CPF: "+super.getCpf()+"e-mail: "+super.getEmail()+"Data de nascimento: "+ super.getDataNascimento()+"numero de  identidade: "+this.id+"formação: "+this.formacao+"Especialidade: "+this.especialidade);
       
    }
}
