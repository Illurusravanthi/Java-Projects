package hello;
	import java.util.TreeSet;

	public class BookId {
	    public static void main(String[] args) {
	        TreeSet<Integer> bookIds = new TreeSet<>();
	        bookIds.add(5002);
	        bookIds.add(4998);
	        bookIds.add(5005);
	        bookIds.add(4999);
	        bookIds.add(5001);
	        System.out.println("Book IDs: " + bookIds);
	        Integer firstId = bookIds.first();
	        System.out.println("First book ID: " + firstId);
	        Integer lastId = bookIds.last();
	        System.out.println("Last book ID: " + lastId);
	        Integer higherThan4999 = bookIds.higher(4999);
	        System.out.println("Book ID just higher than 4999: " + higherThan4999);
	        Integer lowerThan5005 = bookIds.lower(5005);
	        System.out.println("Book ID just lower than 5005: " + lowerThan5005);
	    }
	}

