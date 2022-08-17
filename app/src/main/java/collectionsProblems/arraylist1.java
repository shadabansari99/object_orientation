package collectionsProblems;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//public class arraylist1 {

//    public static void main(String[] args) {
//
//
//        ArrayList<String> alphabets = new ArrayList();
//        alphabets.add(0, "A");
//        alphabets.add(1,"D");
//        alphabets.add(2,"C");
//        alphabets.add(1,"B");
//        alphabets.remove(3);
//        alphabets.remove("B");
//        //alphabets.replaceAll((alphabet));
//        System.out.println(alphabets.get(1));
////        Assert.assertEquals(alphabets.get(0), "Shadab");

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

        public class arraylist1 {

            public static void main(String args[]) {
                ArrayList<String> alphabets = new ArrayList<>(5);
                alphabets.add("A");
                alphabets.add("B");
                alphabets.add("C");
                alphabets.add("D");

                Iterator<String> itr = alphabets.iterator();

                while(itr.hasNext()) {
                    System.out.print(itr.next());
                }

                System.out.println();
                System.out.println("----");
                Iterator<String> newItr = alphabets.iterator();
                newItr.forEachRemaining(alphabet -> System.out.print(alphabet));
            }
        }


