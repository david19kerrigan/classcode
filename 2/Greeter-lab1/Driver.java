public class Driver {
    public static void main(String[] args){
	Greeter g1 = new Greeter();
	Greeter g2 = new Greeter();
	g1.greet();
	g2.greet();
	// In java, we almost never make instance variables public so you can't do the following
	// g1.greeting = new String("Sup!");

	// instead we write public "accessor methods" --> get and set
	g1.setGreeting("Sup!");
	
	g1.greet();
	g2.greet();

	g2.setGreeting("Hi Yawl!");
	
	g1.greet();
	g2.greet();

    }
}
