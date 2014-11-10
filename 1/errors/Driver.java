public class Driver {
		public static void main(String[] args) {
				Eexample ee =new Eexample();
				try {
						ee.etest(55);
						System.out.println("Everything worked ok");
				} catch (ArrayIndexOutOfBoundsException e){
						System.out.println("Error - we got - "+e);
				} catch (ArithmeticException e){
						System.out.println("Arithmetic error");
				} catch (Exception e) {
						System.out.println("other error");
				}
				System.out.println("After the exception");
				
		}

}
