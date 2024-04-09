public class TesteFruta {
    public static void main(String[] args){
    Fruta f1 = new Fruta("Maça", 78.3);
    System.out.println("O preço da "+ f1.getNome()+" é R$"+f1.getPreco());
    f1.setNome("laranja");

    System.out.println("O novo nome da fruta é "+f1.getNome());
    f1.setpreco(8.50);
    System.out.println("O novo valor da fruta é "+f1.getPreco());

    Fruta f2 = new Fruta("abacate", 35.50);
    Fruta f3;
    f3 = new Fruta("pessego", 10.50);

    System.out.println("Valor das frutas com imposto ficou:");
    double imposto = 0.1;
    System.out.println("- "+f1.getNome()+": "+f1.calculaPreco(imposto));
    System.out.println("- "+f2.getNome()+": "+f2.calculaPreco(imposto));
    System.out.println("- "+f3.getNome()+": "+f3.calculaPreco(imposto));


    }
}
