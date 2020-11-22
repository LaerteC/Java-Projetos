

package Polimorfismo;

/**
 *
 * @author laert
 */
public class TestePolimorfismo {
    
    public static void main(String [] args){
        
        Gerente g=new Gerente(" Laerte Souza",8000,2500);
        
        Vendedor v=new Vendedor(" Rodrigo Faro",9000,50000);
        
        RelatorioPagamento relatorios= new RelatorioPagamento();
        
        relatorios.relatorioGenerico(g);
        
        System.out.println(" **********************");
        
        relatorios.relatorioGenerico(v);
        
       
        
        
       
    }
    
}
