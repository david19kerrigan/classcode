import java.io.*;
import java.util.*;

class Interval {

		private int low, high;
		private static Random r = new Random();
		private static int numIntervals = 0;
		
		private void setup(int l, int h){
				high = h;
				low = l;
				numIntervals = numIntervals + 1;
		}
		
		public Interval(){
				int h = 1 + r.nextInt(100);
				int l = r.nextInt(h);
				setup(l,h);
		}

		public Interval(int l, int h){
						setup(l,h);
		}

		public String toString(){
				//String s = "Interval number "+ numIntervals + " -> [" +low+","+high+"]";
				String s = "["+low+","+high+"]";
				return s;
		}

		public static void printStuff() {
				System.out.println("Stuff");
		}
		
		public static void main(String[] args) {

				/* this works because printStuff is static -- it belongs
					 to the class and is created with the class (not with instances)
					 We can call it without Interval. because we're in the calss 
				*/
				printStuff();
				Interval.printStuff(); // calling off the class, like Math.sqrt

				Interval x = new Interval();
				x.printStuff(); // but we can also call it off of an instance.

				Interval[] a = new Interval[10];
				for (int i = 0; i < a.length; i++) {
						a[i] = new Interval();
				}

				System.out.println(Arrays.toString(a));
		}
}
