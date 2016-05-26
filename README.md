import java.util.*;
import java.applet.Applet;
import java.awt.color.*;
import java.awt.Graphics;

public class Graph extends Applet {

	private Graphics paper= null;
	public void init()
	{
		super.init();
		this.setSize(500,500);
	}
	public void paint(Graphics g)
	{
		ConicE bb=new ConicE(70,75,69,42/*blaze it*/,15,40);
		super.init();
		this.setSize(500,500);
		this.setSize(500,500);
		paper=g.create();
		paper.drawLine(250 , 0, 250, 500);
		paper.drawLine(0, 250, 500, 250);
		/*
		paper.drawLine(251, 0, 251, 500);
		paper.drawLine(0, 251, 500, 251);
		paper.drawLine(249, 0, 249, 500);
		paper.drawLine(0, 249, 500, 249);
		*/
		
		for(int i = 50; i < 500; i+=100)
			if(i != 250){
				paper.drawLine(i , 0, i, 500);
				paper.drawLine(0, i, 500, i);}
		paper.drawLine(251, 0, 251, 500);
		paper.drawLine(0, 251, 500, 251);
		paper.drawLine(249, 0, 249, 500);
		paper.drawLine(0, 249, 500, 249);
		this.getCurve(bb);
	}
	public void getCurve(ConicE a)
	{
		Cordinates[] coords= new Cordinates[500];
		for(int i=0;i<250;i++)
		{
			coords[i] = new Cordinates(i,a.getYAtXpos(i),a.getYAtXneg(i));
		}
		for(int i=-250;i<0;i++)
		{
			coords[i+500] = new Cordinates(i,a.getYAtXpos(i),a.getYAtXneg(i));
		}
		drawCurve(coords);
	}
	public void drawCurve(Cordinates[] c)
	{
		for(int i = 0; i < c.length-2; i+=2)
		{
			paper.drawLine(c[i].getX()+250,(int)Math.sqrt((c[i].getYNeg())*(c[i].getYNeg()))+250,c[i+1].getX()+250,(int)Math.sqrt((c[i+1].getYNeg())*(c[i+1].getYNeg()))+250);
		}
		for(int i = 0; i < c.length-2; i+=2)
		{
			paper.drawLine(c[i].getX()+250,(int)Math.sqrt((c[i].getYPos())*(c[i].getYPos()))-250,c[i+1].getX()+250,(int)Math.sqrt((c[i+1].getYPos())*(c[i+1].getYPos()))-250);
		}
	}
}






