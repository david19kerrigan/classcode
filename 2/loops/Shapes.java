
public class Shapes {
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

}
