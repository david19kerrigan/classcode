public class Mage extends Basechar{
    private int manna =12345;

    public Mage(){
	super("Magic Guy");
    }
    public Mage(String n) {
	super(n);
    }
    public int getManna(){
	return manna;
    }
    public void attack(Basechar other){
	System.out.println(this+" is Casting on "+other);

    }
    
}
