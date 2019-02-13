package inputdefault;

import java.util.Scanner;

public class InputDefault {

    public static void main(String[] args) {
        
        
        // para receber dados no Console
        // usamos o Scanner do Java
        
        Scanner leitor = new Scanner(System.in);
        // ao criar esse "leitor", pode,os usá-lo várias vezes
        
        // lendo um texto
        
        System.out.println("Qual sua cidade?");
        String cidade = leitor.nextLine();
        
        // lendo um número inteiro
        System.out.println("Quantos Habitantes ela tem?");
        int habitantes = leitor.nextInt();
        
        // lendo um número real
        System.out.println("Qual a temperatura lá agora");
        double temp = leitor.nextDouble();
        
        // exibindo menssage
        String frase2 = String.format("Em %s moram %s pessoas e faz %sº agora", cidade, habitantes, temp);
        System.out.println(frase2);
        
        
    }
    
}
