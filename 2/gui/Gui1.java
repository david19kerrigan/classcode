import javax.swing.*;
import java.awt.*;

public class Gui1 extends JFrame {

		private JButton b1,b2;
		private Container pane;
		private JLabel label;
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
				b1 = new JButton("Click me");
				pane.add(b1);
				b2 = new JButton("exit");
				pane.add(b2);

				label = new JLabel("The Label:");
				pane.add(label);

				text =new JTextArea();
				text.setColumns(40);
				text.setRows(5);
				text.setBorder(BorderFactory.createLineBorder(Color.red,2));
				pane.add(text);

				canvas = new JPanel();
				canvas.setPreferredSize(new Dimension(300,300));
				canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));		
				pane.add(canvas);
				/*
				pane.add(new JButton("button 0"));
				JPanel buttongrid = new JPanel();
				buttongrid.setLayout(new GridLayout(3,3));
				buttongrid.add(new JButton("button 0"));
				buttongrid.add(new JButton("button 1"));
				buttongrid.add(new JButton("button 2"));
				buttongrid.add(new JButton("button 3"));
				buttongrid.add(new JButton("button 4"));
				pane.add(buttongrid);
				*/

		}
		public static void main(String[] args) {
			  Gui1 f = new Gui1();
				f.setVisible(true);
		}
}
