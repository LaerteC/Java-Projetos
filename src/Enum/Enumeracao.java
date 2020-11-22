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
public enum Enumeracao {
    
    PESSOA_FISICA(1," Pessoa Física") , PESSOA_JURIDICA(2," Pessoa Jurídica");
    
    private int tipo;
    private String nome;
    
    Enumeracao(int tipo,String nome){
        this.tipo=tipo;
        this.nome=nome;
        
    }
    
    public int getTipo(){
        return tipo;
        
    }
    
    public String getNome(){
        return this.nome;
    }
  
}
