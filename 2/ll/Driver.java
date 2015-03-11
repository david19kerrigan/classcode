public class Driver {
		public static void main(String[] args) {
				Node n = new Node("Hello");
				//System.out.println(n.getData());

				Node n2 = new Node("World");
				//System.out.println(n2.getData());

				n.setNext(n2);
				System.out.println(n.getNext().getData());
				System.out.println(n.getNext());

				n2.setData("pickle");
				System.out.println(n.getNext());

				n.getNext().setData("Watermellon");
				System.out.println(n2);
				
		}
}
