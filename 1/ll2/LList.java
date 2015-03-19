public class LList {
		private Node l;

		public LList(){
				l = new Node("");
		}


		public LLit getLLit(){
				LLit llit = new LLit(l);
				return llit;
		}

		public void add(String s){
				Node tmp = new Node(s);
				tmp.setNext(l.getNext());
				l.setNext(tmp);
		}

		public String toString(){
				String s = "";
				Node tmp;
				for (tmp = l; tmp != null; tmp=tmp.getNext()){
						s = s + tmp + " --> ";
				}
				s = s + "null";
				return s;
		}
		
}
