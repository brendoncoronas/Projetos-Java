package projeto008_horas_trabalhadas;

import java.util.Locale;
import java.util.Scanner;

public class projeto008_horas_trabalhadas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int numero, horas;
		
		double valorHora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("Numero " + numero);
		System.out.printf("Salario = U$ %.2f%n", salario);
		
		sc.close();
		
		;

	}

}
