package Double;

class Main2 {
    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;   
         }

        head = node;           
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        System.out.println("Print the values reverse");

        while (last!=null){
            System.out.print(last.val + " -> ");
            last= last.prev;

        }
        System.out.println("Start");
    }
public void insrtlast(int val){
        Node node = new Node(val);
          Node last = head;
          node.next = null;
          if(head==null){
              node.prev = null;
              head = null;
              return;
          }
      while(last.next!=null){
          last = last.next;
          node.prev = last;
      }
    last.next = null;
}


    private class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
