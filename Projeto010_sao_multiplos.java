package exercicios_p_iniciantes_estrutura_condicional;
import java.util.Scanner;

public class sao_multiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros e irei dizer se eles são multiplos:");
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0 )
		{
			System.out.println("SÃO MULTIPLOS!");
		}
		else
		{
			System.out.println("NÃO SÃO MULTOPLOS!");
		}
		
		sc.close();
	}

}
