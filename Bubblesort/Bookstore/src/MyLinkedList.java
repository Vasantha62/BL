class MyLinkedList<K, V> {
    Node<K, V> head;

    public void add(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<K, V> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public Node<K, V> search(K key) {
        Node<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void display() {
        Node<K, V> current = head;
        while (current != null) {
            System.out.println(current.key + " : " + current.value);
            current = current.next;
        }
    }
}
