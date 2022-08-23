package capstoneProject2;

import java.util.LinkedList;

public class MainDriver {
   // double totalCost = 0.0;

    public static void main(String[] args) {
        MainDriver t = new MainDriver();
        Cart cart = new Cart();
        Wallet wallet = new Wallet(1000);
        MilkOffer mf = new MilkOffer();
        LinkedList<Item> items = new LinkedList<>();
        items.add(new Item("Apple", 14.00));
        items.add(new Item("Milk", 7.00));
        items.add(new Item("Milk", 7.00));
        items.add(new Item("Milk", 7.00));
        items.add(new Item("Milk", 7.00));
        items.add(new Item("Newspaper", 5.00));
        cart.addToCart(items);

        if (wallet.checkWalletBalance()) {
            cart.purchaseAll(items,wallet);

        int totalMilk=mf.milkOffer(items);
        if(totalMilk>1){
                 System.out.println("You got buy 2 get 1 free offer on milk");
                 System.out.printf("You will get total %d milk packets",totalMilk);
            }
        }
        else {
            System.out.println("Can't purchase items. Add more money in Wallet");
        }
    }

}


