import java.io.*;
import java.util.*;

/**
	 The Randomize Class
	 <p>
	 It can have html <b>markup like bold</b> or even anchors like
	 <a href="apcs-z.stuycs.org">this</a>
	 <hr>
	 etc.
 */
public class Randomize {
		Random rnd = new Random();

		/**
			creates and returns a new ArrayList with the elements 
			shuffled
			<br>
			<ol>
			<li>select a random index in l
			<li>remove it from l
			<li>add it to the new list
			<li>repeat until done
			</ol>
			@param l An ArrayList
			@return a new ArrayList
		*/
		public ArrayList<Integer> shuffle1(ArrayList<Integer> l){
				ArrayList<Integer> result = new ArrayList<Integer>();
				while (l.size()>0){
						int i = rnd.nextInt(l.size());
						int v = l.remove(i);
						result.add(v);
				}
				return result;
		}

		/*
			Same as shuffle1 but works "in place"
			s = l.size();
			1. Generate a random index between 0 and s
			2. remove that item 
			3. add the item to the end
			4. subtract 1 from s
			5. go back to step 1 until done

		*/
		public ArrayList<Integer> shuffle2(ArrayList<Integer> l){
				ArrayList<Integer> result = new ArrayList<Integer>();
				for (int s=l.size();s>0;s--) {
						int i = rnd.nextInt(s);
						int v = l.remove(i);
						l.add(v);
				}
				return l;
		}


		/*
			Same as shuffle1 but works "in place"
			s = l.size();
			1. Generate a random index between 0 and s
			2. swap item at i with item at s-1
			4. subtract 1 from s
			5. go back to step 1 until done

		*/
		public ArrayList<Integer> shuffle3(ArrayList<Integer> l){
				ArrayList<Integer> result = new ArrayList<Integer>();
				for (int s=l.size();s>0;s--) {
						int i = rnd.nextInt(s);

						int tmp = l.get(i);
						l.set(i, l.get(s-1));
						l.set(s-1,tmp);
				}
				return l;
		}

		
		public static void main(String[] args) {
				ArrayList<Integer> l = new ArrayList<Integer>();
				Randomize r = new Randomize();

				if (args.length < 2) {
						System.out.println("Use: java Randomize method size");
						System.exit(0);
				}

				int method = Integer.parseInt(args[0]);
				int s = Integer.parseInt(args[1]);
				
				for (int i=0;i<s;i++){
						l.add(i);
				}
				
				// System.out.println(l);
				if (method==1) {
						l = r.shuffle1(l);
				}
				else if (method==2) {
						l = r.shuffle2(l);
				} 
				else if (method==3) {
						l = r.shuffle3(l);
				} 
				
				// System.out.println(l);
		}

}
