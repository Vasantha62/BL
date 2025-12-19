package Vasantha;

public class Circular {
    Node head = null;
    Node tail = null;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = head;
        }else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    public  void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        do{
            System.out.println(temp.data+ " ");
            temp = temp.next;
        }while (temp!= head);
            System.out.println();
        }
    }

