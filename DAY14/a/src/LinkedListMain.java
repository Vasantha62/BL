public class LinkedListMain {

    public static void main(String[] args) {

        // ================= STACK =================
        System.out.println("=== STACK OPERATIONS ===");

        Stack<Integer> stack = new Stack<>();

        // Push: 70, 30, 56 -> 56 on top
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.print("Stack: ");
        stack.printStack();   // 56->30->70->null

        System.out.println("Peek: " + stack.peek());

        // Pop until empty
        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        // ================= QUEUE =================
        System.out.println(" QUEUE OPERATIONS ");

        Queue<Integer> queue = new Queue<>();

        // Enqueue: 56, 30, 70 -> 56 at front
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.print("Queue: ");
        queue.printQueue();

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
    }
}
