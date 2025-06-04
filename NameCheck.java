package hello;

import java.util.ArrayList;

public class NameCheck {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String searchName = "Bob";

        if (names.contains(searchName)) {
            System.out.println(searchName + " exists in the list.");
        } else {
            System.out.println(searchName + " does not exist in the list.");
        }
    }
}
