public class LList{
		private Node l;
		
		public LList(){
				l = new Node();
		}

		public LLit getLLit(){
				LLit i = new LLit(l.getNext());
				return i;
		}
		
		public Node getFirst(){
				return l.getNext();
		}
		
		public void add(int s){
				Node tmp = new Node(s);
				tmp.setNext(l);
				l = tmp;
		}
		
		public String toString(){
				String s = "";
				Node tmp;;
				for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
						s = s + tmp + " --> ";
				}
				s = s + "null";
				return s;
		}
}
