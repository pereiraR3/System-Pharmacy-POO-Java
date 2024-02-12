package com.mycompany.products;

public abstract class Produtos {

    protected String Nome;
    protected double Preco;
    protected String Tipo;
    protected String Marca;

    public Produtos(String Nome, double Preco, String Tipo, String Marca) {
        this.Nome = Nome;
        this.Preco = Preco;
        this.Tipo = Tipo;
        this.Marca = Marca;
    }

    public String getNome() {
        return this.Nome;
    }

    public double getPreco() {
        return this.Preco;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public abstract double PrecoProduto();
}