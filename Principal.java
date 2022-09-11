import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Padaria padaria = new Padaria();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade Pães: ");
		padaria.quantidadePaes = entrada.nextInt();
		
		System.out.println("Digite a quantidade de sonhos: ");
		padaria.quantidadeSonhos = entrada.nextInt();
		
		System.out.println("Digite a quantidade de leites: ");
		padaria.quantidadeLeite = entrada.nextInt();
		
		System.out.print(padaria.verificaQuantidade());
		
	}

		

}