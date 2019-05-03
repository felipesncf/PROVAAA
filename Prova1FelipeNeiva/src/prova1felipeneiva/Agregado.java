/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1felipeneiva;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Agregado extends Membro{
    private ArrayList<Membro> familia;

    public Agregado(String nome, int CPF, int idade, boolean estuda, boolean possui_emprego) {
        super(nome, CPF, idade, estuda, possui_emprego);
    }

   
    
    
    public void VerificaEstuda(){
        if(this.estuda==true){
           this.renda+=175;
        }
    }
    
    public void SalarioDoEmprego(double salario){
        double  valor = salario*0.4;
        if(this.possui_emprego==true){
            this.renda=valor+this.renda;
        }
    }

     @Override
    public void verificaObjetoEstudo() {
        if(this.idade<18){
            this.objeto_de_estudo=true;
        }
        else{
            this.objeto_de_estudo=false;
        }
    }
}
