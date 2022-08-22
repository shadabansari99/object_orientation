package capstoneProject1;

import java.util.LinkedList;
import java.util.List;

public class MultilayerBowl {

    public void segregationBySize(LinkedList<Fruit> t1)
    {

        System.out.println("Fruit bowl contains");
        t1.forEach(System.out::print);
        List<String> smallbowl = new LinkedList<>();
        List<String> mediumbowl = new LinkedList<>();
        List<String> largebowl = new LinkedList<>();

        for (Fruit fruit : t1) {
            if (fruit.getSize().equalsIgnoreCase("Small")) {
                smallbowl.add(fruit.toString());
            }
            if (fruit.getSize().equalsIgnoreCase("Medium")) {
                mediumbowl.add(fruit.toString());
            }
            if (fruit.getSize().equalsIgnoreCase("Large")) {
                largebowl.add(fruit.toString());
            }
            //fruits.get(i).getName()+" " +fruits.get(i).getSize()

        }
        System.out.println("\n");
        System.out.println("Small bowl contains");
        System.out.println(smallbowl);
        System.out.println("\nMedium bowl contains");
        System.out.println(mediumbowl);
        System.out.println("\nLarge bowl contains");
        System.out.println(largebowl);
    }
    public void segregationByColor(LinkedList<Fruit> t2) {
        List<String> redcolour = new LinkedList<>();
        List<String> greencolour = new LinkedList<>();
        List<String> yellowcolour = new LinkedList<>();
        for (Fruit fruit : t2) {
            if (fruit.getColour().equalsIgnoreCase("Red")) {
                redcolour.add(fruit.toString());
            }
            if (fruit.getColour().equalsIgnoreCase("Green")) {
                greencolour.add(fruit.toString());
            }
            if (fruit.getColour().equalsIgnoreCase("Yellow")) {
                yellowcolour.add(fruit.toString());
            }
            //fruits.get(i).getName()+" " +fruits.get(i).getSize()

        }
        System.out.println("\n");
        System.out.println("Red colour bowl contains");
        System.out.println(redcolour);
        System.out.println("\n Redcolour bowl contains");
        System.out.println(greencolour);
        System.out.println("\n Yellow bowl contains");
        System.out.println(yellowcolour);
    }
        public void segregationByType(LinkedList<Fruit> t3) {
            List<String> crunchy = new LinkedList<>();
            List<String> pulpy = new LinkedList<>();
            List<String> soft = new LinkedList<>();
            for (Fruit fruit : t3) {
                if (fruit.getType().equalsIgnoreCase("Crunchy")) {
                    crunchy.add(fruit.toString());
                }
                if (fruit.getType().equalsIgnoreCase("Pulpy")) {
                    pulpy.add(fruit.toString());
                }
                if (fruit.getType().equalsIgnoreCase("Soft")) {
                    soft.add(fruit.toString());
                }
                //fruits.get(i).getName()+" " +fruits.get(i).getSize()

            }
            System.out.println("\n");
            System.out.println("Crunchy contains");
            System.out.println(crunchy);
            System.out.println("\n Pulpy contains");
            System.out.println(pulpy);
            System.out.println("\n Soft contains");
            System.out.println(soft);
        }

}
