package textsimple;

public class TextSimple {
    
    public static void main(String[] args) {
        // Variaveis
        String time = "S.C.Corinthians";
        String bairro = "Itaquera";
        
        // concatenação String
        String frase1 = "O Time " + time +" fica em "+bairro;
        
        System.out.println(frase1);
        
        String frase2 = String.format("Time: %s Bairro: %s", time, bairro);
        
        System.out.println(frase2);
        
        String frase3 = "";
        frase3+=frase2;
        System.out.println(frase3);
        
        
    }
    
}
