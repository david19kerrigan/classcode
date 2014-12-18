import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;



public class Gui implements ActionListener
{
    private JFrame frame;
    private JButton quit;
    private JButton doStuff;
    private JButton clear;
    private Canvas canvas;
    private JPanel iface;
    private JLabel fnamelabel;
    private JTextField fnamefield;
    private CheckboxGroup options;
    private Checkbox Linebox;
    private Checkbox Drawbox;
    private Checkbox Nodebox;
    private Checkbox Autobox;

    public void actionPerformed(ActionEvent e)
    {
	//System.out.println(e);
	if (e.getSource() == clear)
	    {
		canvas.clear();
		canvas.paintComponent(canvas.getGraphics());
	    }
	else if (e.getSource() == quit)
	    {
		System.exit(0);
	    }
	else if (e.getSource() == doStuff)
	    {
		// THis is just stuff to show how the event works
		// it's not part of the drawing program
		String opt = options.getSelectedCheckbox().getLabel();
		int n;
		if (opt.equals("Triple"))
		    n=3;
		else if (opt.equals("Double"))
		    n = 2;
		else
		    n=1;

		String s = fnamefield.getText();
		for (int i=0;i<n;i++)
		    System.out.println(i+":"+s);
		System.out.println();
		//quit.setText(s);
		//enabled = !enabled;
		//quit.setEnabled(enabled);
	    }

	
    }


    public Gui()
    {
	frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(new FlowLayout());


	options = new CheckboxGroup();
	Linebox = new Checkbox("Line",options,true);
	Drawbox = new Checkbox("Draw",options,false);
	Nodebox = new Checkbox("Node",options,false);
	Autobox = new Checkbox("AutoNode",options,false);

	canvas = new Canvas(options);
	canvas.setBorder(BorderFactory.createLineBorder (Color.blue, 2));
	iface = new JPanel();
	iface.setLayout(new GridLayout(16,1));
	frame.getContentPane().add(canvas);
	frame.getContentPane().add(iface);

	fnamelabel=new JLabel("Filename:");
	fnamefield=new JTextField(5);
	
	JPanel box = new JPanel();
	box.add(fnamelabel);
	box.add(fnamefield);

	iface.add(box);


	quit = new JButton("Quit");
	doStuff = new JButton("Do Stuff");
	clear = new JButton("Clear");

	clear.addActionListener(this);
	quit.addActionListener(this);
	doStuff.addActionListener(this);
	
	
	iface.add(Linebox);
	iface.add(Drawbox);
	iface.add(Nodebox);
	iface.add(Autobox);


	iface.add(new JLabel());
	
	iface.add(doStuff);
	iface.add(clear);
	iface.add(quit);

	/*
	javax.swing.Timer time = new javax.swing.Timer(5000,this);
	time.setInitialDelay(10000);
	time.start();
	*/
	frame.setSize(550,600);
	frame.setVisible(true);


    }

}
