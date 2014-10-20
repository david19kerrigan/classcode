public class Driver {
    public static void main(String[] args){

	Warrior w = new Warrior("Groo");
	Mage m = new Mage("Mr. Sage");
	System.out.println(w+" "+m);
	m.attack(w);
	w.attack(m);

	/*
	  Can't do this since Basechar is abstract
	*/
	//Basechar b = new Basechar("Snidely Whiplash");
	//b.attack(m);
	
    }
}
