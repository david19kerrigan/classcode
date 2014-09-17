public class Driver {
    public static void main(String[] args){
	Greeter g1 = new Greeter();
	Greeter g2 = new Greeter();
	g1.greet();
	g2.greet();

	// We can't do this because greeting is private
	// g1.greeting = new String("Sup!");
	// Instead we write and use a set method
	g1.setGreeting(new String("Sup!"));

	g1.greet();
	g2.greet();

	/*
	  4. Run again - are g1 and g2 greeting you differntly now? 
	     Why or why not?
	  5. What if we make the instance variable greeting private.
	     Does it change what you  did for questions 3 and 4?
	*/
    }
}
