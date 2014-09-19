
public class Greeter {

    // Instance variables
    
    private String greeting;

    // Constructors
    /* a constructor is always called when you "new" an instance of a class.
       If you don't write any constructors, Java provides a default constructor
       that takes no arguments.

       Once we write a constructor that takes one or more arguments,
       we lose the default constructor.

       We solve this by overloading.

       Overloading is when you make 2 or more methods (or constructors) of the same name.
       They have to differ in terms of the parameter types. Java figures out which 
       one to use based on the parameters.
       
       We will make 2 constructors, one with zero parameters and one with a single
       String parameter.
    */
    
    /* Notes - always public
             - the name is the name of the class
	     - there is no return type (not even void)

	     This will be called when you run the new statement
    */
    public Greeter(String s) {
	System.out.println("In the constructor w/String");
	greeting = s;
    }

    public Greeter() {
	System.out.println("In the constructor w/zero params");
	greeting = "Hello world!"; // this can be done instead of new String("Hello world!")
	
    }

    
    // Regular methods
    
    /* The word after public defines the return type of the method.
       In this case, we are returning a String value. If we don't want to 
       return any value, we use the special type "void"
    */
    public String getGreeting() {
	return greeting;
    }


    public String greetPerson(String s){
	return greeting + " " + s;
    }
    
    public void setGreeting(String s){
	greeting  = s;
    }
    public String greet() {
	// uncomment the following line for question 2
	// String greeting = new String("Sup!");
	return greeting;
    }

    public void ungreet() {
	System.out.println(greeting);
    }
}
