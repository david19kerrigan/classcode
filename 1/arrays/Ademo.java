public class Ademo{
    public static void main(String[] args) {

	// declare an array to hold ints
	int[] intArray;
	// can't do this since we haven't used new yet -> intArray[2] = 5;
	// declare an arary to hold Strings
	String[] stringArray;

	// allocate a block big enough to hold 5 ints and refer
	// intArray to it
	intArray = new int[5];

	// allocate a block big enough to hold 5 Strings and refer
	// stringArray to it
	stringArray = new String[5];


	// in one line
	//int[] intArray2 = new int[10];

	intArray[2] = 5; // but here, after the new, it's fine

	// No good -- 7 is out of bounds - we only have 0 to 4
	// intArray[7] = 20;

	System.out.println(intArray.length);
	for (int i=0;i<intArray.length;i++){
	    System.out.print(intArray[i]+" ");
	}
	System.out.println();


	stringArray[1]="hello";
	System.out.println(intArray.length);
	for (int i=0;i<stringArray.length;i++){
	    System.out.print(stringArray[i]+" ");
	}
	System.out.println();

    }
    
}
