/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.burato.model;

public class Produto {

    private int codigo;
    private String nome;
    private double valor;
    private CategoriaProduto categoria;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, double valor, CategoriaProduto categoria, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", categoria=" + categoria + ", quantidadeEstoque=" + quantidadeEstoque + '}';
    }
}
