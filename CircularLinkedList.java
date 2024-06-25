import java.util.*;
public class CircularLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data  = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;
    public void create(){
        int data,n,m,p;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data");
            data = sc.nextInt();
            Node newNode =  new Node(data);
            if(head== null) {
                 head = newNode;
                 tail = newNode;
                 newNode.next = head;
            }
            else{
                newNode.next = head;
                head = newNode;
                tail.next = newNode;
                System.out.println("Node added at the beginning of the Linked List");
                
            }
            System.out.println("Press 1 for insertion of more data");
            n = sc.nextInt();
        }
        while(n == 1);
    }
    public void traverse(){
        Node temp = head;
        if(temp == null){
            System.out.println("Linked List does not exist");
        }
        else{
            do{
                System.out.println(temp.data);
                temp = temp.next;
            }
            while(temp!= head);
        }
    }
    public static void main(String[] args) {
        CircularLinkedList obj = new CircularLinkedList();
        obj.create();
        obj.traverse();
    }
    }
