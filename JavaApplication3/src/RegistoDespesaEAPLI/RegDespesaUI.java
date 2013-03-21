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
         Despesa d = new Despesa( val , desc);
         
         if ( i.RegDespesaint(val, desc) == false){
            JOptionPane.showMessageDialog(null, "Erro");
            }else
            JOptionPane.showMessageDialog(null, "Registo Introduzido\n" + "Descriçao:\n" + d.getDesc() +"\nValor:\n" + d.getValor());     
    }
    
}
