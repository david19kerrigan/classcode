
public class Driver2 {
    public static void main(String[] args){
	System.out.println("Before new");
	Greeter g1 = new Greeter();
	System.out.println("after new");
	System.out.println(g1.greet());

	System.out.println("Before new");
	Greeter g2 = new Greeter("Hi there");
	System.out.println("after new");
	System.out.println(g2.greet());

	g1.setGreeting("Hello");
	System.out.println(g1.greet());
	System.out.println(g1.greetPerson("Tom"));
	System.out.println(g1.greetPerson("Sue"));
	
	
    }
}
