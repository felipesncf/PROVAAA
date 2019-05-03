/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1felipeneiva;

/**
 *
 * @author aluno
 */
public abstract class Membro {
    protected String nome;
    protected int CPF;
    protected int idade;
    protected double renda;
    protected boolean estuda;
    protected boolean campo_de_pesquisa;
    protected double salario;
    protected String nome_empresa;
    protected boolean possui_emprego;
    protected boolean objeto_de_estudo;

    
    public Membro(String nome, int CPF, int idade, boolean estuda, boolean possui_emprego){
        this.nome=nome;
        this.CPF=CPF;
        this.idade=idade;
        this.renda=0;
        this.estuda=estuda;
        this.possui_emprego=possui_emprego;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public int getCPF() {
        return CPF;
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }

    
    public boolean isEstuda() {
        return estuda;
    }
    public void setEstuda(boolean estuda) {
        this.estuda = estuda;
    }

    
    public boolean isCampo_de_pesquisa() {
        return campo_de_pesquisa;
    }
    public void setCampo_de_pesquisa(boolean campo_de_pesquisa) {
        this.campo_de_pesquisa = campo_de_pesquisa;
    }

    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public String getNome_empresa() {
        return nome_empresa;
    }
    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    
    public boolean isPossui_emprego() {
        return possui_emprego;
    }
    public void setPossui_emprego(boolean possui_emprego) {
        this.possui_emprego = possui_emprego;
    }

    
    public boolean isObjeto_de_estudo() {
        return objeto_de_estudo;
    }
    public void setObjeto_de_estudo(boolean objeto_de_estudo) {
        this.objeto_de_estudo = objeto_de_estudo;
    }
    
    
    
    
    
    public abstract void VerificaEstuda();
    public abstract void SalarioDoEmprego(double salario);
    public abstract void verificaObjetoEstudo();
    
    
}
