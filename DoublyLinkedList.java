import java.util.*;
public class DoublyLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;
    public void create() {
        Scanner sc = new Scanner(System.in);
        int data, m, n, p;
        do {
            System.out.println("Enter the data");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                System.out.println("Doubly Linked List created");
            } else {
                System.out.println("Enter 1 to insert the node at the beginning,2 to insert the node at the end, 3 to insert the node at the specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        newNode.next = head;
                        head.prev = newNode;
                        head = newNode;
                        System.out.println("Node added at the beginning of the Doubly Linked List");
                        break;
                    case 2:
                        tail.next = newNode;
                        newNode.prev = tail;
                        tail = newNode;
                        break;
                    case 3:
                        System.out.println("Enter the position where you want to insert the data");
                        p = sc.nextInt();
                        Node temp = head;
                        Node ptr = temp.next;
                        for (int i = 1; i < p - 1; i++) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        temp.next = newNode;
                        newNode.prev = temp;
                        ptr.prev = newNode;
                        newNode.next = ptr;
                        System.out.println("Node added at the " + "" + p + "" + "th" + "position");
                        break;
                }
            } System.out.println("Enter 1 to insert more data");
            n = sc.nextInt();
        }
        while(n == 1);}
    public void traverse(){
        Node temp = head;
        if(head == null){
            System.out.println("Doubly linked list does not exist");
        }
        else{
            while(temp!= null){
                System.out.println(temp.data);
                temp = temp.next;
            }

        }
    }


    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.create();
        obj.traverse();

    }

}
