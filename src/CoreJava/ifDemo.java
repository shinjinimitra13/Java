package CoreJava;

public class ifDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 85;
		if (marks >= 75) {
			System.out.println("Distinction");
		} else if (marks >= 60 && marks < 75) {
			System.out.println("First Class");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("Second Class");
		} else if (marks >= 40 && marks < 50) {
			System.out.println("Third Class");
		} else {
			System.out.println("Failed");
		}
	}

}