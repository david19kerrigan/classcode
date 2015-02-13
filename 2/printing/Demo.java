public class Demo {
		public static void main(String[] args) {
				int i;
				for (i=0;i<20;i++){
						System.out.println(i);
				}
				System.out.println();
				System.out.printf("hello");
				System.out.printf(" world\n");

				System.out.printf("Hello %s!!!!\n","Tom");
				System.out.printf("Hello %s %s!!!!\n",
													"Max","Power");
				System.out.printf("An int: %d a double %f\n"
													 ,123,123.0);
				System.out.printf("An int: %6d a double %8.2f\n"
													 ,123,123.0);
				for (i=0;i<20;i++){
						System.out.printf(":%3d :\n",i);
				}
		}
}
