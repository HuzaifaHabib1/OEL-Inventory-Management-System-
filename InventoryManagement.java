public class InventoryManagement {
    private PriorityQueue<InventoryItem> pq = new PriorityQueue<>();

    public void addItem(int id, String name, int priority) {
        pq.insert(new InventoryItem(id, name, priority));
    }

    public void removeItem() {
        System.out.println("Removed: " + pq.deleteMin());
    }

    public void viewNextItem() {
        System.out.println("Next item: " + pq.peekMin());
    }

    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();
        im.addItem(1, "Apples", 5);
        im.addItem(2, "Bananas", 2);
        im.addItem(3, "Cherries", 8);

        im.viewNextItem();
        im.removeItem();
        im.viewNextItem();
    }
}