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
public class Familia{
    private ArrayList<Membro> membros;
    private double renda;
    public Familia(){
       this.membros=new ArrayList<>(); 
    }
    
    public void adiciona(Membro membro){
        this.membros.add(membro);
    }
    
    
    public  void verificaRenda(){
        for(int i=0; i<membros.size();i++){
            if(this.membros.get(i).renda<998){
                this.membros.get(i).objeto_de_estudo=true;
            }
            else{
                this.membros.get(i).objeto_de_estudo=false;
            }
            
        }
    }
    public boolean familiaProblema(){
        int quant=0;
        double renda=0;
        for(int i=0;i<membros.size();i++){
            renda=renda+this.membros.get(i).renda;
            
        }
        if(renda<998){
            return true;
        }
        else{
            return false;
        }
        
    }
    public double RendaTotal(){
        double renda=0;
        for(int i=0; i<membros.size();i++){
            renda=renda+this.membros.get(i).renda;
        }
        return renda;
    }
    
}
