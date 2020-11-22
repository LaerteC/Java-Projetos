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
public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente) {
//        System.out.println(" Gerando relatório de pagamento para Gerencia");
//        gerente.calcularPagamento();
//        System.out.println(" Nome " + gerente.nome);
//        System.out.println(" Salario " + gerente.salario);
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor) {
//
//        System.out.println(" Gerando relatório de pagamento para Vendedor");
//        vendedor.calcularPagamento();
//        System.out.println(" Nome " + vendedor.nome);
//        System.out.println(" Salario " + vendedor.salario);
//    }
    
    public void relatorioGenerico(Funcionario funcionario){
        
        System.out.println(" Gerando relatorio de Pagamento ");
        funcionario.calcularPagamento();
        System.out.println(" Nome "+ funcionario.nome);
        System.out.println(" Salario "+ funcionario.salario);
       
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente)funcionario;
            
            System.out.println(" Participação nos Lucros : "+g.getParticipacaoNoLucro());
            
        }
        if(funcionario instanceof Vendedor){
            Vendedor v=(Vendedor)funcionario;
            
            System.out.println(" Total de vendas :" +v.getTotalVendas());
        }
       
    }
}
