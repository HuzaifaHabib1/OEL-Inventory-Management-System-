import java.util.*;

class InventoryItem {
    private int id;
    private String name;
    private int priority; // Lower value = higher priority

    public InventoryItem(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Item ID: " + id + ", Name: " + name + ", Priority: " + priority;
    }
}

class PriorityQueue<T extends InventoryItem> {
    private List<T> heap = new ArrayList<>();

    public void insert(T item) {
        heap.add(item);
        int current = heap.size() - 1;
        while (current > 0) {
            int parent = (current - 1) / 2;
            if (heap.get(current).getPriority() >= heap.get(parent).getPriority()) {
                break;
            }
            Collections.swap(heap, current, parent);
            current = parent;
        }
    }

    public T deleteMin() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        T min = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        heapify(0);
        return min;
    }

    public T peekMin() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        return heap.get(0);
    }

    private void heapify(int index) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() && heap.get(left).getPriority() < heap.get(smallest).getPriority()) {
            smallest = left;
        }
        if (right < heap.size() && heap.get(right).getPriority() < heap.get(smallest).getPriority()) {
            smallest = right;
        }
        if (smallest != index) {
            Collections.swap(heap, index, smallest);
            heapify(smallest);
        }
    }
}

