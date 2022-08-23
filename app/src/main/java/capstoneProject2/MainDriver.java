package capstoneProject2;

import java.util.LinkedList;

public class MainDriver {
    public static void main(String[] args) {
        MainDriver t = new MainDriver();
        Cart cart = new Cart();
        Wallet wallet = new Wallet(1000);
        MilkOffer mf = new MilkOffer();
        Item i = new Item();
        i.addItem(new Item("Apple", 1));
        i.addItem(new Item("Newspaper", 1));
        i.addItem(new Item("Milk", 1));
        cart.addToCart(i.cartItems);
        cart.displayCart();
        if (wallet.checkWalletBalance()) {
            cart.purchaseAll(wallet);

            int totalMilk = mf.milkOffer(i.cartItems);
            if (totalMilk > 1) {
                System.out.println("You got buy 2 get 1 free offer on milk");
                System.out.printf("You will get total %d milk packets", totalMilk);
            } else {
                System.out.println("No Milk Offer");
            }
        }
        else
        {
            System.out.println("Can't purchase items. Add more money in Wallet");
        }
    }
}




