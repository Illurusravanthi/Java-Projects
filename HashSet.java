package hello;
public class HashSet {

	public static void main(String[] args) {
		HashSet<String,Integer> std= new HashSet<String,Integer>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name 5 students");
		for(int i=1;i<=5;i++) {
			System.out.println("Enter name of students "+i+"");
			String name= s.nextLine();
			std.add(name);
		}
		System.out.println("Students name are:");
		for(String stds:std) {
			System.out.println(std);
		}
	}
}