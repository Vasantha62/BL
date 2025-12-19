public class Stack<T extends Comparable<T>> {

    private LinkedList<T> linkedList;

    public Stack() {
        linkedList = new LinkedList<>();
    }

    // Push -> add at beginning
    public void push(T data) {
        linkedList.add(data);
    }

    // Peek top element
    public T peek() {
        return linkedList.head != null ? linkedList.head.data : null;
    }

    // Pop top element
    public T pop() {
        if (linkedList.head == null) return null;
        T data = linkedList.head.data;
        linkedList.pop();
        return data;
    }

    // Check if empty
    public boolean isEmpty() {
        return linkedList.head == null;
    }

    // Print stack
    public void printStack() {
        linkedList.printList();
    }
}

