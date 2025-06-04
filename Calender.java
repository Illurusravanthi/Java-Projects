package hello;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "Monday":
			System.out.println("lets learn python");
			break;
		case "tuesday":
			System.out.println("lets learn java");
			break;
		case "wednesday":
			System.out.println("lets learn c++");
			break;
		case "thursday":
			System.out.println("lets learn c");
			break;
		case "friday":
			System.out.println("lets learn sql");
			break;
		case "saturday":
			System.out.println("lets learn html");
			break;
			default:
				System.out.println("invalid dar enterd");
		}
		sc.close();
	}
}


