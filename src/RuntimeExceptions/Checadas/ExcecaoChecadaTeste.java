

package RuntimeExceptions.Checadas;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author laert
 */
public class ExcecaoChecadaTeste {
    
    public static void main(String [] args){
     
        divisao(10,0);
    }
    private static void divisao(int numero1,int numero2){
        
        if(numero2==0){
            throw new IllegalArgumentException(" Ocorreu um Erro ");
        }
        int result= numero1/numero2;
        
        System.out.println(result);
    }
    
}
