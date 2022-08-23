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
        if ( walletBalance >=Cart.totalCost ) //the user can buy the products
        {
            System.out.println("Your wallet balance: " + walletBalance);
            return true;
        }
        System.out.println("Your wallet balance: " + walletBalance);
        return false; //else he cant buy the items
    }
}
