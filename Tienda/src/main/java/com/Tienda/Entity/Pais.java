/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
/**
 *
 * @author yulien
 */

@Entity
@Table (name="paises")
public class Pais implements Serializable{
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;
    private String pais;
    
    public long getId(){
        return id;
    }
    public String getPais(){
        return pais;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setPais(String p){
        this.pais=p;
    }
}
