public class Demo {

		public static void main(String[] args) {
				int i;
				for (i=0;i<20;i++){
						System.out.println(i);
				}
				System.out.println();
				System.out.printf("Hello");
				System.out.printf(" World!\n");
				System.out.printf("before %s after\n","middle");
				System.out.printf("before %s after %s stuff\n",
													"middle","more stuff");

				System.out.printf("An int: %d\n",123);
				System.out.printf("An int: %d A double: %f\n",
													123,123.0);
				System.out.printf("An int: %6d A double: %6.2f\n",
													123,123.0);
											
				for (i=0;i<20;i++){
						System.out.printf("%3d\n",i);
				}
				
		}
}
