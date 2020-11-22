/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes;

/**
 *
 * @author laert
 */
public class MultiplasRuntimeExcecoes {
    
    public static void main(String [] args){
        
        try{
            
            throw new RuntimeException();
            
        }catch(ArrayIndexOutOfBoundsException ex){
            
            System.out.println(" Dentro do ArrayIndexOutOfBounds");
            
        }catch(IllegalArgumentException ex){
            System.out.println(" Dentro do IllegalArgumentException");
            
        }catch(ArithmeticException ex){
            
            System.out.println(" Dentro do ArithmeticException ");
            
        }
    }
    
}
