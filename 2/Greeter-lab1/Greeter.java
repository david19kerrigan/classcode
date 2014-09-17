
public class Greeter {

    private String greeting = new String("Hello world!");

    public void setGreeting(String s){
	greeting  = s;
    }
    public void greet() {
	// uncomment the following line for question 2
	// String greeting = new String("Sup!");
	System.out.println(greeting);
    }

    public void ungreet() {
	System.out.println(greeting);
    }
}
