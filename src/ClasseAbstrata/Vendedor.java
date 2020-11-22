
package ClasseAbstrata;



public class Vendedor extends Funcionario{

    protected double totalVendas;
    
    public Vendedor(){
            
    }
    
    public Vendedor(String nome,String clt,double salario,double totalVendas){
        super(nome,clt,salario);
        this.totalVendas=totalVendas;
    }
    
    @Override
    public void calcularSalario() {
           
        this.salario=salario+(totalVendas*0.3);
    
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    
}
