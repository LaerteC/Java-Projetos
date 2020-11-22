


package Polimorfismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laert
 */
public class DAOTeste {
    
    public static void main(String [] args){
        
        GenericDAO arquivoDAO=new DataBaseDAOimplimentacao();
        
        arquivoDAO.salvar();
        
        List<String> lista= new ArrayList<>();
        
        lista.add("Laerte");
        lista.add("Souza");
        lista.add("Costa");
        lista.add(" Neto");
        
        for(String nomes: lista){
            
            System.out.println(nomes);
        }
        
        
    }
    
}
