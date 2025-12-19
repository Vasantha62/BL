class MyHashMap<K, V> {

    private final int SIZE = 10;
    private MyLinkedList<K, V>[] table;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        table = new MyLinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new MyLinkedList<>();
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key) {
        int index = getIndex(key);
        Node<K, V> node = table[index].search(key);

        if (node == null) {
            table[index].add(key, (V) (Integer) 1);
        } else {
            node.value = (V) (Integer) ((Integer) node.value + 1);
        }
    }

    // REMOVE WORD FROM HASH TABLE
    public void remove(K key) {
        int index = getIndex(key);
        table[index].remove(key);
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            table[i].display();
        }
    }
}
