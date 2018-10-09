package CoreJava;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 8;
		switch (month) {
		case 1:
			System.out.println("31 days");
			break;
		case 2:
			System.out.println("28/29 Days");
			break;
		case 3:
			System.out.println("31 Days");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
