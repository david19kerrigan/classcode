import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;

public class Autonode extends Node
{
    private Random R;
    public Autonode(int x, int y, Color c)
    {
	super(x,y,c);
	R = new Random();
    }
    public Autonode(int x, int y, int size,Color c)
    {
	super(x,y,size,c);
	R = new Random();
    }

    /* paint is the the same as regular node but it sets a random color */
    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	this.setSize(size,size);
	this.setLocation(x,y);
	c = new Color(R.nextInt(256),
		      R.nextInt(256),
		      R.nextInt(256));
	g.setColor(c);
	g.fillOval(0,0,size,size);
	g.setColor(Color.white);
	g.drawString(label,size/2,size/2);
    }

}
