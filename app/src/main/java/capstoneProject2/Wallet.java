package capstoneProject2;

public class Wallet {
    public double walletBalance;

    public Wallet(double wallet) {
        this.walletBalance = wallet;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public boolean checkWalletBalance() {
        Cart c = new Cart();
        if ( walletBalance >=c.totalCost ) //the user can buy the products
        {
            System.out.println("Total cost of cart Items: "+c.totalCost);
            System.out.println("Your wallet balance: " + walletBalance);
            return true;
        }
        System.out.println("Your wallet balance: " + walletBalance);
        return false; //else he cant buy the items
    }
}
