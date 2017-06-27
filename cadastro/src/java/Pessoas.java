/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RA21605876
 */


import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Pessoas {
    @Id
    private String CPF;
    
    private String nome;
   
    private String DT;
    
    private String UF;
    
    
    public String getCPF () {
    return CPF;
    }
    
    public void setCPF (String CPF){
    
    this.CPF = CPF;
    }
    
   private String getnome (){
   return nome;
   
   }
   public void setnome(String nome){
   this.nome = nome;
   
   }
   
   
   public String getDT (){
   return DT;
  
   }
   
   public void setDT(String DT){
   
   this.DT = DT;
   
   }
     public String UF(){
     return UF;
     
     }
     
     public void setUF (String UF ){
     
     this.UF = UF;
     }
   
    
    
}
