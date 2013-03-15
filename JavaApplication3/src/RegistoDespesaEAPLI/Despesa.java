/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistoDespesaEAPLI;

/**
 *
 * @author Antonio
 */
public class Despesa {
    private int Valor;
    private String Desc;
    /**
     * @param valor the valor to set
     */
    public int getValor() {
        return Valor;
    }
    
    public void setValor(int valor) {
        this.Valor = valor;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return Desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.Desc = desc;
    }
}
