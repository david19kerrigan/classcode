import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui2 extends JFrame implements ActionListener {

		private JButton b1,b2,labeler;
		private Container pane;
		private JLabel label;
		private JTextArea text;
		private Canvas canvas;
		private JCheckBox box;

		private int x=10;
		private int y=10;
		
		private class Canvas extends JPanel {
				public void paintComponent(Graphics g){
						super.paintComponent(g);
						g.setColor(Color.red);
						g.fillOval(x,y,30,30);
				}
		}
		
		private class Key implements KeyListener {
				public void keyPressed(KeyEvent e) {}
				public void keyReleased(KeyEvent e) {}
				public void keyTyped(KeyEvent e) {
						if (box.isSelected()){
								String s = text.getText();
								s = s.toUpperCase();
								text.setText(s);
						}
				}
		}
		
		public void actionPerformed(ActionEvent e){
				if (e.getSource() == b1){
						System.out.println("You Clicked Click me");
						System.out.println("And the textarea has: "+text.getText());
						x = x + 10;
						y = y + 10;
						canvas.update(canvas.getGraphics());
				} else if (e.getSource() == labeler){
						label.setText(text.getText());
						// pane.add(new JLabel(text.getText()));
						text.setText("");
				} else if (e.getSource() == b2){
						System.out.println("Shutting down");
						System.exit(0);
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
				b1 = new JButton("Click me");
				b1.addActionListener(this);
				pane.add(b1);
				
				b2 = new JButton("exit");
				b2.addActionListener(this);
				pane.add(b2);

				labeler = new JButton("Labeler");
				labeler.addActionListener(this);
				pane.add(labeler);
				
				label = new JLabel("The Label:");
				pane.add(label);

				box = new JCheckBox("Cap");
				pane.add(box);
				text =new JTextArea();
				text.setColumns(40);
				text.setRows(5);
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
