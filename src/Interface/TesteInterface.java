/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author laert
 */
public class TesteInterface {
    
    public static void main(String [] args){
        
        Produto p=new Produto(" Notebook",1.5,3200);
        p.calcularImposto();
        p.calcularFrete();
        
        System.out.println(p);
    }
    
}
