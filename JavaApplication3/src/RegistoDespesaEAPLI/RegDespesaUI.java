/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistoDespesaEAPLI;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class RegDespesaUI {
    public void registardespesa(){
         int val = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Introduza um valor"));
         String desc = JOptionPane.showInputDialog(null, "Introduza uma descriçao");
         
         JOptionPane.showInputDialog(null, "Registo Introduzido" + "Nome: " + desc +"Valor:" + val);
    }
    
}
