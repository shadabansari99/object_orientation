package capstoneProject2;

import java.util.LinkedList;

public class MilkOffer {
    public int milkOffer(LinkedList<Item> lm) {
        int count = 0;
        int totalCount = 0;

        for (Item item : lm) {

            if (item.getItemNAme().equalsIgnoreCase("Milk")) {
                count = item.getQuantity();
                if (count == 2) {
                    totalCount = count + 1;
                } else if (count > 2) {
                    totalCount = count + (count / 2);
                } else {
                    totalCount = totalCount + (count / 2);
               }
              }
            }

        return totalCount;

    }
}
