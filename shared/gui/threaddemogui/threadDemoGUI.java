import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.*;

class node extends JPanel implements Runnable
{
    protected int d,x,y,dx,dy;
    protected Thread t;
    protected Color c,baseColor;
    protected Random r;
    protected Image image;
    protected static int firsttime=0;
    protected static images ilist;
    protected int nodeHeight=20;
    protected int nodeWidth=20;

    public node()
    {
	super();
    }
    
    public node(int d, int x, int y)
    {
	super();
	r = new Random();
	this.d = d;
	this.x = x;
	this.y = y;
	int i = r.nextInt(4);
	switch (i)
	    {
	    case 0:
		dx = 1;
		break;
	    case 1:
		dx = -1;
		break;
	    case 2:
		dy = 1;
		break;
	    case 3:
		dy = -1;
		break;
	    }

	baseColor = Color.red;
	c = Color.red;

	if (firsttime==0)
	    ilist = new images("images");
	firsttime++;
	image = ilist.getRandomImage();


	this.setLocation(x,y);
	this.setSize(nodeWidth,nodeHeight);
	this.setVisible(true);
	t = new Thread(this);
	t.start();
    }

    protected void setDeltas()
    {
	int i = r.nextInt(4);
	switch (i)
	    {
	    case 0:
		dx = dx + 1;
		break;
	    case 1:
		dx = dx -1;
		break;
	    case 2:
		dy = dy + 1;
		break;
	    case 3:
		dy = dy -1;
		break;
	    }
    }
    
    protected void updateDelay()
    {
	d = d + -5 + r.nextInt(10);
	if (d<=40) d=40;
	if (d>=200) d = 200;
    }

    private void move()
    {
	setDeltas();
	x = x + dx;
	y = y + dy;
	if (x>550) x = 20;
	if (x<20)  x = 550;
	if (y>550 || y < 20) dy = dy * -1;
	updateDelay();
    }
    
    public int getX() { return x;}
    public int getY() { return y;}

    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	this.setLocation(x,y);
	//g.setColor(c);
	//g.fillOval(0,0,nodeHeight,nodeWidth);
	if (c==baseColor && c==Color.red)
	    {
		g.drawImage(image,0,0,nodeHeight,nodeWidth,Color.black,null);
	    }
	else
	    {
		g.setColor(c);
		this.setSize(nodeWidth,nodeHeight);
		g.fillOval(0,0,nodeHeight,nodeWidth);
	    }

    }


    public boolean overlap(Object n)
    {
	try
	    {
		node tmp = (node)n;
		int nx1=tmp.getX();
		int nx2=nx1+nodeWidth;
		int ny1=tmp.getY();
		int ny2=ny1+nodeHeight;
		if (((nx1>=x&&nx1<=x+nodeWidth) || (nx2>=x&&nx2<=x+nodeHeight))&&
		    ((ny1>=y&&ny1<=y+nodeWidth) || (ny2>=y&&ny2<=y+nodeHeight)))
		    return true;
		return false;
	    }
	catch (ClassCastException e)
	    {
		return false;
	    }
    }

    public void collision()
    {
	boolean o = false;
	board b = (board)this.getParent();
	Object[] nodes = b.getComponents();
	for (int i=0;i<nodes.length;i++)
	    {
		if ((Object)this==(Object)nodes[i])
		    continue;
		try
		    {
			Object tmp = (Object)nodes[i];
			if (overlap((node)tmp))
			    {
				o=true;
				break;
			    }
		    }
		catch (ClassCastException e)
		    {
		    }
	    }
	if (o)
	    c = Color.yellow;
	else
	    c = baseColor;
    }



    public void run()
    {
	while (true)
	    {
		try
		    {
			t.sleep(d);
		    }
		catch (InterruptedException e) {}
		this.move();
		this.collision();
		this.update(this.getGraphics());
	    }
    }
}


class myNode extends node
{
    private int oldx, oldy;

