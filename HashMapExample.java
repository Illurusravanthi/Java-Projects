package hello;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"manasa");
		hm.put(2,"sravs");
		hm.put(3,"chitra");
		hm.put(4,"sravanthi");
		hm.put(5,"manu");
		System.out.println(hm);
		hm.remove(2);
		System.out.println(hm);
		hm.put(4,"sravs");
		System.out.println(hm);
		if (hm.containsKey(1)) {
            System.out.println(1 + " exists in the list.");
        } else {
            System.out.println(1 + " does not exist in the list.");
        }
	}

}
