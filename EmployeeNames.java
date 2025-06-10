package hello;
	import java.util.Comparator;
	import java.util.TreeSet;

	public class EmployeeNames {
	    public static void main(String[] args) {
	        TreeSet<String> employeeNames = new TreeSet<>(new Comparator<String>() {
	            public int compare(String name1, String name2) {
	                return name2.compareTo(name1);
	            }
	        });
	        employeeNames.add("manu");
	        employeeNames.add("sravs");
	        employeeNames.add("chitra");
	        employeeNames.add("ravi");
	        System.out.println("Employee Names in Reverse Alphabetical Order:");
	        for (String name : employeeNames) {
	            System.out.println(name);
	        }
	    }
	}

