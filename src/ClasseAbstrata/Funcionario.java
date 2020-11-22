
package ClasseAbstrata;



public abstract  class Funcionario extends Pessoa {
    
    
    protected String clt;
    protected double salario;

    public Funcionario(){
    
    }
    public Funcionario(String nome,String clt, double salario){
        
        this.nome=nome;
        this.clt=clt;
        this.salario=salario;
        
    }
    public abstract void calcularSalario();
    
  

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
   public String toString(){
       String s="Nome : "+nome+ " Tipo de Trabalho :" + clt+ " Salario " +salario;
       return s;
   }
}
