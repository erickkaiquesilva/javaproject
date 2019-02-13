package sayajin;

import java.util.Scanner;

public class Sayajin {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o KI do lutador");
        double kiA = leitor.nextDouble();
        
        System.out.println("Qual o nome do lutador");
        String name = leitor.next();
        
        System.out.println("Bem vindo Guerreiro "+name);
        System.out.println("O poder Sayajin A: "+kiA);
        System.out.println("O poder Sayajin B: "+kiA * 50);
        System.out.println("O poder Sayajin 2 C: "+kiA * 100);
        System.out.println("O poder Sayajin 3 D: "+kiA * 500);
        System.out.println("O Super Sayajin E: "+kiA * 1000);
        System.out.println("O Super Sayajin F: "+kiA * 50000);
        
    }
    
}
