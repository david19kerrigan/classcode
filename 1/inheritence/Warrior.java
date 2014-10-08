/* subclass of Basechar */
public class Warrior extends Basechar{
    private int healthboost=5;
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
