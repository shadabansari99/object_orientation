package collectionsProblems;

import org.checkerframework.checker.interning.qual.CompareToMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.List;
import java.util.Comparator;

public class StudentList{

    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Beth", 7, 4));
        students.add(new Student("Andy", 9, 6));
        students.add(new Student("Dev", 8, 5));
        students.add(new Student("Cindy", 12, 8));
        students.add(new Student("Earg", 9, 6));
        students.add(new Student("Cindy", 12, 6));

        ListIterator<Student> listIterator = students.listIterator();
        System.out.println("Names of students ABOVE AGE 8 \n ---------------");
        for(int i=0;i<students.size();i++) {
            if (students.get(i).age > 8) {
                System.out.println(students.get(i).name);
            }
        }
        System.out.println("Names of students studying in class 6 \n ---------------");
            for(int j=0;j<students.size();j++) {
                if (students.get(j).classNo == 6) {
                    System.out.println(students.get(j).name);
                }
            }
        System.out.println("\nsorting by age");

            Collections.sort(students, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getAge().compareTo(o2.getAge());
                }
            });
        System.out.println("\n"+students);
        System.out.println("\nsorting by name");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\n"+students);
        System.out.println("\nsorting by class");

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getClassNo().compareTo(o2.getClassNo());
            }
        });



//            Collections.sort(students,Comparator.comparing(Student::getAge)
//                    .thenComparing(Student::getName)
//                    .thenComparing(Student::getClassNo));


        System.out.println("\n"+students);
        }



    private static class Student  {
        private String name;
        private int age;
        private int classNo;

        public Student(String name, int age, int classNo) {
            this.name = name;
            this.age = age;
            this.classNo = classNo;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Integer getClassNo() {
            return classNo;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public void setClassNo(Integer classNo) {
            this.classNo = classNo;
        }

        @Override
        public String toString() {
            return "\n Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", classNo=" + classNo +
                    '}';
        }
    }
}
