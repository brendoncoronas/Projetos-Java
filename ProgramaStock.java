import java.util.Locale;
import java.util.Scanner;

public class ProgramaStock {

    public static void main(String[] args) {
        
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    ProdutosStock product = new ProdutosStock();
    System.out.println("Enter product data:");
    System.out.print("Name: ");
    product.name = sc.nextLine();
    product.price = sc.nextDouble();
    System.out.print("Quantity in stock:");
    product.quantity = sc.nextInt();

    sc.close();
    
}
}
