import java.io.*;
import java.util.*;

public class Mode {

		/*----------- Instance Variables --------*/
		int[] a;
		Random r;

		
		/*----------- Constructors --------*/
		public Mode() {
				this(20,100);
		}

		public Mode(int n) {
				this(n,100);
		}

		/*
			n - size of the array
			m - max value for each element
		*/
		public Mode(int n,int m){
				r = new Random();
				a = new int[n];
				for (int i=0;i<n;i++){
						a[i] = r.nextInt(m);
				}
		}


		public int mode(){
				int modeSoFar=a[0],
						modeCount=freq(a[0]);
				
				for (int i=0;i<a.length;i++){
						if (freq(a[i])>modeCount){
								modeSoFar = a[i];
								modeCount = freq(a[i]);
						}
				}
				/* just for testing purposes */
				System.out.println("Modecount: "+modeCount);
				return modeSoFar;
		}

		
		/*----------- methods --------*/

		public String toString() {
				String s = "";
				for (int i=0;i<a.length;i++)
						s = s  + a[i]+", ";
				return s;
		}

		public int freq(int n){
				int count = 0;
				for (int i=0;i<a.length;i++){
						if (a[i] == n){
								count = count + 1;
						}
				}
				return count;
		}

		public int maxVal(int[] a){
				int maxSoFar = a[0];
				for (int i = 0; i < a.length; i++) {
						if (a[i] > maxSoFar)
								maxSoFar = a[i];
				}
				return maxSoFar;
		}
		
		public int maxIndex(int[] a){
				int maxi = 0;
				for (int i = 0; i < a.length; i++) {
						if (a[i] > a[maxi])
								maxi = i;
				}
				return maxi;
		}
		
		public int fastmode(){
				int mv = maxVal(a);
				int[] tallies = new int[mv+1];

				// Java initialises the array to all 0s so we don't need:
				/*
				for (int i = 0; i < tallies.length; i++) {
						tallies[i]=0;
				}
				*/
				for (int i = 0; i < a.length; i++) {
						tallies[ a[i] ] += 1;
				}
				
				int mi = maxIndex(tallies);
				
				
				/* just for testing purposes */
				System.out.println("Modecount: "+tallies[mi]);

				return mi;
				
		}
		
		/*----------- main --------*/

		public static void main(String[] args) {
				int arraylength=20,
						maxvalue=20;

				if (args.length == 0){
						System.out.println("First argument must be f or s");
						System.exit(0);
				}
				String choice = args[0];
				if (args.length > 1) {
						arraylength = Integer.parseInt(args[1]);
				}
				if (args.length > 2) {
						maxvalue = Integer.parseInt(args[2]);
				}

				
				Mode m = new Mode(arraylength,maxvalue);
				if (choice.equals("s"))
						System.out.println("Mode value: "+m.mode());
				else
						System.out.println("Fastmode value: "+m.fastmode());
		}

}
