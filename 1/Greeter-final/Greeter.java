
public class Greeter {

    // instance variables are almost always private.
    // We access them with "accessor methods" get and set
    private String greeting;

    // constructors

    /*
      Notes - the name is the same as the class name
            - there is no return type (nothing between public and the name)
            - it's ALWAYS public

	    a constructor is run automatically when you instantiate the class.
	    that is, if you have: Greeter g = new Greeter("Hello")
	    then Java will automatically call this contstructor sending Hello
	    in as parameter g. It will  then set the instance variable 
	    greeting to what g refers to, which is hello
    */
    public Greeter(String g) {
	System.out.println("In the constructor");
	greeting = g;
    }

    /* We can overload methods (including constructors) which means we
       have more than one method with the same name. They just have to
       have different "signatures" which means different parameter
       types. Java figures out which one to run by matching parameter types
    */
    public Greeter() {
	greeting = "Hello world!"
    }
    

    // regular methods

    public void setGreeting(String s) {
	greeting = s;
    }

    // String is the "return type" that is, the type of the data that we
    // will send back using the return statement.
    // void is a special "return type" which means we won't be returning any
    // value
    public String getGreeting() {
	return greeting;
    }
	

    /* our original greet just printed the greeting.
       Generally, we want our methods to return information and only print if 
       they are SPECIFICALLY designed to print.
     */
    public String greet() {
	return greeting;
    }

    public void ungreet() {
	System.out.println(greeting);
    }
}
