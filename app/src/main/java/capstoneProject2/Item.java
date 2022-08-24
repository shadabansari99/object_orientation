package capstoneProject2;

import java.util.LinkedList;

public class Item {
    private String itemName;
    private double cost;
    private int quantity;
    private double totalCost;
    public LinkedList<Item> cartItems = new LinkedList<>(); //list for storing the items

    public Item() {

    }

    public Item(String itemNAme, int quantity) {
        this.itemName = itemNAme;
        this.quantity=quantity;

        if (itemNAme.equalsIgnoreCase("Apple"))
            this.cost=140;
        else if (itemNAme.equalsIgnoreCase("Milk")) {
            this.cost=30;
        } else if (itemNAme.equalsIgnoreCase("Newspaper")){
            this.cost = 10;
        }
        totalCost = quantity*cost;

    }

    public String getItemNAme() {
        return itemName;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }
    public void addItem(Item item) //adding items to cart
    {
    cartItems.add(item);
    }

    public void setItemNAme(String itemNAme) {
        this.itemName = itemNAme;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotalCost()
    {
        return totalCost;
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "itemName='" + itemName + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", totalCost=" + totalCost +
                ", "+
                "}";
    }
}
