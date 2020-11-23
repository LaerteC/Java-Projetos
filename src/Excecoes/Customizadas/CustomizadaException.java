/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes.Customizadas;

/**
 *
 * @author laert
 */
public class CustomizadaException {
    
    public static void main(String [] args){
        try{
            logar();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private static void logar() throws LoginInvalidoException{
        String usuario="Laerte";
        String senha="213";
        String usuarioDigitado="Laerte";
        String senhaDigitada="13";
        
        if(!usuario.equalsIgnoreCase(usuarioDigitado)|| !senha.equalsIgnoreCase(senhaDigitada)){
            
         throw new LoginInvalidoException();
        }else{
            
            System.out.println(" Logado no Sistema"); 
        }
    }
    
}
