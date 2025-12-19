class Node{
    int data;
    Node prev;
    Node next;
    Node(int value){
        data = value;
        prev = null;
        next = null;
    }
}
public class Main{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = Node(30);
        head.next.next.prev = head;
        head.next.next.next.prev = head;
        head.next.next.next = Node(40);
        head.next.next.next.next.prev = head;
        Node temp = head;
        while(temp ! = null){
            System.out.println(temp.data);
            if(temp.next ! = null){
                System.out.println("<->");
            }
            temp = temp.next;
        }

    }
}