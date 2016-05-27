
public class Coordinates {
	public int x;
	public int yp;
	public int yn;
	
	public  Coordinates(double one, double ypos, double yneg)
	{
		x=(int) one;
		yp=(int) ypos;
		yn=(int) yneg;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getYNeg()
	{
		return yn;
	}
	
	public int getYPos()
	{
		return yp;
	}

}
