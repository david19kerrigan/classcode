import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui2 extends JFrame implements ActionListener {

		private Container pane;
		private JButton b1,b2,labeler;
		private JLabel l;
		private JTextArea text;
		private JPanel canvas;
		private JCheckBox box;
		private int x = 10;
		private int y = 10;

		private class Canvas extends JPanel {
				public void paintComponent(Graphics g){
						super.paintComponent(g);
						g.setColor(Color.red);
						g.fillOval(x,y,30,30);
				}

		}
		
		private class Key implements KeyListener {
				public void keyPressed(KeyEvent e){}
				public void keyReleased(KeyEvent e){}
				public void keyTyped(KeyEvent e){
						if (box.isSelected()){
								String s = text.getText();
								s = s.toUpperCase();
								text.setText(s);
						}
				}
		}
		
		public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b1){
						System.out.println("You clicked click me");
						System.out.println("By the way, the text box has: "+text.getText());
						System.out.println();
						x = x + 5;
						y = y + 5;
						canvas.update(canvas.getGraphics());
						} else if (e.getSource() == b2) {
						System.out.println("Shutting down");
						System.exit(0);
				} else if (e.getSource() == labeler){
						l.setText(text.getText());
					  //JLabel l2 = new JLabel(text.getText());
						//pane.add(l2);
				}
		}
		
		public Gui2(){

				setTitle("My First Gui");
				setSize(600,600);
				setLocation(100,100);
				setDefaultCloseOperation(EXIT_ON_CLOSE);

				pane = getContentPane();
				//pane.setLayout(new GridLayout(3,3));
				pane.setLayout(new FlowLayout());
				l = new JLabel("The Label:");
				pane.add(l);
						
				b1 = new JButton("click me");
				pane.add(b1);
				b1.addActionListener(this);
				b2 = new JButton("exit");
				b2.addActionListener(this);
				pane.add(b2);
				labeler = new JButton("labeler");
				labeler.addActionListener(this);
				pane.add(labeler);
				box = new JCheckBox("Cap");
				pane.add(box);
				text = new JTextArea();
				text.setColumns(40);
				text.setRows(10);
				text.setBorder(BorderFactory.createLineBorder(Color.red,2));
				text.addKeyListener(new Key());
				pane.add(text);

				canvas = new Canvas();
				canvas.setPreferredSize(new Dimension(300,300));
				canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
				pane.add(canvas);
				
}
		
		public static void main(String[] args) {
			  Gui2 f = new Gui2();
				f.setVisible(true);
		}
}
