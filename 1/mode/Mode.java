import java.io.*;
import java.util.*;

public class Mode {

		/*------------ Instance Variables -------------*/
		int[] a;
		Random r;

		/*------------ Constructors -------------*/
		public Mode() {
				this(20,100);
		}

		public Mode(int n) {
				this(n,100);
		}


		/* 
			 n - size of the array
			 m - max value for each entry
		 */
		public Mode(int n,int m){
				r = new Random();
				a = new int[n];
				for (int i=0;i<n;i++){
						a[i] = r.nextInt(m);
				}
		}

		/*------------  methods -------------*/
		
		public String toString() {
				String s = "";
				for (int i=0;i<a.length;i++)
						s = s  + a[i]+", ";
				return s;
		}




		public int freq(int n) {
				int count = 0;
				for (int i=0;i<a.length;i++){
						if (a[i]==n)
								count = count + 1;
				}
				return count;
		}

		public int mode(){
				int count = 0;
				int modeIndex = 0;
				for (int i=0;i<a.length;i++){
						if (freq(a[i]) > count){
								count = freq(a[i]);
								modeIndex = i;
						}
				}
				System.out.println("modeval = "+a[modeIndex]);
				return count;
		}

		public int maxVal() {
				int maxSoFar = a[0];
				for (int i=0;i<a.length;i++) {
						if (a[i] > maxSoFar)
								maxSoFar = a[i];
				}
				return maxSoFar;
		}

		public int maxIndex(int[] a) {
				int maxI = 0;
				for (int i=0;i<a.length;i++) {
						if (a[i] > a[maxI])
								maxI = i;
				}
				return maxI;
		}

		public int fastmode() {

				/* set up array of buckets for the tallies */
				int max = maxVal();
				int[] tallies = new int[max+1];
				/* 
					 Java initializes this to 0 so we don't need this loop
				for (int i = 0; i < tallies.length; i++) {
						tallies[i]=0;					
				}
				*/

				for (int i=0;i<a.length;i++){
						tallies[ a[i] ] += 1;
				}

				int m = maxIndex(tallies);
				System.out.println("fastmodeval = "+m);
				return tallies[m];
				
		}
		
		/*------------  main -------------*/
		
		public static void main(String[] args) {
				int n=20,
						maxval=20;

				if (args.length == 0) {
						System.out.println("You must specify f or s as first argument");
						System.exit(0);
				}
				String choice = args[0];
				if (args.length > 1){
						n = Integer.parseInt(args[1]);
				}
				if (args.length > 2){
						maxval = Integer.parseInt(args[2]);
				}

				Mode m = new Mode(n,maxval);
				if (choice.equals("s")){
						System.out.println("slow modecount = "+m.mode());
				} else {
						System.out.println("fast modecount = "+m.fastmode());
				}
				
		}

}
