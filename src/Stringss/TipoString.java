/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stringss;

/**
 *
 * @author laert
 */
public class TipoString {
    
    public static void main(String [] args){
        
        String nome ="  LaerteSouza";
        System.out.println(nome.charAt(2));
        
        System.out.println(nome.length());
        
        System.out.println(nome.replace('e', 'a'));
        System.out.println(nome.toUpperCase());
        
        System.out.println(nome.substring(0, 5));
        System.out.println(nome.trim());
    }
}
