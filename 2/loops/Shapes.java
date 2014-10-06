
public class Shapes {

    public String line(String c, int n){
	String s = "";
	for (int i = 0; i < n; i++) {
	    s = s + c;
	}
	return s;
    }
    
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }

    public String tri1(int h){
	String s = "";

	/*
	  int i=0;
	  while (i<h){
	  
	  i++;
	  }
	 */

	int i,j;
	for (i=0;i<h;i++){
	    for (j=0;j<=i;j++) {
		s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }

    public String tri2(int height){
	int h;
	int i;
        String s="";
	for (h=1;h<=height;h++){
	    /* add the next space line */
	    for (i=0;i<height-h;i++){
		s = s + ".";
	    }

	    /* add the next triangle line */
	    for (i=0;i<h;i++){
		s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }

    public String tri3(int h){
	String s = "";
	for (int r=0;r<h;r++){
	    s=s+line(".",h-r-1)+
		line("*",2*r+1)+
		"\n";
	}
	return s;
    }

    public String diamond(int h){
	h = h - (h/2);
	String s = tri3(h);
	
	//	for (int r=0;r<h;r++){
	for (int r=h-2;r>=0;r--){
	    s=s+line(".",h-r-1)+
		line("*",2*r+1)+
		"\n";
	}
	return s;
    }
    
}
