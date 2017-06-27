
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RA21605876
 */
@Entity
public class Pessoas {
    

   @Id
   private String CPF;
   
   private String Paciente;
   
   private String DT;
   
   private String Peso;
   
   private String Altura;
   
    public String getCPF (){
    return CPF;
    }
    
    public void setCPF (String CPF){
    
    this.CPF= CPF;
    }   
    
    
    public String getPaciente(){
    return Paciente;
    
    }
    
    public void setPaciente(String Paciente){
    this.Paciente= Paciente;
    }
    
    public String getDT(){
    return DT;
    
    }
    
    public void setDT (String DT){
    this.DT= DT;
    }
    
    public String getPeso(){
    return Peso;
    
    }
    
    public void setPeso (String Peso){
    this.Peso= Peso;
    
    }
    
    public String getAltura (){
    return Altura;
    
    }
    public void setAltura(String Altura){
    this.Altura= Altura;
    
    }
    
}
