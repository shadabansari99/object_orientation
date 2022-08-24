package capstoneProject1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Fruitbowl {

    public static void main(String[] args) {
        LinkedList<Fruit> fruits= new LinkedList<>();
        fruits.add(new Fruit("Watermelon","Red","soft","Large"));
        fruits.add(new Fruit("Mango","Yellow","pulpy","Medium"));
        fruits.add(new Fruit("Strawberry", "Red","pulpy","Small"));
        fruits.add(new Fruit("Apple","Red","crunchy","Medium"));
        fruits.add(new Fruit("Litchi","Red","pulpy","Small"));
        fruits.add(new Fruit("Kiwi", "Green","soft","Small"));
        fruits.add(new Fruit("Banana", "Yellow","soft","Medium"));
        fruits.add(new Fruit("Jackfruit", "Yellow","soft","Large"));
        fruits.add(new Fruit("Avocado", "Green","soft","Medium"));

        Seggregator m=new Seggregator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one number \n 1.Segregate by size \n 2.Segregate by color \n 3.Segregate by type");
        switch (sc.nextInt()) {
            case 1:
                m.segregationBySize(fruits);
                break;
            case 2:
                m.segregationByColor(fruits);
                break;
            case 3:
                m.segregationByType(fruits);
                break;
            default:
                exit(0);
        }
    }
}
