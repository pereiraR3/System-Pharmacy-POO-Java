
package com.mycompany.service;

import com.mycompany.products.Produtos;

public class Farmaceutico extends Funcionario {

    private double salario = getSalarioBase();
    private int vendas = 0;

    public Farmaceutico(String NomeFarmacia, String CNPJ, String Endereco, String Telefone, String Site,
            double SalarioBase, String Nome, String CPF, String tipoFuncionario, int certificado) {
        super(NomeFarmacia, CNPJ, Endereco, Telefone, Site, SalarioBase, Nome, CPF, tipoFuncionario, certificado);
        classificandoAcesso();
    }

    public void setSalario(double input) {
        this.salario += input;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setVendas(int input) {
        this.vendas += input;
        calcularComissaoMeta(this.vendas);
        super.setVendas(input);
    }

    public int getVendas() {
        return this.vendas;
    }

    @Override
    public void calcularSalarioPorProduto(Produtos produto) {
        setSalario(produto.getPreco() * 0.1);
        lucroBruto(produto.getPreco());
    }

    @Override
    public void calcularComissaoMeta(int vendas) {
        if (vendas > 6) {
            setSalario(getSalarioBase() * 0.1);
        }
    }

    @Override
    public void classificandoAcesso() {
        this.nivelAcesso = 1;
    }

    @Override
    public void lucroBruto(double valor) {
        calculandoLucroFarmacia(valor);
    }
}
