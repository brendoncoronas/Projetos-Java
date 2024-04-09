public class PrincipalAluno {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Brendon coronas", "123456789", 9, 10);
        Aluno aluno2 = new Aluno("Nathan squeff", "987654321", 7, 8);
        Aluno aluno3 = new Aluno("Vitão", "1098765432", 6, 4);

        System.out.println("Informações do aluno 1:");
        aluno1.imprimeInfo();

        System.out.println("Informações do aluno 2:");
        aluno2.imprimeInfo();

        System.out.println("Informações do aluno 3");
        aluno3.imprimeInfo();

        aluno2.setNotaGA(9);

        System.out.println("\nMédia final após alteração da nota do GA: "+aluno2.calculaMediaFinal());   
        
        System.out.println("Matrícula de Vitimado: "+aluno3.getMatricula());
        
        aluno1.setMatricula("1585228");     
      
        aluno2.setNotaGB(Teclado.leDouble("Informe a nova nota do GB: "));        
    }

}
