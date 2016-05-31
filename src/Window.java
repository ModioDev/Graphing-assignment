

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JPanel{
	
	private static double scale = 2;
	
	
	int count = 0;
	private Component window;
	private BufferedImage GamePicture;
	private Graphics g;
	private ConicE bb;
	private Coordinates[] coords= new Coordinates[1000];
	
	
	public Window(){
		GamePicture = new BufferedImage(1050, 1050, BufferedImage.TYPE_INT_ARGB);
		g = GamePicture.createGraphics();
		
        Graphics2D g2d = GamePicture.createGraphics();
       
        g2d.drawImage(GamePicture, 0, 0, this);
        
        g2d.dispose();
        
        
        
       
        
	}
	
	public void run(){
		Component COMPONENT = new Window();
		JFrame frame = new JFrame("CONICS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(COMPONENT);
        //frame.setSize((int)Math.floor(TextureLoader.getMapWidth()*16*scale), (int) Math.floor(TextureLoader.getMapHeight()*16*scale)+2*(int)Math.floor(16*scale));
        frame.setSize(GamePicture.getWidth(),GamePicture.getHeight());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        window = frame;
        paintComponent(g);
	}
	
	
	
	
	@Override
    protected void paintComponent(Graphics g) {
		//bb=new ConicE(70,75,69,42,15,40);
		bb=new ConicE(1,1,1,1,1,1);
		getCurve(bb);
		
		
		/*
		DecimalFormat df2 = new DecimalFormat("#.000");
		double[] nums = new double[6];
		double angleNum;
		
		System.out.println("Input A, B, C, D, E, F");
		Scanner inp = new Scanner(System.in);
		
		for(int i=0; i<6; i++)
			nums[i] = inp.nextDouble();
		
		//sets double 'angleNum' to rotation value
		angleNum =(Math.atan(nums[1] / (nums[0] + nums[2])));
		if(angleNum < 0)
			angleNum+= 3.1415926535;
		angleNum = angleNum/2;
		
		//angle of rotation
		System.out.println("Original val: "+angleNum);
		String angle = new String(df2.format(angleNum));
		System.out.println("Rounded val: "+angle);
		
		//x = u*cos(@) - v*sin(@)
		//y = u*sin(@) + v*cos(@)
		
		System.out.println("x = u*cos("+angle+") - v*sin("+angle+")");
		System.out.println("y = u*sin("+angle+") + v*cos("+angle+")");
		
		String x = "u*cos("+angle+") - v*sin("+angle+")";
		String y = "u*sin("+angle+") + v*cos("+angle+")";
		
		
		//String uyCoefficient = df2.format(Math.sin(angleNum));
		//String vyCoefficient = df2.format(Math.cos(angleNum));
		
		//String uxCoefficient = df2.format(Math.cos(angleNum));
		//String vxCoefficient = df2.format(Math.sin(angleNum));
		
		
		//Substitute A,B,C,D,E,F for values in nums[] above ^^^
		System.out.println("\n"+nums[0]+"("+x+")^2 +\n"+nums[1]+"(("+x+") ("+y+")) +\n"+nums[2]+"("+y+")^2 +\n"+nums[3]+"("+x+") +\n"+nums[4]+"("+y+") +\n"+nums[5]+"");
		*/
		
      //  super.paintComponent(g);
        
       // stateEngine.Render(g);
		
		BufferedImage graph = new BufferedImage(1000,1000, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = graph.createGraphics();
        for(int i = 0; i<1000; i++){
        	//BufferedImage graph = new BufferedImage(300,300, BufferedImage.TYPE_INT_ARGB);
        	//Graphics2D g2 = graph.createGraphics();
        	g2.setColor(Color.RED);
        	//g2.fillRect((i/1000)+150, -(int)Math.pow((double)(i)/(10000.0),2)+200, 1, 1);
        	//g2.fillRect((i/10)+150, -(int)Math.pow((double)(i/100.0),(2.0))+200, 1, 1);
        	if(coords[i].getYNeg() != 0){
        		g2.fillRect(coords[i].getX()+500, -(int)(coords[i].getYNeg())+500, 1, 1);
            	g2.fillRect(coords[i].getX()+500, -(int)(coords[i].getYPos())+500, 1, 1);
        	}
        	
        	//g2.fillRect(i+150+1, -(int)Math.pow((double)(i+1),2)/80+200, 1, 1);
        	//g2.drawLine((i*10)+150, -(int)Math.pow((double)i,2)+200, (i*10+1)+150, -(int)Math.pow((double)(i+1),2)+200);
        	//g.drawImage(graph, 0, 0, 300, 300, window);
        	
        	
        }
        /*
        for(int i = 0; i<300; i++){
        	//BufferedImage graph = new BufferedImage(300,300, BufferedImage.TYPE_INT_ARGB);
        	//Graphics2D g2 = graph.createGraphics();
        	g2.setColor(Color.BLACK);
       // 	g2.fillRect(i+150, (int)Math.pow((double)i,2)/80+100, 1, 1);
        	g2.drawLine(i+150, (int)Math.pow((double)i,2)/80+100, i+150+1, (int)Math.pow((double)(i+1),2)/80+100);
        	//g.drawImage(graph, 0, 0, 300, 300, window);
        	
        	
        }
        for(int i = 0; i<300; i++){
        	//BufferedImage graph = new BufferedImage(300,300, BufferedImage.TYPE_INT_ARGB);
        	//Graphics2D g2 = graph.createGraphics();
        	g2.setColor(Color.BLACK);
        //	g2.fillRect(-i+150, -(int)Math.pow((double)i,2)/80+200, 1, 1);
        	g2.drawLine(-i+150, -(int)Math.pow((double)i,2)/80+200, -i+150-1, -(int)Math.pow((double)(i+1),2)/80+200);
        	//g.drawImage(graph, 0, 0, 300, 300, window);
        	
        	
        }
        for(int i = 0; i<300; i++){
        	//BufferedImage graph = new BufferedImage(300,300, BufferedImage.TYPE_INT_ARGB);
        	//Graphics2D g2 = graph.createGraphics();
        	g2.setColor(Color.CYAN);
        	//g2.fillRect(-i+150, (int)Math.pow((double)i,2)/80+100, 1, 1);
        	g2.drawLine(-i+150, (int)Math.pow((double)i,2)/80+100, -i+150-1, (int)Math.pow((double)(i+1),2)/80+100);
        	//g.drawImage(graph, 0, 0, 300, 300, window);
        	
        	
        }
        */
        //graph.SCA
       // graph.SCALE_SMOOTH();
       // g.drawImage(graph.getScaledInstance(700, 700, 0), 0, 0, window);
        g.drawLine(500, 1000, 500, 0);
        g.drawLine(0, 500, 1000, 500);
        g.drawImage(graph, 0, 0, window);
        //g.drawArc(50, 50, 90, 90, 0, 90);
        //repaint();

       

    }
	public void getCurve(ConicE a)
	{
		
		for(int i=0;i<500;i++)
		{
			coords[i] = new Coordinates(i,a.getYAtXpos(i),a.getYAtXneg(i));
		}
		for(int i=-500;i<0;i++)
		{
			coords[i+1000] = new Coordinates(i,a.getYAtXpos(i),a.getYAtXneg(i));
			
			
		}
		
	}

}
