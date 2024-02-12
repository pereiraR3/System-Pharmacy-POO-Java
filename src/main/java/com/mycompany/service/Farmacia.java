package com.mycompany.service;

import com.mycompany.controler.painelControle;

public abstract class Farmacia implements painelControle {

    protected String Name;
    protected String CNPJ;
    protected String Endereco;
    protected String Telefone;
    protected String Site;
    protected double SalarioBase;
    protected double lucroBruto = 0;

    public Farmacia(String Name, String CNPJ, String Endereco, String Telefone, String Site, double SalarioBase) {
        this.Name = Name;
        this.CNPJ = CNPJ;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Site = Site;
        this.SalarioBase = SalarioBase;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setCNPJ(String input) {
        this.CNPJ = input;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    public void setSalarioBase(double input) {
        this.SalarioBase = input;
    }

    public double getSalarioBase() {
        return this.SalarioBase;
    }

    public void setLucroBruto(double input) {
        this.lucroBruto += input;
    }

    public double getLucroBruto() {
        return this.lucroBruto;
    }

}
