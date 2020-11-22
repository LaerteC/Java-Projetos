/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author laert
 */
public abstract  class Funcionario {
    
    protected String nome;
    protected double salario;
    
    public Funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;
        
    }
    
    public abstract void calcularPagamento();

    @Override
    public String toString() {
        return "Funcionario {"+
                "Nome =" +nome+ 
                "Salario =" +salario;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
