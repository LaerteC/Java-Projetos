/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModificadorFinal;

/**
 *
 * @author laert
 */
public final class Carro {

    public static final double VELOCIDADE_LIMITE = 200;
    private final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    public Comprador getComprador() {

        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {

        String retorno = " Nome " + nome + " Marca " + marca;

        return retorno;

    }

}
