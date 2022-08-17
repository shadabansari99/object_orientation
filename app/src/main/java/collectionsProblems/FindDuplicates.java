package collectionsProblems;
import java.util.*;
public class FindDuplicates {
    public static void main(String args[]) {
        int[] numbers = {1, 55, 666, 43434, 11212, 11323, 55, 22, 33, 546, 64342, 232, 5432, 2444, 113, 333, 666, 4533, 232};
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if(numbers[i]==numbers[j])
//                    System.out.println(numbers[j]);

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int number : numbers) {
            if (!treeSet.add(number)) { // Treeset does not allow duplicate elements. Add function returns false if element is duplicate
                System.out.println("Duplicate Element : " + number);
            }

        }
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        boolean b = set.add(1);
        System.out.println(b); //prints false

        TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.add(5);
        reverseSet.add(2);
        reverseSet.add(3);
        reverseSet.add(6);
        reverseSet.add(1);
        System.out.println(reverseSet);
        System.out.println(reverseSet.subSet(5,1));
        System.out.println(reverseSet.headSet(3));
        System.out.println(reverseSet.tailSet(3));

    }
}
