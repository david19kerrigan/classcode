public class Driver{
		public static void main(String[] args) {
				LList l = new LList();
				for (int i=0;i<5;i++){
						l.add(i);
				}

				LLit i = l.getLLit();
				while (i.hasNext()){
						int number = i.next();
						System.out.println(number);
				}

		}
}
