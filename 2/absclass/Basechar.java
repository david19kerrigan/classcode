/* superclass for warrior (base class) and Mage */
/* By making Basechar an abstract class we can't instantiate
   it - that is, we can't say: Basechar b = new Basechar();

   We can have subclasses inherit from it and they can be 
   instantiated
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
    
    /* to create an abstract method
       - it's the declaration line 
       - followed by a ;
       - it doesn't have a method body -he {....} part
       - the subclass actually must write the full method
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
