import java.io.*;
import java.util.*;

public class Maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;
		private char wall=' ';
		private char exit='$';
		private char path='#';
		private char me='z';
		private char visited='.';
    public Maze() 
    {
				maxX=40;
				maxY=20;
				board = new char[maxX][maxY];
				int i=0,j=0;
    try {
				Scanner sc = new Scanner(new File("maze.dat"));
				j=0;
				while (sc.hasNext())
						{
								String line = sc.nextLine();
								for (i=0;i<maxX;i++)
										{
												board[i][j] = line.charAt(i);
										}
								j++;
						}
    }
    catch (Exception e)
				{
				}
    
    }
		
    public String toString()
    {

				String ANSI_CLS = "\u001b[2J";
				String s = ANSI_CLS;
				for (int y=0;y<maxY;y++)
						{
								for (int x=0;x<maxX;x++)
										s = s +board[x][y];
								s=s+"\n";
						}
				
				return s;
    }
		

		public void solve(int x, int y){

				try {
						Thread.sleep(50);
				} catch (Exception e){}
				if (board[x][y]==exit){
						System.out.println(this);
						System.exit(0);
				}
				if (board[x][y] != path)
						return;

				board[x][y]=me;
				System.out.print(this);

				System.out.print(x+","+y);
				
				solve(x+1,y);
				solve(x-1,y);
				solve(x,y+1);
				solve(x,y-1);
				board[x][y]=visited;
				
		}


		public static void main(String[] args){
				Maze m = new Maze();
				System.out.print(m);
				m.solve(1,1);
				
		}
		
}

