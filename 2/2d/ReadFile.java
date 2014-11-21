import java.io.*;
import java.util.*;

public class ReadFile {
		public static void main(String[] args) {
				Scanner sc = null;
				try {
						sc =new Scanner(new File("words.txt"));
				}	catch (Exception e) {
						System.out.println("File not found");
						System.exit(0);
				}
				while (sc.hasNext()) {
						String s = sc.next();
						System.out.println("Next line: "+s);
						
				}
		}
}
