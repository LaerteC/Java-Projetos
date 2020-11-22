/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseAbstrataTeste;

import ClasseAbstrata.Funcionario;
import ClasseAbstrata.Gerente;
import ClasseAbstrata.Vendedor;

/**
 *
 * @author laert
 */
public class TesteFunc {
    
    public static void main(String [] args){
        
        
        
        Gerente g= new Gerente(" AnaMaria","2017-1",59000);      
        g.calcularSalario();
        
        Vendedor vendedor= new Vendedor(" Laerte Souza","2020-4",5800,2500);
        System.out.println(g);
        
        vendedor.calcularSalario();
        
        System.out.println(vendedor);
      
    }
    
}
