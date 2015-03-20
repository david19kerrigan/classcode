public class LList<E>{
		private Node<E> l;
		
		public LList(){
				l = new Node();
		}

		public LLit getLLit(){
				LLit i = new LLit(l.getNext());
				return i;
		}
		

		
		public void add(E s){
				Node tmp = new Node(s);
				tmp.setNext(l.getNext());
				l.setNext(tmp);
		}
		
		public String toString(){
				String s = "";
				Node tmp;;
				for (tmp=l.getNext() ; tmp!=null ; tmp=tmp.getNext()){
						s = s + tmp + " --> ";
				}
				s = s + "null";
				return s;
		}
}
