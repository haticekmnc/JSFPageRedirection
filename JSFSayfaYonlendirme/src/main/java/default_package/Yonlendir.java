/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package default_package;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author hatice.kemence
 */
@ManagedBean
@RequestScoped
public class Yonlendir {
    int sayi;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
    
    public String yonlendir(){
        if(sayi>50){
            return "buyuk?faces-redirect=true";
        }
        else{
            return "kucuk?faces-redirect=true";
        }
    }
    
}
