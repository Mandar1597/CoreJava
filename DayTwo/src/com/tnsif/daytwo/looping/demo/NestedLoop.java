package com.tnsif.daytwo.looping.demo;



public class NestedLoop {

	public static void main(String[] args) {
	     int age= 21;
	     String Citizen="Indian";
	     
	     
	    
	     if (age>=18) {
	    	 System.out.println("Candidate is Eligible to Create Voterid");
	    	 if (Citizen=="Indian") {
	    		 System.out.println("Candidate is Indian i.e They are Eligible for Voterid");
	    	 } else {
	    		 System.out.println("You are Not Eligible as you are not a citizen");
	    	 }
	     }

	}

}