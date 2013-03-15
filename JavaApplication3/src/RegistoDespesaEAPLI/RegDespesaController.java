/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistoDespesaEAPLI;

/**
 *
 * @author Antonio
 */
public class RegDespesaController {
    public boolean RegDespesaint(int Valor, String Desc){
        while (Valor==0 || Desc==""){
            return false;
        }
        return true;
    }
}
