import java.util.LinkedList;

public class Queue<T extends Comparable<T>> {

    private LinkedList<T> linkedList;

    public Queue() {
        linkedList = new LinkedList<>();
    }

    // Enqueue internally calls LinkedList.append()
    public void enqueue(T data) {
        linkedList.append(data);
    }

    // Dequeue from beginning
    public T dequeue() {
        if (linkedList.head == null) {
            return null;
        }
        T data = linkedList.head.data;
        linkedList.pop();
        return data;
    }

    // Print queue
    public void printQueue() {
        linkedList.printList();
    }
}
