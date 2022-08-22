package capstoneProject2;

import java.util.LinkedList;
import java.util.List;

public class Cart {
    static double totalCost = 0.0;


    public void addToCart(LinkedList<Item> li) {

//        List<String> cartItems = new LinkedList<>();

        for (Item item : li) {
            totalCost = totalCost + item.getCost();
            System.out.println(item);
        }

        System.out.println("Total cost of the cart: " + totalCost);

    }
    public void purchaseAll(Wallet wallet) {
        if (totalCost >= 100) {
            System.out.println("Yayy! Yo got offer of 5% ");
            totalCost = totalCost - (totalCost * 5 / 100);
            System.out.println("You paid: " + totalCost);
            wallet.setWalletBalance(wallet.walletBalance - totalCost);
            System.out.println("Remaining amount in wallet : " + wallet.getWalletBalance());
        }
    }
}
