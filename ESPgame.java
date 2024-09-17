/*
 * Class: CMSC203 
 * Instructor:Dr.Tanveer
 * Description: Make a esp game to guess the colors
 * Due: MM/DD/YYYY
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: ___Vivan Perera_______*/

import java.util.Scanner;

import java.util.Random;

public class ESPgame {
  public static void main(String[] args)
  {
	  Random randomColor = new Random();
	  
	  
	  Scanner color = new Scanner (System.in);
	  
	 String green = "green";
     
     String blue = "blue";
     
     String red = "red";
     
     String orange = "orange";
  String purple = "purple";
     
	   int counter = 0;
	do {  
    	   int randomNum = randomColor.nextInt(5)+1;


      System.out.println("Please enter a color red, blue orange, purple, green");
     
     String guess = color.nextLine();
     

     
    	 
    	 switch(randomNum) {
    	 case 1: 
if(blue.equals(guess)) {
    			 
    			 System.out.println("good job you guessed it");
    		 
    		 }
    		 else{System.out.println("Sorry I was thinking of blue");}
    		 
    		 

    		 break; 
    		 
    	 case 2:
    		 
if(red.equals(guess)) {
    			 
    			 System.out.println("good job you guessed it");
    		 
    		 }
    		 else{System.out.println("Sorry I was thinking of blue");}
    		 
    		 break;
    		
    	 case 3:
if(orange.equals(guess)) {
    			 
    			 System.out.println("good job you guessed it");
    		 
    		 }
    		 else{System.out.println("Sorry I was thinking of orange");}
    		 break;
    	 case 4:
    		 
if(purple.equals(guess)) {
    			 
    			 System.out.println("good job you guessed it");
    		 
    		 }
    		 else{System.out.println("Sorry I was thinking of purple");}
    		 break;
    		 
    	 case 5:
    		 
if(green.equals(guess)) {
    			 
    			 System.out.println("good job you guessed it");
    		 
    		 }
    		 else{System.out.println("Sorry I was thinking of green");}
    		 break;
    	 }
    	 
    	 
     {}
     
     counter ++;
     
	}
     while(counter < 8);
	{}
	
	 System.exit(0);
  }
  
  
}
  

  
  
  
  
  
  
  


