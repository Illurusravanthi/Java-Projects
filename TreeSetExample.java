package hello;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers=new TreeSet<Integer>();
		numbers.add(10);
		numbers.add(40);
		numbers.add(20);
		numbers.add(160);
		numbers.add(180);
		System.out.println(numbers);
		System.out.println(numbers.first());
		System.out.println(numbers.higher(30));


	}

}
