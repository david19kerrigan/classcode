public class Driver {

    public static void main(String[] args){
	Basechar c = new Basechar(),c2;
	Warrior w = new Warrior(),w2;
	Mage m = new Mage(),m2;

	w.setName("Groo");
	m.setName("Mr. Sage");

	w.attack(m);
	m.attack(w);
	w.attack(w);

	System.out.println(w.toString());
	System.out.println(w);
    }


}
