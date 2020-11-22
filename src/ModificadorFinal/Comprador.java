
package ModificadorFinal;


public class Comprador {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toString(){
         String s=" Nome "+ nome;
         return s;
    }
}
