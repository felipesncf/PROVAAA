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
public class Prova1FelipeNeiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pai pai1=new Pai("Fernando", 123456, 48, false, true);
        Mae mae1=new Mae("Simone", 654321, 47,false, true);
        Filho filho1=new Filho("Felipe", 78900, 18, true, false);
        Agregado agregado1=new Agregado("Gabriela", 98700, 20, false, true);
        Familia familia1= new Familia();
        
        familia1.adiciona(pai1);
        familia1.adiciona(mae1);
        familia1.adiciona(filho1);
        familia1.adiciona(agregado1);
        
        
        pai1.VerificaEstuda();
        mae1.VerificaEstuda();
        filho1.VerificaEstuda();
        agregado1.VerificaEstuda();
        
        pai1.SalarioDoEmprego(10000);
        mae1.SalarioDoEmprego(5000);
        filho1.SalarioDoEmprego(0);
        agregado1.SalarioDoEmprego(4000);
        
        pai1.verificaObjetoEstudo();
        filho1.verificaObjetoEstudo();
        mae1.verificaObjetoEstudo();
        agregado1.verificaObjetoEstudo();
        
        familia1.verificaRenda();
        if(familia1.familiaProblema()){
            System.out.println("Essa familia esta passando por problemas");
        }
        System.out.println("Renda total: "+familia1.RendaTotal());
        
        System.out.println("");
        
        
        Pai pai2=new Pai("Felipe", 123456, 48, false, false);
        Mae mae2=new Mae("Gabriela", 654321, 47,false, false);
        Filho filho2=new Filho("Ana", 78900, 18, true, false);
        Agregado agregado2=new Agregado("Davi", 98700, 20, true, false);
        Familia familia2= new Familia();
        
        familia2.adiciona(pai2);
        familia2.adiciona(mae2);
        familia2.adiciona(filho2);
        familia2.adiciona(agregado2);
        
        pai2.VerificaEstuda();
        mae2.VerificaEstuda();
        filho2.VerificaEstuda();
        agregado2.VerificaEstuda();
        
        pai2.SalarioDoEmprego(0);
        mae2.SalarioDoEmprego(0);
        filho2.SalarioDoEmprego(0);
        agregado2.SalarioDoEmprego(0);
        
        pai2.verificaObjetoEstudo();
        filho2.verificaObjetoEstudo();
        mae2.verificaObjetoEstudo();
        agregado2.verificaObjetoEstudo();
        
        familia2.verificaRenda();
        System.out.println("Renda total: "+familia2.RendaTotal());
        if(familia2.familiaProblema()){
            System.out.println("Essa familia esta passando por problemas");
        }
        
        
    }
    
}
