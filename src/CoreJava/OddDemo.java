package CoreJava;

public class OddDemo {

	public static void main(String[] args) {
		int i,c=0;;
		 for( i =1;i<=50;i++){
			 c=0;
			 for(int j=2;j<=i/2;j++)
			 {
				 if(i%j==0)
				 {
					 c++;
				 }
			 
		 }
		 if(c==0)
			 System.out.println(i);
		 }
	}

	
	   
	}


