/* subclass of Basechar */
public class Warrior extends Basechar{
    private int healthboost=5;
    
      public int getHealth() {
	  return healthboost + super.getHealth();
    }

}
