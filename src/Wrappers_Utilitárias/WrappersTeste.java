/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wrappers_Utilitárias;

/**
 *
 * @author laert
 */
public class WrappersTeste {
    
    public static void main(String [] args){
        byte bytePrimitivo=2;
        short shortPrimitivo=3;
        int intPrimitivo=4;
        long longPrimitivo=5L;
        float floatPrimitivo=9F;
        double doublePrimitivo=12D;
        char charPrimitivo='A';
        boolean booleanoPrimitivo;
        
        // Auto Boxing = Colocar um tipo primitivo dentro de uma caixa . No caso um Wrapper !
            
        Byte byteWrapper=1;
        Short shortWrapper=2;
        Integer inteirorapper= new Integer(10);
        Long longWrapper=12L;
        Float floatWrapper= new Float("15");
        Double doubleWrapper=15D;
        Character charWrapper= new Character('B');
        Boolean booleanoWrapper=new Boolean("Laerte Souza");
        
        System.out.println(charWrapper);
        System.out.println(booleanoWrapper);
        
        System.out.println(inteirorapper);
       // Un boxing = Quando um tipo primitivo recebe uma variavel Wrapper ;
        int i=inteirorapper;
        
        String valor="155";
        Float f=Float.parseFloat(valor);
        System.out.println(f);
        
        Long longNumero=Long.valueOf("12");
        System.out.println(longNumero);
        
        Character.isDigit('A');
        
        // Perfeito se acaso eu quero verificar se isso é um Dígito.
        char num='2';
        System.out.println(Character.isDigit(num));
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetterOrDigit('6'));
    }
    
}
