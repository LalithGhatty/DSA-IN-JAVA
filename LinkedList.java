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
    public void delete() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("Linked List is empty");
            } else {
                System.out.println("Enter 1 to delete node from beginning, 2 to delete from the end , 3 to delete from specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        System.out.println("Node is deleted from the beginning of the linked list");
                        break;
                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next != null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        System.out.println("Node is deleted from the end of the linked list");
                        System.out.println("The value of the last node is:" + " " + temp1.data);
                        break;
                    case 3:
                        System.out.println("Enter the position from where you want to delete the node");
                        p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 0; i < p - 2; i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        System.out.println("Node is deleted from the " + " " + p + "th" + " " + "position");
                        break;
                }}
                System.out.println("Enter 1 for insertion of more data");
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
        obj.delete();
        obj.traverse();


    }
}