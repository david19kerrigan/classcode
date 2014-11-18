import java.io.*;
import java.util.*;

public class TwoD {

		public static void main(String[] args) {
				int[][] a;
				a = new int[6][4];
				System.out.println(a.length);
				System.out.println(a[2].length);
				System.out.println(a[2][1]);

				for (int i=0;i<a.length;i++){
						System.out.println("row: "+i+" has length: "+a[i].length);
						for (int j=0;j<a[i].length;j++){
								System.out.print(a[i][j]+",");
						}
						System.out.println();
				}

						System.out.println();
						System.out.println();

				a[3][2]=20;
				a[1][0]=15;
				a[0][3]=12;

				for (int i=0;i<a.length;i++){
						System.out.println("row: "+i+" has length: "+a[i].length);
						for (int j=0;j<a[i].length;j++){
								System.out.print(a[i][j]+",");
						}
						System.out.println();
				}
						System.out.println();
						System.out.println();

						a[1]= new int[20];
						
				for (int i=0;i<a.length;i++){
						System.out.println("row: "+i+" has length: "+a[i].length);
						for (int j=0;j<a[i].length;j++){
								System.out.print(a[i][j]+",");
						}
						System.out.println();
				}


		}

}
