/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecoes;

/**
 *
 * @author laert
 */
public class TesteAutoFechar implements AutoCloseable {

    @Override
    public void close() throws Exception {

        System.out.println(" Fechando o Teste Automaticamente");
    }
    
}
