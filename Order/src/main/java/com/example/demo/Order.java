
//program to implement entity class

package com.example.demo;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
//import jakarta.persistence.GenerationValue;

@Entity
public class Order {
	
	
//	attributes declarations
	/**
	 *
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDateTime dateOfPurchase;
    private float total;
    private String paymentMode;
    
    public Order()
    {
    	
    }
    
//    constructor
    public Order(Integer id, LocalDateTime dateOfPurchase, float total, String paymentMode)
    {
    	this.id = id;
    	this.dateOfPurchase = dateOfPurchase;
    	this.total = total;
    	this.paymentMode = paymentMode;
    	
    }
    
    
    public Integer getId()
    {
    	return id;
   
    }
     public void setId(Integer id)
     {
    	 this.id = id;
     }
     
     public LocalDateTime getDateOfPurchase()
     {
    	 return dateOfPurchase;
     }
     
     public void setDateOfPurchase(LocalDateTime dateOfPurchase)
     {
    	 this.dateOfPurchase = dateOfPurchase;
     }
     
     public float getTotal()
     {
    	 return total;
     }
     public void setTotal(float total)
     {
    	 this.total = total;
     }
     
     @Override
     public String toString()
     {
    	 return "Order [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", total=" + total + ", paymentMode=" + paymentMode + "]"; 
     }
     

}
