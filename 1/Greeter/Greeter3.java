
import java.io.*;
import java.util.*;

public class Greeter3 {
    /* Attributes go here 
       We call them instance variables
    */

    public String greeting = new String("Hello world!");
    
    /* 
       public <- can be used outside of the class
       
       void <- this DOES NOT return anything
               You would place a "return type" 
	       here if the method did return something
       greet <- That's the name
       () <- parameters would go here
       { } <- the actual code goes between these

     */
    public void greet() {
	String s = new String("Hello world");
	System.out.println(s);
    }

    public void ungreet() {
	System.out.println("I'm out.");
    }
}
