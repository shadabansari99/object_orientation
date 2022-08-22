package capstoneProject2;

public class Item {
    private String itemNAme;
    private double cost;

    public Item(String itemNAme, double cost) {
        this.itemNAme = itemNAme;
        this.cost = cost;
    }

    public String getItemNAme() {
        return itemNAme;
    }

    public double getCost() {
        return cost;
    }

    public void setItemNAme(String itemNAme) {
        this.itemNAme = itemNAme;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemNAme='" + itemNAme + '\'' +
                ", cost=" + cost +
                '}';
    }
}
