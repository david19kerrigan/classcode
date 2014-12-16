import javax.swing.*;
import java.awt.*;

public class Gui1 extends JFrame {

		private Container pane;
		private JButton b1,b2;
		private JLabel l;
		private JTextArea text;
		private JPanel canvas;
		
		public Gui1(){

				setTitle("My First Gui");
				setSize(600,600);
				setLocation(100,100);
				setDefaultCloseOperation(EXIT_ON_CLOSE);

				pane = getContentPane();
				//pane.setLayout(new GridLayout(3,3));
				pane.setLayout(new FlowLayout());
				l = new JLabel("The Label:");
				pane.add(l);
						
				b1 = new JButton("button");
				pane.add(b1);
				b2 = new JButton("exit");
				pane.add(b2);
				text = new JTextArea();
				text.setColumns(40);
				text.setRows(10);
				text.setBorder(BorderFactory.createLineBorder(Color.red,2));
				pane.add(text);

				canvas = new JPanel();
				canvas.setPreferredSize(new Dimension(300,300));
				canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
				pane.add(canvas);

				/* 
					 add more buttons and add a new grid of 6 buttons to the 
					 bigger grid box

				pane.add(new JButton("hello1"));
				pane.add(new JButton("hello2"));
				pane.add(new JButton("hello3"));
				JPanel f2 = new JPanel();
				pane.add(f2);
				f2.setLayout(new GridLayout(3,3));
				f2.add(new JButton("aaa"));
				f2.add(new JButton("aaa"));
				f2.add(new JButton("aaa"));
				f2.add(new JButton("aaa"));
				f2.add(new JButton("aaa"));
				f2.add(new JButton("aaa"));
				*/
				
}
		
		public static void main(String[] args) {
			  Gui1 f = new Gui1();
				f.setVisible(true);
		}
}
