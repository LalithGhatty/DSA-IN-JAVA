import java.util.*;
public class LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    Node head = null;

    public void create() {
        int data, i , n, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the data");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                System.out.println("Linked list does not exist");
                head = newNode;
                System.out.println("Linked list created");
            } else {
                System.out.print("Enter 1 to insert the node at the beginning , 2 to insert  node at the end, 3 to insert node at the specific position you want");
                 n = sc.nextInt();
                switch (n) {
                    case 1:
                        newNode.next = head;
                        head = newNode;
                        System.out.println("Node added at the beginning of the Linked List");
                        break;
                    case 2:
                        Node temp = head;
                        while(temp.next != null){
                            temp = temp.next;
                        }
                        temp.next = newNode;
                        newNode.next = null;
                        System.out.println("Node added at the end of the Linked List");
                        break;
                    case 3:
                        System.out.print("Enter position of node to be inserted");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for(int m = 0; m< p-2;m++){
                            temp1 = temp1.next;
                        }
                        newNode.next = temp1.next;
                        temp1.next = newNode;
                        break;
                }
            }
            System.out.println("Press 1 for insertion of more data");
            n = sc.nextInt();
        }
        while(n == 1);
    }

    public void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List does not exist");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.create();
        obj.traverse();

    }
}