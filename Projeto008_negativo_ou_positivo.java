package exercicios_p_iniciantes_estrutura_condicional;
import java.util.Scanner;

public class estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int digite_um_numero;
		
		System.out.println("Digite um numero:");
		
		digite_um_numero = sc.nextInt();
		
		if (digite_um_numero < 0 ) 
		{
			System.out.println("Essse número é negativo!");
	   
		}
		
		else if (digite_um_numero == 0)
		{
			System.out.println("NÃO negativo!");
		}
		
		else 
		{
			System.out.println("NÃO negativo!!");
		}
		sc.close();
 }
}
