package hello;
import java.util.ArrayList;
public class RemoveByIndex {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original List: " + list);

        // Remove element at index 1 ("Banana")
        String removedElement = list.remove(1);

        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated List: " + list);
    }
}