    public myNode(int d, int x, int y)
    {
	this.d=d;this.x=x;this.y=y;
	r = new Random();
	baseColor = Color.blue;
	c = baseColor;
	this.setLocation(x,y);
	this.setSize(nodeWidth,nodeHeight);
	this.setVisible(true);
	dx=0;
	dy=0;
	oldx=x;
	oldy=y;
	t = new Thread(this);
	t.start();
    }

    public void setDeltas()
    {}
    public void updateDelay()
    {}
    
    public void setDeltas(int mx, int my)
    {
	if (mx>oldx)
	    dx=1;
	if (mx<oldx)
	    dx=-1;
	if (my>oldy)
	    dy=1;
	if (my<oldy)
	    dy=-1;
	oldx=mx;
	oldy=my;
    }

    public void updateDelay(int mx,int my)
    {
	if (mx > oldx)
	    d=d-10;
	if (mx<oldx)
	    d=d+10;
	if (d<10)d=10;
	if (d>800)d=800;
    }

}

class board extends JPanel implements MouseListener, MouseMotionListener, KeyListener
{
    Random r = new Random();
    private int button=0;
    Image image;
    images ilist;
    myNode me;

    public Dimension getPreferredSize()
    {
	return new Dimension(600,600);
    }

    public board()
    {
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
	this.addKeyListener(this);
	setSize(600,600);
	ilist = new images("images");
	image = ilist.getRandomImage();
	me = new myNode(r.nextInt(300),100,100);
	this.add(me);

    }

    public void mouseEntered(MouseEvent e)
    {}
    public void mouseExited(MouseEvent e)
    {}
    public void mousePressed(MouseEvent e)
    {
	button=e.getButton();
    }
    public void mouseReleased(MouseEvent e)
    {
	button=0;
    }
    public void mouseClicked(MouseEvent e)
    {
	int x,y;
	if (e.getButton()!=1)
	    return;
	x = e.getX();
	y = e.getY();
	this.add(new node(r.nextInt(300),x,y));
	this.update(this.getGraphics());
	System.out.println("Board Clicled: "+e.getButton()+" x:"+x+" y:"+y);
    }

    public void mouseMoved(MouseEvent e)
    {
	
    }
    public void mouseDragged(MouseEvent e)
    {
	if (button==2)
	    me.setDeltas(e.getX(),e.getY());
	if (button==3)
	    me.updateDelay(e.getX(),e.getY());
    }


    public void keyPressed(KeyEvent e)
    {
	System.out.println("press: "+e.getKeyChar());
    }

    public void keyReleased(KeyEvent e)
    {
	System.out.println("released: "+e.getKeyChar());
    }
    public void keyTyped(KeyEvent e)
    {
	System.out.println("typed: "+e.getKeyChar());
    }

    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	g.drawImage(image,0,0,600,600,Color.black,null);
    }
}

class gui implements ActionListener
{
    JButton update = new JButton("update");
    JButton quit = new JButton("quit");
    JFrame f = new JFrame();
    board b;

    public void actionPerformed(ActionEvent e)
    {
	if (e.getSource()==quit)
	    {
		f.setVisible(false);
		f.dispose();
		System.exit(0);
	    }
	if (e.getSource()==update)
	    {
		b.update(b.getGraphics());
	    }

    }

    public gui()
    {
	f.getContentPane().setLayout(new FlowLayout());
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	b  = new board();
	f.getContentPane().add(b);
	quit.addActionListener(this);
	update.addActionListener(this);
	f.getContentPane().add(update);
	f.getContentPane().add(quit);



	b.update(b.getGraphics());
	b.requestFocus();
	f.pack();
	f.show();
    }

}


class images
{
    private File[] fnames;
    private Image[] images;
    private Random r;

    public images(String dir)
    {
	r = new Random();
	File f = new File(dir);
	fnames = f.listFiles();
	images = new Image[fnames.length];

	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for (int i=0;i<fnames.length;i++)
	    {
		System.out.println(fnames[i].getName());
		images[i]=toolkit.getImage(dir+"/"+fnames[i].getName());
	    }
    }
    public Image getRandomImage()
    {
	int i = r.nextInt(images.length);
	return images[i];
    }
    
}


public class threadDemoGUI
{
    public static void main(String[] args)
    {
	gui g = new gui();
    }
}
