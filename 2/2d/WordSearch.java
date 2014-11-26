import java.util.*;
import java.io.*;
/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private Random rnd = new Random();
    private char[][] board,key;
		private ArrayList<String> wordlist, words;
		
    public WordSearch(int r, int c){
				board = new char[r][c];
				for (int i = 0; i < board.length; i++) {
						for (int j = 0; j < board[i].length; j++) {
								board[i][j]='.';
						}
				}

				Scanner sc = null;
				try {
						sc = new Scanner(new File("words.txt"));
				} catch (Exception e){
						System.out.println("Can't open word file");
						System.exit(0);
				}
				wordlist = new ArrayList<String>();
				while (sc.hasNext()){
						wordlist.add(sc.next());
				}

    }
    public WordSearch(){
				this(20,30);
    }

    public String toString(){
				String s = "";

				for (int i = 0; i < board.length; i++) {
						for (int j = 0; j < board[i].length; j++) {
								s = s + board[i][j];
						}
						s = s + "\n";
				}
						s=s+this.getWords();
				return s;
    }

    public String getKey(){
				String s = "";
				for (int i = 0; i < key.length; i++) {
						for (int j = 0; j < key[i].length; j++) {
								s = s + key[i][j];
						}
						s = s + "\n";
				}
				return s;
    }

		private void makeKey() {
				key = new char[board.length][board[0].length];
				for (int i = 0; i < board.length; i++) {
						for (int j = 0; j < board[i].length; j++) {
								key[i][j]=board[i][j];
						}
				}
		}
		
    public boolean addWordHelper(String w,int row, int col,int deltaRow, int deltaCol){
				int r = row, c = col;
				
				for (int i=0;i<w.length();i++){
						try {
								if (board[r][c]!='.' && board[r][c]!=w.charAt(i)){
										return false;
								}
						} catch ( Exception e){
								return false;
						}
						r = r + deltaRow;
						c = c + deltaCol;
				}
				r = row;
				c = col;

				for (int i=0;i<w.length();i++){
						board[r][c] = w.charAt(i);
						r = r + deltaRow;
						c = c + deltaCol;
				}
				return true;
    }

    public boolean addWord(String w) {
				int row = rnd.nextInt(board.length);
				int col = rnd.nextInt(board[0].length);
				int deltaRow = -1 + rnd.nextInt(3);
				int deltaCol = -1 + rnd.nextInt(3);

				if (deltaRow == 0 && deltaCol == 0)
						return false;
	
				return addWordHelper(w,row,col,deltaRow,deltaCol);
		}

		public void buildPuzzle(int numwords){
				words = new ArrayList<String>();
				int i = 0;
				while (i<numwords) {
						int wordIndex = rnd.nextInt(wordlist.size());
						String word = wordlist.get(wordIndex);
						if (addWord(word)){
								words.add(word);
								wordlist.remove(wordIndex);
								i++;
						}
				}
				makeKey();

				/* fill the board with random letters */
				for (i = 0; i < board.length; i++) {
						for (int j = 0; j < board[0].length; j++) {
								if (board[i][j]=='.'){

										
										// board[i][j]=(char)((int)'a'+rnd.nextInt(26));
										String letters = "abcdefghijklmnopqrstuvwxyz";
										board[i][j] = letters.charAt(rnd.nextInt(letters.length()));


								}
						}
				}
		}

		public String getWords() {
				return ""+words;
		}
    public static void main(String[] args) {
				WordSearch w = new WordSearch(15,40);
				System.out.println(w);
				w.buildPuzzle(50);
				System.out.println(w);
				System.out.println(w.getKey());
    }
}
