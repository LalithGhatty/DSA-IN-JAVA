import java.util.*;
public class SingularLinkedList {
        static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = next;
        } }
        Node head = null;

        public void create(){
             int data , i;
             Scanner sc = new Scanner(System.in);
             do{

            System.out.print("Enter the data");
             data = sc.nextInt();
            Node newNode = new Node(data);
            if(head == null){
                System.out.println("Linked list does not exist");
                head  = newNode;
                System.out.println("Linked list created");
            }
            else{
                newNode.next = head;
                head = newNode;
                System.out.println("Node is inserted at the beginning of the linked list");
            }
            System.out.print("Press 1 for insertion of more data");
            i = sc.nextInt();
            }
             while(i == 1);
        }
        public void traverse(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    public static void main(String[] args) {
        
    }
    }