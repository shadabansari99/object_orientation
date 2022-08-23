package capstoneProject2;

import java.util.LinkedList;

public class Cart {
    static double totalCost = 0.0;
    public LinkedList<Item> cartItems = new LinkedList<>();


    public void addToCart(LinkedList<Item> li) {

        for (Item item : li) {
            totalCost = totalCost + item.getTotalCost();
            cartItems.add(item);
        }
        System.out.println("Total cost of the cart: " + totalCost);

    }
    public void displayCart()
    {
        System.out.println("All items in cart are");
        System.out.println("---------------------");
        for(Item item: cartItems)
        {
            System.out.println(item.getItemNAme()+"\t"+item.getQuantity()+"\t"+item.getTotalCost());
        }
        System.out.println("---------------------");
    }
    public void purchaseAll(Wallet wallet) {
        if (totalCost >= 100) {
            System.out.println("---------------------");
            System.out.println("Purchased successfully");
            System.out.println("Yayy! You got offer of 5% DISCOUNT");
            totalCost = totalCost - (totalCost * 5 / 100);
            System.out.println("You paid: " + totalCost);
            wallet.setWalletBalance(wallet.walletBalance - totalCost);
            System.out.println("Remaining amount in wallet : " + wallet.getWalletBalance());
            System.out.println("---------------------");

        }
        else {
            System.out.println("---------------------");
            System.out.println("Purchased successfully");
            System.out.println("You paid: " + totalCost);
            wallet.setWalletBalance(wallet.walletBalance - totalCost);
            System.out.println("Remaining amount in wallet : " + wallet.getWalletBalance());
            System.out.println("---------------------");


        }
    }
}
