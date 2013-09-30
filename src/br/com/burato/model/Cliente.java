
package br.com.burato.model;

public class Cliente extends Pessoa {

    private double saldoDisponivel;

    public Cliente(double saldoDisponivel, int codigo, String nome, String endereco) {
        super(codigo, nome, endereco);
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    public String toString() {
        return "Cliente{" + "saldoDisponivel=" + saldoDisponivel + '}';
    }
}
