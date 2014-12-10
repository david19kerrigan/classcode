import java.io.*;
import java.util.*;

class Interval implements Comparable {

		private int low,high;
		private static Random r = new Random();				
		private static int numIntervals = 0;
		
		public Interval(int l, int h){
				low = l;
				high = h;
				numIntervals = numIntervals + 1;
		}
		
		public Interval() {
				int h = r.nextInt(100);
				int l = 1 + r.nextInt(h);
				low = l;
				high = h;
				numIntervals = numIntervals + 1;
		}


		public int compareTo(Object other){
				/* cast other to the appropriate type and store in a 
					 local variable for convenience
				*/
				Interval o = (Interval)other;
				/*
				if (this.low == o.low){
						return this.high - o.high;
				} else {
						return this.low - o.low;
				}	
				*/
				return (this.high - this.low) - (o.high-o.low);
		}
		public String toString() {
				//String s = "Inteval: "+numIntervals+": "+ "["+low+","+high+"]";
				String s = "["+low+","+high+"]";

				return s;
		}

		public static void printstuff() {
				System.out.println("Stuff");
		}
		public static void main(String[] args) {

				Interval ival = new Interval();
				ival.printstuff(); // normal calling off of an instance
				printstuff(); // since printStuff is static we can call it without an instance
				Interval.printstuff(); // we can also call it right off a class

				Interval[] a = new Interval[10];
				for (int i = 0; i < a.length; i++) {
						a[i] = new Interval();
				}
				System.out.println(Arrays.toString(a));

				String[] sa = {"hello","frog","absolute","zoo","bagel"};
				System.out.println(Arrays.toString(sa));
				Arrays.sort(sa);
				System.out.println(Arrays.toString(sa));

				int[] ia = {5,3,5,9,10,2,3,1,100,50};
				System.out.println(Arrays.toString(ia));
				Arrays.sort(ia);
				System.out.println(Arrays.toString(ia));


				System.out.println(Arrays.toString(a));
				Arrays.sort(a);
				System.out.println(Arrays.toString(a));

				
				
		}
}
