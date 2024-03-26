package exercicios_p_iniciantes_estrutura_condicional;
import java.util.Scanner;

public class par_ou_impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número, irei dizer se é par ou impar:");
		
		int N = sc.nextInt();
		
		if (N % 2 == 0)
		{
			System.out.println("PAR");
		}
		else
		{
			System.out.println("IMPAR");
		}
		sc.close();

	}

}
