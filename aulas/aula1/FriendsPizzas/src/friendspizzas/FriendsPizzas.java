package friendspizzas;

import java.util.Scanner;

public class FriendsPizzas {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos vão rachar a pizza");
        int friends = leitor.nextInt();
        
        System.out.println("Qual o Sabor da Pizza");
        String sabor = leitor.next();
        
        System.out.println("Qual o valor da Pizza");
        float value = leitor.nextFloat();
                
                
        String frase2 = String.format("Em %s moram %s pessoas e faz R$%s agora", friends, sabor, value);
        System.out.println(frase2);
            
        
    }
    
}
