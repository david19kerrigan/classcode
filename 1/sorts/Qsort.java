import java.util.*;
import java.io.*;
public class Qsort{
		private int[] a,b;
		public Qsort(){
				this(20);
		}
		public Qsort(int n){
				Random r = new Random();
				a = new int[n];
				for (int i = 0; i < a.length; i++) {
						a[i] = r.nextInt(100);
				}
		}

		public String toString(){
				return Arrays.toString(a);
		}

		public void qsort(int[] a, int l, int h){
				if (l>=h)
						return;
				int pi = h;
				int pval = a[h];
				int hi=h-1;
				int li=l;
				
				while (li<hi){
						if (a[li]<=pval)
								li++;
						else {
								int tmp=a[li];
								a[li]=a[hi];
								a[hi]=tmp;
								hi--;
						}
				}
				if (a[li] < pval){
						a[pi]=a[li+1];
						a[li+1]=pval;
						pi= li+1;
				}else {
						a[pi]=a[li];
						a[li]=pval;
						pi= li;
				}
				qsort(a,pi+1,h);
				qsort(a,l,pi-1);
		}
		
		public void sort(){
				qsort(a,0,a.length-1);
		}
		
		public static void main(String[] args) {
				Qsort q = new Qsort();
				System.out.println(q);
				q.sort();
				System.out.println(q);


		}
}
