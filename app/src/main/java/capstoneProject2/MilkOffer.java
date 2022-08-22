package capstoneProject2;

import java.util.LinkedList;

public class MilkOffer {
    public void milkOffer(LinkedList<Item> lm) {
        int count = 0;
        int totalCount=0;

        for (Item item : lm) {
            //System.out.println(lm.get(i).getItemNAme());

            if (item.getItemNAme().equalsIgnoreCase("Milk")) {
                count++;
            }
            if (count == 2) {
                totalCount = count + 1;
            } else if (count > 2) {
                totalCount = count + (count / 2);
            } else {
                totalCount = totalCount + (count / 2);
            }
        }
        System.out.println("You got buy 2 get 1 free offer on milk");

        System.out.println(totalCount);
    }
}
