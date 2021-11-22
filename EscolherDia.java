import java.util.Scanner;

public class EscolherDia {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int meses;
        
        System.out.println("Escolha um numero de 0 até 6 para escolher um dia da semana!:");
        
        meses= in.nextInt();

        switch (meses){
            case 0:
                System.out.println("O dia escolhido é : Domingo");
                break;
            case 1:
                System.out.println("O dia escolhido é : Segunda-Feira");
                break;
            case 2:
                System.out.println(" O dia escolhido é : Terça-feira");
                break;
            case 3:
                System.out.println(" O dia escolhido é : Quarta-feira");
                break;
            case 4:
                System.out.println(" O dia escolhido é : Quinta-feira");
                break;
            case 5:
                System.out.println(" O dia escolhido é : Sexta-feira");
                break;
            case 6:
                System.out.println(" O dia escolhido é : Sabado");
                break;
            
        }
    }
}