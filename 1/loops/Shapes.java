

public class Shapes {


    public String line(String c, int n){
	String s = "";
	for (int i=0;i<n;i++){
	    s=s+c;
	}
	return s;
    }
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
	
    public String tri3(int height){
	int r;
	String s="";
	for (r=0;r<height;r++){
	    /*
	    s = s + line(".",height-r-1);
	    s = s + line("*",2*r+1);
	    s=s+"\n";
	    */
	    s=s+line(".",height-r-1)+
		line("*",2*r+1)+
		"\n";
		
	}
	return s;
    }

    public String diamond(int h){
	String s = tri3((h+1)/2);
	int r;
	for (r=(h- 1)/2-1;r>=0;r--){
	    for (int i=0;i<h-r-3;i++){
		s=s+".";
	    }
	    for (int i=0;i<2*r+1;i++){
		s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }
}
