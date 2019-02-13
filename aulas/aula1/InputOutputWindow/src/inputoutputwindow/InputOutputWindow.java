package inputoutputwindow;

import javax.swing.JOptionPane;

public class InputOutputWindow {

    public static void main(String[] args) {
        
        // Exibindo uma window
        
        JOptionPane.showMessageDialog(null, "Frase IAEEEEEEEEEEE");
        
        // lendo informações de uma janela
        // IMPORTANTE: Tudo o que é lido da Janela é String
        
        String fruta = JOptionPane.showInputDialog("Qual fruta?");
        
        JOptionPane.showMessageDialog(null,fruta);
        System.out.println(fruta);
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade"));
        System.out.println(idade);
        // número real
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Qual sua nota"));
        
        System.out.println(nota);
        // CURIOSIDADE
        /*
            os métodos parseInt e parseDouble
            pode ser substituidos por valueOf
        */
        
    }
    
}
