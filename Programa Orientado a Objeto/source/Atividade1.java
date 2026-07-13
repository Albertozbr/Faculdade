
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane; 

public class Atividade1{
    public static void main(String[] args){
        Pessoa pessoa1;
        LocalDate dataNascimento = LocalDate.of(2007, Month.APRIL, 12);
        String nome = JOptionPane.showInputDialog(null,"Digite o nome da pessoa:");
        String cpf = JOptionPane.showInputDialog(null,"Digite o CPF da pessoa:");
        String cidadeNas = JOptionPane.showInputDialog(null,"Digite a cidade de nascimento da pessoa:");
        String estadoNas = JOptionPane.showInputDialog(null,"Digite o estado de nascimento da pessoa:");
        String paisNas = JOptionPane.showInputDialog(null,"Digite o país de nascimento da pessoa:");
        String email = JOptionPane.showInputDialog(null,"Digite o email da pessoa:");
        String telefone = JOptionPane.showInputDialog(null,"Digite o telefone da pessoa:");
        String genero = JOptionPane.showInputDialog(null,"Digite o gênero da pessoa:");
        
        pessoa1 = new Pessoa(nome, dataNascimento, cpf, genero, cidadeNas, estadoNas, paisNas, email, telefone);
        pessoa1.mostrarDados();

    
    }
}

   