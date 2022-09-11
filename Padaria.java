
public class Padaria {
	
		
		int quantidadePaes;
		int quantidadeSonhos;
		int quantidadeLeite;
		
		public int getQuantidadePaes() {
			return quantidadePaes;
		}
		public void setQuantidadePaes(int quantidadePaes) {
			this.quantidadePaes = quantidadePaes;
		}
		public int getQuantidadeSonhos() {
			return quantidadeSonhos;
		}
		public void setQuantidadeSonhos(int quantidadeSonhos) {
			this.quantidadeSonhos = quantidadeSonhos;
		}
		public int getQuantidadeLeite() {
			return quantidadeLeite;
		}
		public void setQuantidadeLeite(int quantidadeLeite) {
			this.quantidadeLeite = quantidadeLeite;
		}
		
		
		public int verificaQuantidade() {
			if (quantidadePaes > quantidadeSonhos) {
				System.out.println("Quantidade de pães: " + quantidadePaes);
				System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
				System.out.println("Quantidade de leites: " + quantidadeLeite);
				System.out.println("o seu número de pães é maior");
			} else {
				System.out.println("Quantidade de pães: " + quantidadePaes);
				System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
				System.out.println("Quantidade de leites: " + quantidadeLeite);
				System.out.println("Seu numero de sonhos é maior");
			}
			if (quantidadeLeite > quantidadeSonhos) {
				System.out.println("Quantidade de pães: " + quantidadePaes);
				System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
				System.out.println("Quantidade de leites: " + quantidadeLeite);
				System.out.println("o seu número de leite é maior");
			} else {
				System.out.println("Quantidade de pães: " + quantidadePaes);
				System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
				System.out.println("Quantidade de leites: " + quantidadeLeite);
				System.out.println("Seu numero de sonhos é maior");
			}
			if (quantidadeLeite > quantidadePaes) {
				System.out.println("Quantidade de pães: " + quantidadePaes);
				System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
				System.out.println("Quantidade de leites: " + quantidadeLeite);
				System.out.println("o seu número de leite é maior");
			} else {
				System.out.println("Quantidade de pães: " + quantidadePaes);
				System.out.println("Quantidade de sonhos: " + quantidadeSonhos);
				System.out.println("Quantidade de leites: " + quantidadeLeite);
				System.out.println("Seu numero de pães é maior");
			}
			
			return 0;
		}
	}


