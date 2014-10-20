/* superclass for warrior (base class) and Mage */
/* Now Basechar is abstract so we can't instantiate it
   that is we can't say Basechar b = new Basechar()
   we have to extend it and then instantiate the subclass
*/
public abstract class Basechar {
    private int health=20;
    private String name;
    public Basechar() {
	setName("default");
    }
    public Basechar(String n) {
	setName(n);
    }
    
    public String toString(){
	return this.getName();
    }

    /* This is an abstract method. It consists of the method 
       declaration line with the word abstract in it followed
       by a ;.
       Any class that extends this class MUST implement
       all abstract methods (that is, they must actually write
       the method in their classes)
    */
    public abstract void attack(Basechar other);
    
    
    public void setName(String name){
	this.name = name;
    }
    
    public String getName(){
	return this.name;
    }

    public int getHealth() {
	return this.health;
    }

    
}
