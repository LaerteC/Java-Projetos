
package Assertivass;

/**
 *
 * @author laert
 */
public class Assertivas {
    
    
    public static void main(String [] args){
         calcularSalario(1500);
         diasDaSemana(10);
    }
    private static void calcularSalario(double salario){
          //  Aqui faço um calculo para o Salário !!!
          assert(salario>0):" O salário é maior que zero Sempre ! "+salario;
         // assert salario>0;
         
          
    }
    
    public static void calculaSalario(double salario){
        if(salario<0){
            throw new IllegalArgumentException("Valor Inválido");
        }
    }
    
    public static void diasDaSemana(int dia){
        
        switch(dia){
            case 1:System.out.println(" Segunda-Feira");
                break;
            case 2:System.out.println(" Terça-Feira");
                break;
            case 3:System.out.println(" Quarta-Feira");
                break;
            case 4:System.out.println(" Quinta-Feira");
                break;
            case 5:System.out.println(" Sexta-Feira");
                break;
            case 6:System.out.println(" Sábado");
                break;
            case 7:System.out.println(" Domingo");
                break;
                
            default: assert false;
        }
    }
    
}
