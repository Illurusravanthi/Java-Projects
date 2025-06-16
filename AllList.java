package chitra;
import java.util.*;

//Base class
class CollectionDemo {
 ArrayList<String> arrayList;
 LinkedList<String> linkedList;
 HashSet<String> hashSet;
 HashMap<Integer, String> hashMap;

 // Constructor
 public CollectionDemo() {
     arrayList = new ArrayList<>();
     linkedList = new LinkedList<>();
     hashSet = new HashSet<>();
     hashMap = new HashMap<>();
     System.out.println("Base class constructor: Collections initialized.");
 }

 public void populateCollections() {
     // Populate ArrayList
     arrayList.add("Apple");
     arrayList.add("Banana");

     // Populate LinkedList
     linkedList.add("Cat");
     linkedList.add("Dog");

     // Populate HashSet
     hashSet.add("Red");
     hashSet.add("Blue");
     hashMap.put(1, "One");
     hashMap.put(2, "Two");
 }
 
 public void displayCollections() {
     System.out.println("ArrayList: " + arrayList);
     System.out.println("LinkedList: " + linkedList);
     System.out.println("HashSet: " + hashSet);
     System.out.println("HashMap: " + hashMap);
 }
}
class ExtendedDemo extends CollectionDemo {
 public ExtendedDemo() {
     super();
     System.out.println("Derived class constructor: Ready to use collections.");
 }

 public void addMoreData() {
     arrayList.add("Mango");
     linkedList.add("Elephant");
     hashSet.add("Green");
     hashMap.put(3, "Three");
 }
}
public class AllList{
 public static void main(String[] args) {
     ExtendedDemo demo = new ExtendedDemo();
     demo.populateCollections();
     demo.addMoreData();
     demo.displayCollections();
 }
}
