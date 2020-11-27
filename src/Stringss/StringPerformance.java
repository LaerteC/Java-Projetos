 

package Stringss;

/**
 *
 * @author laert
 */
public class StringPerformance {
    
    public static void main(String[] args) {
        
        long inicio= System.currentTimeMillis();
        
        concatenarString(12);
        
        long finaleira= System.currentTimeMillis();
        
        System.out.println(" Tempo Início : "+inicio);
        
        System.out.println(" Tempo Final : " +finaleira);
        
        System.out.println(" Tempo total das Strings ! : " +(finaleira-inicio));
        
        System.out.println("*******************");
        
        long inicioBuilder=System.currentTimeMillis();
        contatenarStringBuilder(12);
        long finalBuilder=System.currentTimeMillis();
        System.out.println(" Tempo total gasto é : " +(finalBuilder-inicioBuilder));
        
        System.out.println("##############################");
        
        System.out.println(" Strings Buffer ");
        
        long inicioBuffer= System.currentTimeMillis();
        concatenarStringBuffer(12);
        long finalBuffer=System.currentTimeMillis();
        
        System.out.println(" Tempo total estimado é : " +(finalBuffer-inicioBuffer));
    }
    
    public static void concatenarString(int tamanho){
        
        String vetorPalavras="";
        
        for(int i =0; i<tamanho;i++){
            vetorPalavras+=i;
        }
        
    }
    
    public static void contatenarStringBuilder(int tamanho){
         
        StringBuilder stringbuilder=new StringBuilder();
        for(int i=0;i<tamanho;i++){
            
            stringbuilder.append(i);
        }
        
    }
    public static void concatenarStringBuffer(int tamanho){
        
        StringBuffer stringBuffer= new StringBuffer();
        
        for(int i=0; i<tamanho;i++){
            stringBuffer.append(i);
        }
    }
}
