package CoreJava;
import java.util.Calendar;
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printLine(55,'@');
		printLine(50);
		System.out.println("------------------------------------------");
		System.out.println("James Gosling created Java");
		System.out.println("------------------------------------------");
		System.out.println("Created at Sun Microsystems");

		
		printLine(20);
		printLine(50,'=');
		int a = 20, b = 30;
		int c= max(a,b);
		System.out.println(c);
		System.out.println("Today is "+today()+"th");

	}
	public static int max(int x, int y)
	{
		if(x>y){
			return x;
		}
		else
		{
			return y;
		}
	}
	public static void printLine(int length,char c)
	{
		for(int i=0; i <length;i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
	public static void printLine(int length)
	{
		System.out.println("------------------------------------------");
	}
	public static int today()
	{
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.DATE);
	}

}
