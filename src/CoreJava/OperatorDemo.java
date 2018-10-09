package CoreJava;

public class OperatorDemo {

	public static void main1(String[] args) {
		int i=120,j=250;
		int k=i+j;
		System.out.println(k);
		System.out.println(++k);
		System.out.println(k++);
		System.out.println(--k);
		System.out.println(k--);
		
	}
	public static void main(String[] args) {
		int i,j,k;
		i=5;j=6;k=7;
		int a=i++ + ++j + ++k + k++ + ++i + j++;
		System.out.print(a);
	}

}
