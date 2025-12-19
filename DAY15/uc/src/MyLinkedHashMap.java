public class MyLinkedHashMap<K, V> {

    private MyMapNode<K, V> head;

    // Add or update key-value pair
    public void put(K key, V value) {
        MyMapNode<K, V> node = head;

        // If list is empty, add first node
        if (head == null) {
            head = new MyMapNode<>(key, value);
            return;
        }

        // Search for key
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value; // Update value
                return;
            }
            if (node.next == null) break;
            node = node.next;
        }

        // Key not found, add at end
        node.next = new MyMapNode<>(key, value);
    }

    // Get value by key
    public V get(K key) {
        MyMapNode<K, V> node = head;
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    // Check if key exists
    public boolean containsKey(K key) {
        MyMapNode<K, V> node = head;
        while (node != null) {
            if (node.key.equals(key)) return true;
            node = node.next;
        }
        return false;
    }

    // Print all key-value pairs
    public void printMap() {
        MyMapNode<K, V> node = head;
        while (node != null) {
            System.out.println(node.key + " : " + node.value);
            node = node.next;
        }
    }
}
