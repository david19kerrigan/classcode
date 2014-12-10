import java.io.*;
import java.util.*;


/*

interface name {
  method1_signature;
	method2_signature;
	etc
}

method signature is:  public/private return_type name(params);

For example, the built in Java Comparable interface looks something
like this:

interface Comparable { 
  public int compareTo(Object other);
}

To agree to implement an interface use "implements"
ex:

class myClass implements Comparable{
 // class definitions here
}

A class can only extend one class but it can implement as many
interfaces as it wants (separated by ,)
 */





class Interval implements Comparable {

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

		public int compareTo(Object other){
				/* create a local variable and cast and assign the parameter */
				Interval o = (Interval)other;
				/*
					if (this.low == o.low){
						return this.high - o.high;
				} else {
						return this.low - o.low;
				}

				*/
				return (this.high - this.low) - (o.high - o.low);
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

				String[] sa = {"frog","toad","igauna","komodo dragon","bearded lizard"};
				System.out.println(Arrays.toString(sa));
				Arrays.sort(sa);
				System.out.println(Arrays.toString(sa));

				int[] ia = {20,1,55,100,33,201,24,17,78};
				System.out.println(Arrays.toString(ia));
				Arrays.sort(ia);
				System.out.println(Arrays.toString(ia));
				
				System.out.println(Arrays.toString(a));
				Arrays.sort(a);
				System.out.println(Arrays.toString(a));
				
				
		}
}
