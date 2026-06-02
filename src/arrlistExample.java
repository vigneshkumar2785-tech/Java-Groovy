//import java.util.*;
//public class arrlistExample {
//    public static void main(String[] args) {
//        ArrayList<Object> a = new ArrayList<>();
//        ArrayList<Object> b = new ArrayList<>();
//        a.add(13);
//        a.add("hai");
//        a.add(true);
//        a.add("Welcome");
//        a.add(29);
//        a.add(78);
//        for(int i=0;i <a.size() ;i++)
//        {
//            Object element = a.get(i);
//            if (element instanceof Integer) {
//                System.out.println(element);
//            }
//        }
//    }
//}
//
//
//import java.util.ArrayList;
//import java.util.HashSet;
//
//public class arrlistExample {
//    public static void main(String[] args) {
//        // First ArrayList
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//
//        // Second ArrayList
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(20);
//        list2.add(30);
//        list2.add(40);
//        list2.add(50);
//
//        // Merge using HashSet to remove duplicates
//        HashSet<Integer> mergedSet = new HashSet<>(list1);
//        mergedSet.addAll(list2);
//
//        // Convert back to ArrayList if needed
//        ArrayList<Integer> mergedList = new ArrayList<>(mergedSet);
//
//        // Display result
//        System.out.println("Merged ArrayList without duplicates: " + mergedList);
//    }
//}
//
