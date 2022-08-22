package capstoneProject2;

import java.util.LinkedList;

public class MainDriver {
    double totalCost = 0.0;

    public static void main(String[] args) {
        MainDriver t = new MainDriver();
        Cart cart = new Cart();
        Wallet wallet = new Wallet(1000);
        MilkOffer mf = new MilkOffer();
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item("Apple", 140.00));
        items.add(new Item("Milk", 7.00));
        items.add(new Item("Milk", 7.00));
        items.add(new Item("Milk", 7.00));
        items.add(new Item("Milk", 7.00));
        items.add(new Item("Newspaper", 5.00));
        cart.addToCart(items);

        if (wallet.checkWalletBalance()) {
            cart.purchaseAll(wallet);
            mf.milkOffer(items);
        }
        else {
            System.out.println("Wallet has less money add more");
        }
    }

}


