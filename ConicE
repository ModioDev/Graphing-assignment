import java.util.*;
import java.math.*;
public class ConicE {
	public double a;
	public double b;
	public double c;
	public double d;
	public double e;
	public double f;
	public double cosz;
	public double cos;
	public double sin;
	public double ap;
	public double bp;
	public double cp;
	public double dp;
	public double ep;
	public double theta;
	public String standnote;
	public double fp;
	public double bpp;
	public char prop;
	public ConicE(double A, double B, 
			double C,double D,double E,double F)
	{
		a=A;
		b=B;
		c=C;
		d=D;
		e=E;
		f=F;
		cosz=((a-c)/Math.sqrt((b*b)+Math.pow(a-c, 2)));
		cos=Math.sqrt((1+cosz)/2);
		sin=Math.sqrt((1-cosz)/2);
		ap=a*cos*cos+b*cos*sin+c*sin*sin;
		bp=2*a*cos*sin+b*cos*cos+2*c*cos*sin-b*sin*sin;
		cp=a*sin*sin+c*cos*cos-b*cos*sin;
		if(cp==0)
		{
			cp=1/2;
		}
		dp=d*cos+e*sin;
		ep=e*cos-d*sin;
		standnote=(ap+"u^2 + "+bp+"uv + "+cp+"v^2 + "+dp+"u + "+ep+"v + "+f+" = 0");
		System.out.println(this.findAngleRotation());
		System.out.println(this.getStandardNote());
		if(a==c&& a>0)
		{
			prop='c';
		}
		else if(a!=c&&a>0&&c>0)
		{
			prop='e';
		}
		else if(a==0||c==0)
		{
			prop='p';
		}
		else if(a<0||c<0)
		{
			prop='h';
		}
		else
		{
			System.out.println("ERROR NOT VALID");
		}	
	}
	public double findAngleRotation()
	{
		theta=(Math.acos(cosz)/2.0);
		return theta;
	}
	public String getStandardNote()
	{
		return standnote;
	}
	public double getYAtXpos(double x)
	{
		double y=0.0;
		bpp=bp*x+ep;
		fp=(ap*(x*x))+(dp*x)+f;
//		System.out.print(fp + " ");
		double inside = (bpp*bpp)-(4*cp*fp);
		double numerator = (0-bpp+(Math.sqrt(inside)));
		double denomerator = 2*cp;
//		System.out.print(inside + " || ");
//		System.out.print(numerator + " / ");
//		System.out.print(denomerator + " ");
		y=numerator/denomerator;
		int y2 = (int)(y*10000);
		y = (double)(y2/10000);
		//System.out.println(y);
		return y;
	}
	public double getYAtXneg(double x)
	{
		double y=0.0;
		bpp=bp*x+ep;
		fp=(ap*(x*x))+(dp*x)+f;
//		System.out.print(fp + " ");
		double inside = (bpp*bpp)-(4*cp*fp);
		double numerator = (0-bpp-(Math.sqrt(inside)));
		double denomerator = 2*cp;
//		System.out.print(inside + " || ");
//		System.out.print(numerator + " / ");
//		System.out.print(denomerator + " ");
		y=numerator/denomerator;
		int y2 = (int)(y*10000);
		y = (double)(y2/10000);
		//System.out.println(y);
		return y;
	}
}
