class Item {
    static int objectCount = 0;
    String itemName;

    // Constructor
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }

    // Method to display the item
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

    // Static method to display object count
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Display the total count of objects created
        Item.displayObjectCount();
    }
}
