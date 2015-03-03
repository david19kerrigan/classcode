import java.io.*;
import java.util.*;

public class MsortDemo{
    public ArrayList<Integer> mSort(ArrayList<Integer> list){
				if (list.size() <= 1){
						return list;
				}
				double divider = list.size()/2.0;
				ArrayList<Integer> front = new ArrayList<Integer>();
				ArrayList<Integer> back = new ArrayList<Integer>();
				int i;
				for (i=0;i<divider;i++){
						front.add(list.get(i));
				}
				for (;i<list.size();i++){
						back.add(list.get(i));
				}
				return merge(mSort(front),mSort(back));
    }
    
    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
				ArrayList<Integer> retList = new ArrayList<Integer>();
				while(A.size()>0 && B.size()>0){
						if (A.get(0) < B.get(0)){
								retList.add(A.remove(0));
						}
						else{
								retList.add(B.remove(0));
						}
						
				while (A.size()>0){
						retList.add(A.remove(0));
				}
				while (B.size()>0){
						retList.add(B.remove(0));
				}
				return retList;
		}

    public static void main(String[] args){
				MsortDemo m = new MsortDemo();
				ArrayList<Integer> a = new ArrayList<Integer>();
				int i;
				Random r = new Random();
				for (i=0;i<20;i++){
						a.add(r.nextInt(100));
				}
				//System.out.println(b);
				//System.out.println(m.merge(a,b));
				System.out.println(a);
	System.out.println(m.mSort(a));
		}
		}
}
		
