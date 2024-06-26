import java.util.*;
public class Main {
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
    public void create(){
        Scanner sc  = new Scanner(System.in);
        int data,m,n,p;
        do{
            System.out.println("Enter the data");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if(head == null){
                head  = newNode;
                tail = newNode;
                System.out.println("Doubly Linked List created");
            }
            else{
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
                System.out.println("Node added at the beginning of the Doubly linked list ");
            }
          System.out.println("Enter 1 to insert more data");
            n = sc.nextInt();
        }
        while(n == 1);
    }
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
        Main obj = new Main();
        obj.create();
        obj.traverse();

    }

}
