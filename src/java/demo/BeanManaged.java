/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Eric
 */
@ManagedBean
@SessionScoped
public class BeanManaged implements Serializable{
    private String phrase ="Bonjour....";
    
    /**
     * Creates a new instance of BeanManaged
     */
    public BeanManaged() {
    }
    
    public String getPhrase(){
        return phrase;
    }
    
}
