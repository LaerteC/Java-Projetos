/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;



public class Cliente {
    
     public enum TipoPagamento{
            AVISTA, APRAZO
    }
    private String nome;
    
    private Enumeracao tipo;
    
    private TipoPagamento tipoPagamento;    
    
  
    
    public Cliente(String nome,Enumeracao tipo,TipoPagamento tipoPagamento){
        this.nome=nome;
        this.tipo=tipo;
        this.tipoPagamento=tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Enumeracao getTipo() {
        return tipo;
    }

    public void setTipo(Enumeracao tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        
        String s=" Nome : "+nome + " Tipo : "+ tipo+ "Tipo Pagamento "+ tipoPagamento;
        return s;
    }
}
