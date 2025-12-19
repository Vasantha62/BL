public class LinkedList<T extends Comparable<T>> {

    Node<T> head;
    Node<T> tail;

    // Add at beginning
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Append at end
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert after given node
    public void insertAfter(Node<T> node, T data) {
        if (node == null) return;

        Node<T> newNode = new Node<>(data);
        newNode.next = node.next;
        node.next = newNode;

        if (node == tail) {
            tail = newNode;
        }
    }

    // Delete first element
    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    // Delete last element
    public void popLast() {
        if (head == null || head.next == null) {
            head = tail = null;
            return;
        }

        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    // Search node
    public Node<T> search(T key) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(key)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Delete node by value
    public void delete(T key) {
        if (head == null) return;

        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(key)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Size of list
    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Print list
    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
