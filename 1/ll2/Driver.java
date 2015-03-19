import java.util.*;
public class  Driver{
		public static void main(String[] args) {
				Random r = new Random();
				LList l = new LList();
				for (int i=0; i < 10; i++){
						l.add(""+i);
				}
				LLit i = l.getLLit();
				while (i.hasNext()) {
								String s=  i.next();
								System.out.println(s);
						}
		}
}
