import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("coloque  seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println(" coloque sua altura");
        double altura= leitor.nextDouble();
        double imc;

        imc= peso / Math.pow(altura, 2);

        System.out.println("Seu IMC é: " + imc);
    }
}
