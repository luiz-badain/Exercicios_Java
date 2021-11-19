import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int notaA, notaB, notaC, mediaFinal;

        System.out.println("Olá, vamos calcular sua média?");
        System.out.println("Coloque sua primeira nota: ");
        notaA= in.nextInt();
        System.out.println("Coloque sua segunda nota: ");
        notaB= in.nextInt();
        System.out.println("Coloque sua terceira nota: ");
        notaC=in.nextInt();
       
        mediaFinal= (notaA+notaB+notaC)/3;

        System.out.println("Dividindo suas 3 notas, sua média é: " + mediaFinal);

    }
}

