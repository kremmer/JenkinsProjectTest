/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;
/**
 *
 * @author Eric
 */
@ManagedBean
@SessionScoped
public class AleaBean implements Serializable{
private String phrase ="Je pense à un nombre entre 1 et 100. Pouvez-vous le trouver ?";
private int devinette;
private int user;
private int nbcoup;
    
    /**
     * Creates a new instance of BeanManaged
     */
   
    
    public String getPhrase(){
        return phrase;
    }
    /**
     * Creates a new instance of AleaBean
     */
    public AleaBean() {
        this.devinette = (int) (Math.random() * 100 + 1);
        this.nbcoup = 0;
    }

    /**
     * @return the user
     */
    public int getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(int user) {
        this.user = user;
    }
    
    public void comparer(){
        
        if((this.user - this.devinette)> 0 ){
            this.phrase ="Votre numero est trop grand";
            this.nbcoup += 1;
           
        }
        else{
            if((this.user - this.devinette)== 0 ){
                this.phrase =" VICTOIRE en "+ this.nbcoup+" coup(s)";
            }else{
                this.phrase ="Votre nombre est trop petit";
                this.nbcoup += 1;
            }
            
        }
        
        
        
    }
}
