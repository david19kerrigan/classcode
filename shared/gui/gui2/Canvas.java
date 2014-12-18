import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;


/* The canvas has to be able to "redraw" itself every time something changes
   or moves.
*/

public class Canvas extends JPanel implements MouseListener, MouseMotionListener
{

    /* This holds all the lines so we can redraw them */
    private ArrayList<Line> lines = new ArrayList<Line>();

    /* This is for the "temporary" line used while we are actually
       drawing a new line
    */
    private Line tmpline;

    private boolean drawing=false;

    private int startX,startY;
    private int oldX, oldY;

    private boolean enabled = true;
    
    private CheckboxGroup options;

    public void mouseMoved(MouseEvent e)
    {
    }

    /* We are in the act of drawing as long as the mouse is dragged */
    public void mouseDragged(MouseEvent e)
    {
	String opt = options.getSelectedCheckbox().getLabel();
	System.out.println(opt);

	
	/* In line node the node modes, while drawing, draw the temp line so we can
	   see where the line goes or the diameter of the node

	   In Draw mode, just add little lines each time (to approximate curves)
	*/
	if (opt.equals("Line") || opt.equals("Node") || opt.equals("AutoNode"))
	    {
		this.startDrawing(new Line(startX,startY,
					   e.getX(),e.getY(),
					   Color.blue));
	    }
	
	else if (opt.equals("Draw"))
	    {

		this.addLine(new Line(oldX, oldY,
				      e.getX(),e.getY(),
				      Color.green));
		oldX = e.getX();
		oldY = e.getY();
	    }

	// force a redraw
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
	/*
	Node n = new Node(e.getX(),e.getY(),Color.red);
	this.add(n);
	this.update(this.getGraphics());
	*/
    }

    /* Start the act of drawing */
    public void mousePressed(MouseEvent e)
    {
	startX = e.getX();
	startY = e.getY();
	oldX = startX;
	oldY = startY;
    }

    /*  finish up drawing an item */
    public void mouseReleased(MouseEvent e)
    {
	String opt = options.getSelectedCheckbox().getLabel();

	if (opt.equals("Line"))
	    {
		this.addLine(new Line(startX,startY,
				      e.getX(),e.getY(),
				      Color.red));
		this.stopDrawing();
	    }
	else if (opt.equals("Node"))
	    {
		double x,y;
		x = Math.abs(startX-e.getX());
		y = Math.abs(startY-e.getY());
		int size= (int)Math.sqrt(x*x+y*y);
		  
		Node n = new Node(startX,startY,size,Color.red);
		this.add(n);
		this.stopDrawing();
	    }

	else if (opt.equals("AutoNode"))
	    {
		double x,y;
		x = Math.abs(startX-e.getX());
		y = Math.abs(startY-e.getY());
		int size= (int)Math.sqrt(x*x+y*y);
		  
		Autonode n = new Autonode(startX,startY,size,Color.red);
		this.add(n);
		this.stopDrawing();
	    }


	this.update(this.getGraphics());

    }



    public Canvas(CheckboxGroup options)
    {
	this.options = options;
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
    }


    public void clear()
    {
	lines = new ArrayList<Line>();
	drawing=false;
	this.update(this.getGraphics());
    }
    public void startDrawing(Line l)
    {
	drawing = true;
	tmpline = l;
    }

    public void stopDrawing()
    {
	drawing=false;
    }

    
    /* We just seem to need this - not sure why */
    public Dimension getPreferredSize()
    {
	return new Dimension(300,300);
    }


    public void addLine(Line l)
    {
	lines.add(l);
    }

    /* This actually draws on the screen */
    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	if (drawing)
	    {
		g.setColor(tmpline.c);
		g.drawLine(tmpline.x0,tmpline.y0,
			   tmpline.x1,tmpline.y1);
	    }

	
	for (Line l : lines)
	    {
		g.setColor(l.c);
		g.drawLine(l.x0,l.y0,l.x1,l.y1);
	    }

    }



}
