import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class ClassObjectLengthWidth {
	private int length;
	private int width;
	{
		int length; 
		int width;
		
		void getdata(int x, int y)
		{
			int length = x;
			int width = y;
		}
		int Area()
		{
			int area = length * width;
			return(area);
		}
	}
	
	class B
	{
		public static void main(String[] args) {
			
			int a1,a2;
			Rectangle r1 = new Rectangle();
			Rectangle r2 = new Rectangle();
			
			r1.length= 15;
			r2.width = 10;
			
			a1 = r1.length * r1.width;
			r2.getdata(20,12);
			a2 = r2.Area();
			System.out.println(a1);
			System.out.println(a2);
			
	}
}

