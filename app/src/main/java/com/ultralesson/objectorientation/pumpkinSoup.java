package com.ultralesson.objectorientation;

public class pumpkinSoup {

    public pumpkinSoup() {
        System.out.println("\nHeating pan over low flame");
    }

    public pumpkinSoup addOil(String oil) {
        System.out.println("Adding " + oil + " to the pan");
        return this;
    }

    public pumpkinSoup addOnionAndLeek(String onion, String leek, int time) {
        System.out.println("Adding " + onion + " & " + leek + " to the pan and cooking for " + time + " minutes");
        return this;
    }


    public pumpkinSoup addGarlicAndSpice(String garlic, String spice, int time) {
        System.out.println("Adding " + garlic + " & " + spice + " " + "and stirring for " + time + " seconds");
        return this;
    }

    public pumpkinSoup addPumpkinAndPotato()
    {
        System.out.println("Adding Pumpkin,Potato and stock and boiling");
        return this;
    }

    public pumpkinSoup simmerSoup(int time)
    {
        System.out.println("Low heating and cover the pan for "+time+ " minutes");
        return this;
    }

    public pumpkinSoup coolingSoup()
    {
        System.out.println("Cooling soup and then blending in batches");
        return this;
    }

    public pumpkinSoup reheatingPan()
    {
        System.out.println("Stir through cream and reheat gently");
        return this;
    }
    public pumpkinSoup serve() {
        System.out.println("Serving Soup");
        return this;
    }

    public static void main(String[] args) {
        pumpkinSoup ps = new pumpkinSoup();
        ps.addOil("Refined Oil")
                .addOnionAndLeek("Onion", "Leek", 3)
                .addGarlicAndSpice("Garlic", "spices", 30)
                .addPumpkinAndPotato()
                .simmerSoup(30)
                .coolingSoup()
                .reheatingPan()
                .serve();
    }
}
