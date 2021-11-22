import java.util.Scanner;

public class EscolherMeses {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int meses;
        
        System.out.println("Escolha um numero de 1 até 12 para escolher um mês do ano!:");
        
        meses= in.nextInt();

        switch (meses){
            case 1:
                System.out.println("O mês escolhido é : Janeiro");
                break;
            case 2:
                System.out.println("O mês escolhido é : Fevereiro");
                break;
            case 3:
                System.out.println(" O mês escolhido é : Março");
                break;
            case 4:
                System.out.println("O mês escolhido é : Abril");
                break;
            case 5:
                System.out.println("O mês escolhido é : Maio");
                break;
            case 6:
                System.out.println("O mês escolhido é : Junho");
                break;
            case 7:
                System.out.println("O mês escolhido é : Julho");
                break;
            case 8:
                System.out.println("O mês escolhido é : Agosto");
                break;
            case 9:
                System.out.println("O mês escolhido é : Setembro");
                break;
            case 10:
                System.out.println("O mês escolhido é : Outubro");
                break;
            case 11:
                System.out.println("O mês escolhido é : Novembro");
                break;
            case 12:
                System.out.println("O mês escolhido é : Dezembro");
                break;
            
        }
    }
}