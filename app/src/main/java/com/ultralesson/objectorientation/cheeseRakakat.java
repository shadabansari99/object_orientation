package com.ultralesson.objectorientation;

public class cheeseRakakat {

    public cheeseRakakat()
    {
        System.out.println("\nTake a bowl");
    }
    public cheeseRakakat addingIngredients(String cheese,String oregano,String seeds, String leaves)
    {
        System.out.printf("Adding %s cheese %s %s and %s and mix it in a bowl\n",cheese,oregano,seeds,leaves);
        return this;
    }
    public cheeseRakakat makeRollSheets()
    {
        System.out.println("Spread an adequate amount of filling on the sheet,roll it over to formalog and seal the edges using some water.Repeat the same for all spring roll sheets");
        return this;
    }
    public cheeseRakakat heatOil()
    {
        System.out.println("Heat the oil on medium flame in a deep pot or pan and deep fry the prepared cheese rolls until golden.");
        return this;
    }
    public cheeseRakakat takeOutRolls()
    {
        System.out.println("Take them out on a paper towel");
        return this;
    }
    public cheeseRakakat serve()
    {
        System.out.println("Serve the Cheese Rolls with ketchup,mayo or any other dip of your choice.Enjoy!");
        return this;
    }

    public static void main(String[] args) {
        cheeseRakakat cr = new cheeseRakakat();
        cr.addingIngredients("mozarella","oregano","toasted sesame seeds","coriander")
                .makeRollSheets()
                .heatOil()
                .takeOutRolls()
                .serve();
    }
}
