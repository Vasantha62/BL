import java.util.LinkedList;

public class Stack<T extends Comparable<T>> {

    private LinkedList<T> linkedList;

    public Stack() {
        linkedList = new LinkedList<>();
    }

    // Push internally calls LinkedList.add()
    public void push(T data) {
        linkedList.add(data);
    }

    // Peek top element
    public T peek() {
        if (linkedList.head == null) {
            return null;
        }
        return linkedList.head.data;
    }

    // Pop top element
    public T pop() {
        if (linkedList.head == null) {
            return null;
        }
        T data = linkedList.head.data;
        linkedList.pop();
        return data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return linkedList.head == null;
    }

    // Print stack
    public void printStack() {
        linkedList.printList();
    }
}
