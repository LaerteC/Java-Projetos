/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuntimeExceptions;

/**
 *
 * @author laert
 */
public class RuntimeExceptionTeste {
    
    public static void main(String [] args){
        
        Object o=null;
        
        int[] vetor={2,3,4};
        int a=10;
        int b=0;
        int c = 0;
        
        if(b!=0){
          c=a/b;  
          System.out.println(c);
        }else{
        System.out.println(" Não é válido ");
    }
      
       try{
          System.out.println(vetor[3]);
       }catch(RuntimeException ex){
          System.out.println(" Ocorreu Um Erro absurdo");
       }
    }
}
