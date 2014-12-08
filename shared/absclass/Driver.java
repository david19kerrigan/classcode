public class Driver {
    public static void main(String[] args){

	Warrior w = new Warrior("Groo");
	Mage m = new Mage("Mr. Sage");
	System.out.println(w+" "+m);
	m.attack(w);
	w.attack(m);

	//Basechar b = new Basechar();
	//b.attack(w);
	
    }
}
