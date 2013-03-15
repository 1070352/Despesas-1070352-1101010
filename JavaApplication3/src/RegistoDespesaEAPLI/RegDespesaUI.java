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
    RegDespesaController i = new RegDespesaController();
    public void registardespesa(){
         int val = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Introduza um valor"));
         String desc = JOptionPane.showInputDialog(null, "Introduza uma descriçao");
         
         i.RegDespesaint(val, desc);
         
         JOptionPane.showMessageDialog(null, "Registo Introduzido" + "Descriçao: " + desc +"Valor:" + val);
    }
    
}
