import java.io.*;
import java.util.*;

public class Driver2 {
    public static void main(String[] args){

	Greeter g1 = new Greeter();
	Greeter g2,g3;

	g2 = new Greeter();

	g3 = g2;

	System.out.println("BEFORE");
	System.out.println("g1 is at "+g1);
	System.out.println("g2 is at "+g2);
	System.out.println("g3 is at "+g3);

	g2 = new Greeter();
	
	System.out.println("AFTER");
	System.out.println("g1 is at "+g1);
	System.out.println("g2 is at "+g2);
	System.out.println("g3 is at "+g3);

	g1 = new Greeter();
	System.out.println("AFTER AFTER");
	System.out.println("g1 is at "+g1);
	System.out.println("g2 is at "+g2);
	System.out.println("g3 is at "+g3);

    }
}
