import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){

	/*
	  declares a local variable g to be of type Greeter
	*/
	Greeter g;

	/*
	  new does the following
	  1. Allocates enough memory to store a Greeter
	  2. Do whatever's needed to setup / initialize
	     the memory to be a Greeter.
	  3. return the address of the memory that was
	     allocated.

	  The assignment statement stores the address
	  in g 
	*/
	
	g = new Greeter();

	// This prints out the memory location of Greeter g
	// System.out.println(g);
	g.greet();
	g.greet();
	// g.ungreet(); can't do this since ungreet is private
    }
}
