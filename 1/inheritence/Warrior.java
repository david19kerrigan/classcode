/* subclass of Basechar */
public class Warrior extends Basechar{
    private int healthboost=5;

    public Warrior(String n){
	// calls the super classes zero param constructor
	// even if you don't write this, the super constructor will always
	// be called as the first line of a subclass' constructor
	// super();
	super(n); // call the 1 param super constructor
	// setName(n);
    }


    public void attack(Basechar other){
	// System.out.println(this.getName()+" is super attacking "+other.getName());
	// toString is automatically called when you put a class instance in a string
	// context
	System.out.println(this+" is super attacking "+other);
	
    }
    
      public int getHealth() {
	  return healthboost + super.getHealth();
    }

}
