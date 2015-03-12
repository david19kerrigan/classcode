public class Driver {
		public static void main(String[] args) {
				Node n = new Node("Hello");
				//System.out.println(n.getData());

				Node n2 = new Node("World");
				//System.out.println(n2.getData());

				n.setNext(n2);
				//System.out.println(n.getNext().getData());
				//System.out.println(n.getNext());

				n2.setData("pickle");
				//System.out.println(n.getNext());

				n.getNext().setData("Watermellon");
				//System.out.println(n2);

				n.getNext().setNext(new Node("abc"));
				//System.out.println(n2.getNext());

				n.getNext().getNext().setNext(new Node("aaa"));
				//System.out.println(n2.getNext().getNext());

				Node tmp = new Node("first");
				tmp.setNext(n);
				n = tmp;

				//System.out.println(n);
				//System.out.println(n.getNext());

				tmp = new Node("new first");
				tmp.setNext(n);
				n = tmp;
				//System.out.println(n);
				//System.out.println(n.getNext());

				tmp = n;
				while (tmp != null){
						System.out.print(tmp+", ");
						tmp = tmp.getNext();
				}
				System.out.println();

				for (tmp=n;tmp!=null;tmp=tmp.getNext()){
						System.out.print(tmp+", ");
				}
				System.out.println();
		}
}
