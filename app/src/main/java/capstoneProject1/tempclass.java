package capstoneProject1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class tempclass {
    private String name;
    private String colour;
    private String type;
    private String size;

    public tempclass(String name, String colour, String type, String size) {
        this.name=name;
        this.colour = colour;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
    public void sortbySize(ArrayList<Fruit> f)
    {
         List<Fruit> smallbowl = new LinkedList<>();
        List<Fruit> mediumbowl = new LinkedList<>();
        List<Fruit> largebowl = new LinkedList<>();
        for(int i=0;i<f.size();i++)
        {
            System.out.println(f.get(i).getSize());
        }

    }

    public static void main(String[] args) {

        List<Fruit> fruits= new LinkedList<>();
        fruits.add(new Fruit("Watermelon","Red","hard","Large"));
        fruits.add(new Fruit("Mango","Yellow","pulpy","Medium"));
        fruits.add(new Fruit("Strawberry", "Pink","soft","Small"));
        fruits.add(new Fruit("Apple","Red","crunchy","Medium"));
        fruits.add(new Fruit("Litchi","White","pulpy","Small"));
        fruits.add(new Fruit("Kiwi", "Green","soft","Small"));
        fruits.add(new Fruit("Banana", "Yellow","soft","Medium"));
        fruits.add(new Fruit("Jackfruit", "Yellow","soft","Large"));


        System.out.println("Fruit bowl contains");
        fruits.forEach(System.out::print);
        List<String> smallbowl = new LinkedList<>();
        List<String> mediumbowl = new LinkedList<>();
        List<String> largebowl = new LinkedList<>();

        for(int i=0;i<fruits.size();i++)
        {
            if(fruits.get(i).getSize().equalsIgnoreCase("Small"))
            {
                smallbowl.add(fruits.get(i).toString());
            }
            if(fruits.get(i).getSize().equalsIgnoreCase("Medium"))
            {
                mediumbowl.add(fruits.get(i).toString());
            }
            if(fruits.get(i).getSize().equalsIgnoreCase("Large"))
            {
                largebowl.add(fruits.get(i).toString());
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


}
