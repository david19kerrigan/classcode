/* This is a subclass of Basechar */
public class Warrior extends Basechar {
    // private int health= 50000;
    private int healthboost = 5;

    public Warrior() {
	setName("DEFAULT");
    }
    public Warrior(String n) {
	super(n);
    }
    

    public int getHealth() {
	return healthboost + super.getHealth();
    }
    public void attack(Basechar other){
	System.out.println(this+" is SUPERattacking "+other);

    }
    
}
