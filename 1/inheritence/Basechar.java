/* superclass of Warrior and Mage */
public class Basechar {
    private int health=20;
    private String name="default name";
    /*
    public Basechar() {
	setName("Default");
    }
    */
    public Basechar(String n){
	setName(n);
    }

    public String toString(){
	return this.getName();
    }
    public void attack(Basechar other){
	//System.out.println(this.getName()+" is attacking "+other.getName());
	// toString is automatically called when you put a class instance in a string
	// context
	System.out.println(this+" is attacking "+other);
    }
    public void setName(String name) {
	this.name = name;
    }
    public String getName(){
	return name;
    }
    public int getHealth() {
	return health;
    }

    public void setHealth(int i){
	health = i;
    }
}
