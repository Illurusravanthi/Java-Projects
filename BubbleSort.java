package hello;

public class BubbleSort {
	    public static void main(String[] args) {
	        String[] names = {"Ravi", "Anita", "Zara", "Kiran", "Bhanu"};

	        int n = names.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
	                    // Swap names[j] and names[j + 1]
	                    String temp = names[j];
	                    names[j] = names[j + 1];
	                    names[j + 1] = temp;
	                }
	            }
	        }

	        System.out.println("Sorted Student Names:");
	        for (String name : names) {
	            System.out.println(name);
	        }
	    }
	}
