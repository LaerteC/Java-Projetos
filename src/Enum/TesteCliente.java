/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author laert
 */
public class TesteCliente {
    
    public static void main(String []args){
        
        Cliente c=new Cliente("Anna",Enumeracao.PESSOA_FISICA,Cliente.TipoPagamento.APRAZO);
        System.out.println(c);
    }
    
}
