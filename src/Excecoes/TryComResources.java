/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author laert
 */
public class TryComResources {
    
    public static void main(String [] args){
       try{
        lerArquivo();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
   public static void lerArquivo() throws Exception{
       try(TesteAutoFechar fechar=new TesteAutoFechar();){
          
           
       }
   }
    public static void lerArquivoOLD(){
        Reader  reader=null;
        try{
        reader=new BufferedReader(new FileReader("Texto.txt"));
        
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally{
            try{
                if(reader!=null){
            reader.close();}
                
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        
    }
    
}
