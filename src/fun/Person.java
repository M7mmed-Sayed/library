/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;

import java.util.ArrayList;

/**
 *
 * @author mahmoued
 */
public abstract class Person {
     private String Name;
    private double Id;

    public Person() {
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getId() {
        return Id;
    }

    public void setId(double Id) {
        this.Id = Id;
    }

    
     

    // public abstract void showallpublications();
    
    
}
