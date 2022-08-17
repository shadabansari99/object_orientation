package collectionsProblems;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class StudentmarksEligibility {

    public static void main(String args[]) {


        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getMarks().compareTo(o2.getMarks());
            }
        });
        //TreeSet<Student> students = new TreeSet<>();

        students.add(new Student("Barrett Lee", 62));
        students.add(new Student("Matthew Moore", 29));
        students.add(new Student("Nellie Mcgrath", 18));
        students.add(new Student("Jerrod Blair", 59));
        students.add(new Student("Jack Mccoy", 70));
        students.add(new Student("Andy Farrell", 60));

        // Use tailSet to find all students with marks 35 or above. A sorted set by marks.
        SortedSet<Student> Ulist = students.tailSet(new Student(35));
//        System.out.println(name);
        Ulist.forEach(System.out::println);
//        System.out.println(students);
    }

    private static class Student {
        private String name;
        private Integer marks;

        public Student(Integer marks) {
            this.marks = marks;
        }

        public Student(String name, Integer marks) {
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getMarks() {
            return marks;
        }

        public void setMarks(Integer marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }

//        @Override
//        public int compareTo(Object o) {
//            Student s = (Student) o;
//            Integer i1 = this.getMarks();
//            Integer i2 = s.getMarks();
//
//            if (i1 > i2)
//                return 1;
//            else
//                return -1;
//        }
    }
}
