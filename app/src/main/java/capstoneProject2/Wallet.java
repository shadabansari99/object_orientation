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
        if ( walletBalance >=Cart.totalCost ) {
            System.out.println("your wallet balance: " + walletBalance);

            return true;
        }
        return false;
    }
}
