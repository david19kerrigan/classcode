

public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }

    public String tri1(int h){
	String s = "";
	int i = 0;
	int j;
        while (i<=h) {
	    j = 0;
	    while (j<i) {
		s = s + "*";
		j++;
	    }
	    s=s+"\n";
	    i++;
	}
	return s;
    }

    public String tri2(int h){
	int row=0;
	int i;
	String s = "";
	while (row<h){
	    /* space part */
	    i=0;
	    while (i < h-row-1){
		s = s + ".";
		i++;
	    }

	    /* star part */
	    /*
	    i=0;
	    while (i<row+1){
		s=s+"*";
		i++;
	    }
	    */

	    for (i=0;i<row+1;i++){
		s=s+"*";
	    }
	    s=s+"\n";
	    row++;
	    
	}
	return s;

    }
	
    
}
