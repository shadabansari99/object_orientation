package capstoneProject1;

public class Fruit {
    private String name;
    private String colour;
    private String type;
    private String size;

    public Fruit(String name, String colour, String type, String size) {
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
        return "\n"+"Fruit{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
