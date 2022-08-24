package capstoneProject2;

import java.util.LinkedList;

public class MilkOffer {
    public int milkOffer(LinkedList<Item> lm) {
        int count = 0;
        int totalCount = 0;

        for (Item item : lm) {

            if (item.getItemNAme().equalsIgnoreCase("Milk")) {
                count = item.getQuantity();
                if (count == 2) {   // updation of 2 milk packets
                    totalCount = count + 1;
                } else if (count > 2) { // updation of 3 milk packets
                    totalCount = count + (count / 2);
                } else {          // updation of more than 2 milk packets
                    totalCount = totalCount + (count / 2);
               }
              }
            }

        return totalCount;  //returning total number of packets

    }
}
