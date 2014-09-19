public class Driver2{

    public static void main(String[] args){
	Greeter g1 = new Greeter("Hello");
	System.out.println(g1.greet());
	System.out.println("Before the contsructor is called");
	Greeter g2 = new Greeter("Howdy!");
	System.out.println("After the contsructor is called");
	System.out.println(g2.greet());

	System.out.println(g1.greetPerson("Tom"));
	System.out.println(g1.greetPerson("Sarah"));
	System.out.println(g1.loudGreeting());
    }
}
