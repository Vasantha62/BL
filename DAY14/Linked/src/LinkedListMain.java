
public class LinkedListMain {

    public static void main(String[] args) {

        System.out.println("=== Create Linked List: 56->30->70 ===");
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(70);
        list1.add(30);
        list1.add(56);
        list1.printList();

        System.out.println("=== Append Linked List: 56->30->70 ===");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(56);
        list2.append(30);
        list2.append(70);
        list2.printList();

        System.out.println("=== Delete First Element (pop) ===");
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.append(56);
        list4.append(30);
        list4.append(70);
        list4.pop();
        list4.printList();

        System.out.println("=== Delete Last Element (popLast) ===");
        LinkedList<Integer> list5 = new LinkedList<>();
        list5.append(56);
        list5.append(30);
        list5.append(70);
        list5.popLast();
        list5.printList();

        System.out.println("=== Search for 30 ===");
        LinkedList<Integer> list6 = new LinkedList<>();
        list6.append(56);
        list6.append(30);
        list6.append(70);
        Node<Integer> searchNode = list6.search(30);
        System.out.println(searchNode != null
                ? "Node found with value: " + searchNode.data
                : "Node not found");

        System.out.println("=== Insert 40 after 30 ===");
        LinkedList<Integer> list7 = new LinkedList<>();
        list7.append(56);
        list7.append(30);
        list7.append(70);
        Node<Integer> node30 = list7.search(30);
        list7.insertAfter(node30, 40);
        list7.printList();

        System.out.println("=== Delete 40 and Show Size ===");
        list7.delete(40);
        list7.printList();
        System.out.println("Size of Linked List: " + list7.size());

        System.out.println("=== Sorted Linked List ===");
        SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();
        sortedList.add(56);
        sortedList.add(30);
        sortedList.add(40);
        sortedList.add(70);
        sortedList.printList();
    }
}
