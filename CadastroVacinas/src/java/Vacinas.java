
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
//OK
@Entity
public class Vacinas {
    @Id
    private String CodigoVacina;
    
    private String Vacina;
    
    private String Dose;
    
    private String Idade;
    
    private String PesoMinimo;
    
    
    public String getCodigoVacina (){
    return CodigoVacina;
    }
    
    public void setCodigoVacina (String CodigoVacina){
    
    this.CodigoVacina =CodigoVacina;
    }
    
    public String  getVacina (){
    return Vacina;
    }
    
    public void setVacina(String Vacina){
    
    this.Vacina=Vacina;
    }
    
    public String getDose(){
    return Dose;
    }
    
    public void setDose(String Dose){
    
    this.Dose = Dose;
    }
    
    public String getIdade (){
    return Idade;
    }
    
    public void setIdade (String Idade){
    
    this.Idade= Idade; 
    }
    
    
    public String getPesoMinimo(){
   return PesoMinimo;
    }
    
    public void setPesoMinimo (String PesoMinimo){
    
    this.PesoMinimo = PesoMinimo;
    }
    
    
}
