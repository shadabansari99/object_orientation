package capstoneProject2;

import java.util.LinkedList;

public class MainDriver {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Wallet wallet = new Wallet(1000);
        MilkOffer mf = new MilkOffer();
        Item i = new Item();
        i.addItem(new Item("Apple", 1));
        i.addItem(new Item("Newspaper", 1));
        i.addItem(new Item("Milk", 4));
        cart.addToCart(i.cartItems);
        cart.displayCart();

        if (wallet.checkWalletBalance()) {  // checking eligibility to buy
            cart.purchaseAll(wallet); // purchasing the items in cart using the wallet
            cart.clearCart();           //clearing cart after purchasing

            int totalMilk = mf.milkOffer(i.cartItems);
            if (totalMilk > 1) {  //appling milk offer
                System.out.println("You got buy 2 get 1 free offer on milk");
                System.out.printf("You will get total %d milk packets", totalMilk);
            } else {            //no milk offer on milk packets less than 1
                System.out.println("No Milk Offer");
            }
        }
        else
        {   // if wallet has less money than cart total
            System.out.println("Can't purchase items. Add more money in Wallet");
        }
    }
}




