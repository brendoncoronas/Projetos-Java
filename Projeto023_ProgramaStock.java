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

    System.out.println();
    System.out.println("Product data:" + product);

    System.out.println();
    System.out.println("Enter the number of products to be added in stock:");
    int quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println();
    System.out.println("Updated data " + product);       

    System.out.println();
    System.out.println("Enter the number of products to be removed from stock:");    
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println();
    System.out.println("Updated data " + product);    
        
    sc.close();
    
}
}
