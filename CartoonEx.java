package hello;
	import java.util.ArrayList;
	import java.util.Collections;

	public class CartoonEx {
	    public static void main(String[] args) {
	        ArrayList<String> characters = new ArrayList<>();
	        characters.add("Tom");
	        characters.add("Jerry");
	        characters.add("Mickey");
	        characters.add("Donald");
	        characters.add("Goofy");
	        characters.remove("Donald");
	        int indexToReplace = characters.indexOf("Goofy");
	        if (indexToReplace != -1) {
	            characters.set(indexToReplace, "Bugs"); // Replaces "Goofy" with "Bugs"
	        }
	        System.out.println("Cartoon Characters:");
	        for (String name : characters) {
	            System.out.println(name);
	        }

	        // Step 6: Sort the list alphabetically
	        Collections.sort(characters);

	        // Step 7: Print the sorted list
	        System.out.println("\nSorted Cartoon Characters:");
	        for (String name : characters) {
	            System.out.println(name);
	        }
	    }
	}
