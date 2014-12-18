import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;


public class Node extends JPanel implements MouseListener,MouseMotionListener
{

    protected int x,y,size;
    protected Color c;
    protected String label;
    public static char last_letter='a';
    
    public void mouseMoved(MouseEvent e)
    {
    }
    public void mouseDragged(MouseEvent e)
    {
	x=x+e.getX();
	y=y+e.getY();
	this.c=Color.blue;
	this.update(this.getGraphics());
    }
    public void mouseEntered(MouseEvent e)
    {
    }
    public void mouseExited(MouseEvent e)
    {
    }
    public void mouseClicked(MouseEvent e)
    {
    }
    public void mousePressed(MouseEvent e)
    {
    }
    public void mouseReleased(MouseEvent e)
    {
	this.c=Color.red;
	this.update(this.getGraphics());
    }


    public Node(int x, int y, Color c)
    {
	this.x = x;
	this.y=y;
	this.c = c;
	size=20;
	this.label=""+last_letter;
	last_letter++;
	this.setSize(size,size);
	this.setVisible(true);
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
    }


    public void paintComponent(Graphics g)
    {
	this.setSize(size,size);
	this.setLocation(x,y);
	g.setColor(c);
	g.fillOval(0,0,size,size);
	g.setColor(Color.black);
	//g.drawString(label,5,15);
    }
}