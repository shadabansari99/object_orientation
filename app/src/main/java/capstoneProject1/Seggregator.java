package capstoneProject1;

import java.util.LinkedList;
import java.util.List;

public class Seggregator {


    public void segregationBySize(LinkedList<Fruit> List1) //Seggregation by size
    {
        System.out.println("Fruit bowl contains");
        List1.forEach(System.out::print);
        List<String> smallbowl = new LinkedList<>();
        List<String> mediumbowl = new LinkedList<>();
        List<String> largebowl = new LinkedList<>();

        for (Fruit fruit : List1) {
            if (fruit.getSize().equalsIgnoreCase("Small")) {
                smallbowl.add(fruit.toString());
            }
            if (fruit.getSize().equalsIgnoreCase("Medium")) {
                mediumbowl.add(fruit.toString());
            }
            if (fruit.getSize().equalsIgnoreCase("Large")) {
                largebowl.add(fruit.toString());
            }
        }
        System.out.println("\n");
        System.out.println("Small bowl contains");
        System.out.println(smallbowl);
        System.out.println("\nMedium bowl contains");
        System.out.println(mediumbowl);
        System.out.println("\nLarge bowl contains");
        System.out.println(largebowl);
    }
    public void segregationByColor(LinkedList<Fruit> List2) //Seggregation by color
    {
        List<String> redcolour = new LinkedList<>();
        List<String> greencolour = new LinkedList<>();
        List<String> yellowcolour = new LinkedList<>();
        for (Fruit fruit : List2) {
            if (fruit.getColour().equalsIgnoreCase("Red")) {
                redcolour.add(fruit.toString());
            }
            if (fruit.getColour().equalsIgnoreCase("Green")) {
                greencolour.add(fruit.toString());
            }
            if (fruit.getColour().equalsIgnoreCase("Yellow")) {
                yellowcolour.add(fruit.toString());
            }

        }
        System.out.println("\n");
        System.out.println("Red colour bowl contains");
        System.out.println(redcolour);
        System.out.println("\n Green bowl contains");
        System.out.println(greencolour);
        System.out.println("\n Yellow bowl contains");
        System.out.println(yellowcolour);
    }
        public void segregationByType(LinkedList<Fruit> List3) //Seggregation by Type
        {
            List<String> crunchyBowl = new LinkedList<>();
            List<String> pulpyBowl = new LinkedList<>();
            List<String> softBowl = new LinkedList<>();
            for (Fruit fruit : List3) {
                if (fruit.getType().equalsIgnoreCase("Crunchy")) {
                    crunchyBowl.add(fruit.toString());
                }
                if (fruit.getType().equalsIgnoreCase("Pulpy")) {
                    pulpyBowl.add(fruit.toString());
                }
                if (fruit.getType().equalsIgnoreCase("Soft")) {
                    softBowl.add(fruit.toString());
                }
            }
            System.out.println("\n");
            System.out.println("Crunchy bowl contains");
            System.out.println(crunchyBowl);
            System.out.println("\n Pulpy bowl contains");
            System.out.println(pulpyBowl);
            System.out.println("\n Soft bowl contains");
            System.out.println(softBowl);
        }

}
