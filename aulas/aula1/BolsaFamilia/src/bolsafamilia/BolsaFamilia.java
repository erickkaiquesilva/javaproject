package bolsafamilia;

import javax.swing.JOptionPane;



public class BolsaFamilia {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bem vindo ao Sistema Bolsa Familia");
        
        String responsavel = JOptionPane.showInputDialog("Qual o Nome do Responsável pela Familia?");
        
        String city = JOptionPane.showInputDialog("Em qual cidade a Familia Reside?");
        
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos menores de 18 anos tem na familia?"));
        
        int qtdPne = Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos PNE tem na familia?"));
        
        int qtdSenior = Integer.parseInt((JOptionPane.showInputDialog("Quantos maiores de 60 anos tem na familia?")));
        
        
        double totalC = qtd * 12.50;
        double totalD = qtdPne * 14.00;
        double totalE = qtdSenior * 10.00;
        
        double total = totalC + totalD + totalE;
        
        
        String exibe = String.format("A Fámilia do responsável %s vai receber um total de R$%s por mês \n -Valor pelos menores de 18 anos: R$%s \n -Valor pelos PNE: R$%s \n -Valor pelos idosos: R$%s \n a cidade onde resiem é %s ", 
                responsavel, total, totalC, totalD, totalE, city);
        
        JOptionPane.showMessageDialog(null, exibe);
        
        System.out.println(exibe);
        
        
    }
    
}
