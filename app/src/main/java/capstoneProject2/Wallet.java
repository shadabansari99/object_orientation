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

    public boolean checkWalletBalance() {  //to check the wallet balance is more than cart balance or not
        Cart c = new Cart();
        if ( walletBalance >=c.totalCost ) //the user can buy the products
        {
            System.out.println("Total cost of cart Items: "+c.totalCost);
            System.out.println("Your wallet balance: " + walletBalance);
            return true;
        }
        System.out.println("Your wallet balance: " + walletBalance);
        return false; //returns false the user can't but the items
    }
}
