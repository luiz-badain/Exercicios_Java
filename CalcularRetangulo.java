import java.util.Scanner;
public class CalcularRetangulo {
    public static void main(String args[]){
        //Leias as medidas(b,h) de um retângulo. Escreva a área calculada.
        
        // Declaração de variaveis
        Scanner in = new Scanner(System.in);
        int b,h, area;
        
        //entrada
        System.out.println("Vamos calcular a área do retângulo!");
        System.out.println("Primeiro, informe qual é a medida da base do retângulo:");
        b= in.nextInt();
        System.out.println("agora informe a altura do retângulo");
        h=in.nextInt();
        
        //Processamento
        area= b * h;
        
        //Saída
        if(b == h){
        System.out.println(" A área do quadrado é "  + area);
        } else{
         System.out.println(" A área do retângulo é " + area);
        
    }
    
    }
}