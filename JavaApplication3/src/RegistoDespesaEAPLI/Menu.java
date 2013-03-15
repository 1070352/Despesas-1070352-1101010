package RegistoDespesaEAPLI;

import javax.swing.JOptionPane;


public class Menu {
    
    public static void main(String[] args) {
         int opcao;
         do {  
            opcao = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("" +  
                    "Bem vindo ao gestor de despesas mais sexy do ISEP\n" +  
                    "Escolha uma opçao:\n" +  
                    "1 - Registar Despesa.\n" +   
                    "2 - Sair."));  
            switch (opcao) {  
                case 1:  
                    //registardespesa();
                    JOptionPane.showMessageDialog(null, "A despesa foi registada");  
                    break;  
                case 7:
                    JOptionPane.showMessageDialog(null, "Fim!");  
                    break;  
                default:  
                    JOptionPane.showMessageDialog(null, "Opçao Invalida");  
            }  
        } while (opcao != 7);  
    }  
}

