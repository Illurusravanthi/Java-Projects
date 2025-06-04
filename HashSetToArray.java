package hello;

import java.util.HashSet;
import java.util.ArrayList;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Convert HashSet to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(hashSet);

        System.out.println("ArrayList: " + arrayList);
    }
}
