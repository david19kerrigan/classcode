import java.util.*;

public class MergeSort {

    public ArrayList<Integer> one, two;
    public ArrayList<Integer> merge;
		/*
			public MergeSort( ArrayList<Integer> a, ArrayList<Integer> b ) {
			one = a;
			two = b;
			}
		*/
    public ArrayList<Integer> MSort(ArrayList<Integer> a){
				if (a.size()<=1){
						return a;}
				else {
						ArrayList<Integer> b =new ArrayList<Integer>();
						for (int i=0;i<a.size()/2;i++){
								b.add(a.get(i));}
						ArrayList<Integer> c = new ArrayList<Integer>();
						for (int i=a.size()/2;i<a.size();i++){
								c.add(a.get(i));}
						ArrayList<Integer> r1 = MSort(b);
						ArrayList<Integer> r2 = MSort(c);
						return Merge(r1, r2);}
    } 

    public ArrayList<Integer> Merge ( ArrayList<Integer> a, ArrayList<Integer> b ) {
				ArrayList<Integer> merged= new ArrayList<Integer>();
				int iA =0;
				int iB = 0;

				while ( iA < a.size() && iB < b.size()) {
						if ( a.get(iA) < b.get(iB) ) {
								merged.add(a.get(iA));
								iA++;
						} else { 
								merged.add(b.get(iB));
								iB++;
						}
				}
				
				while (iB < b.size()){
						merged.add(b.get(iB));
						iB++;
				}
						
				while (iA < a.size()){
						merged.add(a.get(iA));
						iA++;
				}
						
				return merged;
	
    }

    public static void main( String[] args ) {
				MergeSort M = new MergeSort();
				ArrayList<Integer> b = new ArrayList<Integer>();
				//ArrayList<Integer> c = new ArrayList<Integer>();
				Random R = new Random();
				for (int i=0; i<2000000; i++){
						b.add(R.nextInt(100));
						//c.add(R.nextInt(10));
				}
				System.out.println("Starting");
				b = M.MSort(b);
				System.out.println("Ending");
				//ArrayList<Integer> a = M.Merge(b, c);
				//System.out.println(a);
    }

}
