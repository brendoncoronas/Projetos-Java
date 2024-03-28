package exercicios_p_iniciantes_estrutura_condicional;

import java.util.Scanner;

public class Mini_mercado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BEM VINDO AO MERCADÃO DINFO!!");
		System.out.println();
		System.out.println("Esse são os nosso produtos:");
		System.out.println();
		System.out.println("[1] - cachorro quente - preço R$ 4,00| "
				+ "[2] - X-Salada - R$ 4,50|"
				+ "[3] - X-Bacon - R$ 5,00|"
				+ "[4] - Torrada simples - R$ 2,00|"
				+ "[5] - Refrigerante - R$ 1,50");
		
		System.out.println("O que vai querer?");
		int numeroEscolhido = sc.nextInt();
		
		System.out.println("Quantos vai querem ?");
		int quantidade = sc.nextInt();
		
		double total = 0;
		
		if (numeroEscolhido == 1) {
			
			total = quantidade * 4.0;
		}
		
		else if (numeroEscolhido == 2) {
			total = quantidade * 4.5;
		}
		
		else if (numeroEscolhido == 3) {
			total = quantidade * 5.0;
		}
		
		else if (numeroEscolhido == 4) {
			total = quantidade * 2.0;
		}
		
		else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();

	}

}
