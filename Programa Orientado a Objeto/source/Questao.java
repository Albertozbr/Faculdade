
import java.util.Scanner;

public class Questao {
    public static void main(String[] aStrings){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        for(int i = 0; i<n;i++){
            double kg = scanner.nextDouble();
            int contador=0;


            while(kg>1.0){
                kg = kg/2.0;
                contador++;
            }
            System.out.println(contador + " dias"); 
        }

        scanner.close();
    }
}
