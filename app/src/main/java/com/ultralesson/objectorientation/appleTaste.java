package com.ultralesson.objectorientation;

public class appleTaste {
    public String colour;
    public String variety;
    public int sweetness;

    public appleTaste(String colour, String variety, int sweetness) {
        this.colour = colour;
        this.variety = variety;
        this.sweetness = sweetness;
    }

    @Override
    public String toString() {
        return "appleTaste{" +
                "colour='" + colour + '\'' +
                ", variety='" + variety + '\'' +
                ", sweetness=" + sweetness +
                '}';
    }

    public static void main(String[] args) {
        appleTaste at1 = new appleTaste("green","Granny smith",0);
        appleTaste at2 = new appleTaste("yellow","Jazz",3);
        appleTaste at3 = new appleTaste("pink","Honey crisp",5);
        appleTaste at4 = new appleTaste("yellow","Jonagold",7);
        appleTaste at5 = new appleTaste("red","Fuji",10);
        System.out.println("\n 0 means tart & 10 means sweet");
        System.out.println("\n"+at1);
        System.out.println(at2);
        System.out.println(at3);
        System.out.println(at4);
        System.out.println(at5);
    }
}
