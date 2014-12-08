/* superclass for warrior (base class) and Mage */
public abstract  class Basechar {
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
