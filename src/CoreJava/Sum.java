package CoreJava;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=53689;
		int sum1;
		sum1=i;
		int sum=0;
		int k,d,ld=0;
		for(k=1;k<=3;k++)
		{
			d=i%10;
			i=i/10;
			sum=sum+d;
		}
		System.out.println(sum);
		System.out.println(sum1);
		
		int p=0;
		for(k=1;k<=5;k++)
		{
			ld=sum1%10;
			if(ld%2==0)
			{
				
				p=p+ld;
			}
			sum1=sum1/10;
		}
		System.out.println(p);
	}

}
