package number;
public class Number {
    
    public static void main(String[] args) {
        
        // números inteiros -> INT
        
        int idade = 20;
        int temperatura = -20;
        
        // números inteiros longos -> long
        
        long bacterias = 489374837L;
        
        // números reais -> double
        double real = 30.40;
        double altura = 1.87;
        double Kg = 75.0;
        
        // números reais pequenos -> float
        float peso = 75f;
        float imc = 40.5f;
        
        // operações matematicas básicas
        
        System.out.println("Soma "+(peso + altura));
        System.out.println("Subtração "+(peso - altura));
        System.out.println("Multiplicação "+(peso * altura));
        System.out.println("Divisão "+(peso / altura));
        
        // potência -> Math.pow
        double doisAoCubo = Math.pow(2,3);
        double tresAQuarta  = Math.pow(3,4);
        
        System.out.println(doisAoCubo);
        System.out.println(tresAQuarta);
        
        // raiz quadrada -> Math.sqrt()
        double raiz144 = Math.sqrt(144);
        double raiz9 = Math.sqrt(9);
        
        System.out.println(raiz144);
        System.out.println(raiz9);
        
        // Maior e menor entre 2 números
        double menor = Math.min(20, 40);
        double maior = Math.max(20, 40);
        
        System.out.println(menor);
        System.out.println(maior);
    }
    
}
