public class Driver{
    public static void main(String[] args) {
	Complex c1 = new Complex(3,4);
	System.out.println(c1);
	System.out.println(c1.norm());
	String s = ""+12345 ; // points s to the String "12345"
	int i = Integer.parseInt("12345");//  converts String to int
	double d = Double.parseDouble("123.45");// converts String to double

	System.out.println("You are attacked by the demon");

	try {
	    Thread.sleep(2000);
	} catch (Exception e){}

	System.out.println("It hits");

	try {
	    Thread.sleep(4000);
	} catch (Exception e){}
	
	System.out.println("And does a huge amount of damage");
	
					       
	    
    }

}
