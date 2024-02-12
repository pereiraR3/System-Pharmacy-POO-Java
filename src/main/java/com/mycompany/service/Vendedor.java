
package com.mycompany.service;

// Importando a classe Produtos que será referenciada como parâmetro na sobrescrita do método calcularSalarioPorProduto
import com.mycompany.products.Produtos;

public class Vendedor extends Funcionario {

    private int vendas = 0;
    private double salario = getSalarioBase();

    public Vendedor(String NomeFarmacia, String CNPJ, String Endereco, String Telefone, String Site, double SalarioBase,
            String Nome, String CPF, String tipoFuncionario, int certificado) {
        super(NomeFarmacia, CNPJ, Endereco, Telefone, Site, SalarioBase, Nome, CPF, tipoFuncionario, certificado);
        classificandoAcesso();
    }

    public void setVendas(int input) {
        this.vendas += input;
        calcularComissaoMeta(this.vendas);
    }

    public int getVendas() {
        return this.vendas;
    }

    public void setSalario(double input) {
        this.salario += input;
    }

    public double getSalario() {
        return this.salario;
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
        this.nivelAcesso = 0;
    }

    @Override
    public void lucroBruto(double valor) {
        calculandoLucroFarmacia(valor);
    }
}
