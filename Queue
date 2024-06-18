import java.util.*;
class Queue{
    int n = 10;
    int f = -1;
    int r = -1;
    int[] arr = new int[n];
    public void overflow(){
        if(r == (n-1)){
            System.out.println("Queue is in overflow condition");
        }
    }
    public void underflow(){
        if(f == -1 && r == -1){
            System.out.println("Queue is in underflow condition");
        }
    }
    public void enqueue(Scanner sc){
        overflow();
        System.out.println("Enter the data");
        int i = sc.nextInt();
        if(f == -1 && r == -1){
            f = 0;
            r = 0;
            arr[r] = i;
            System.out.println("Element is entered into the queue");
        }
        else{
            r = r + 1;
            arr[r]  = i;
            System.out.println("Element is entered into the queue");

        }
        }
        public void dequeue(){
        underflow();
        f = f + 1;
        System.out.println("Element is deleted from the queue");
        }
        public void display(){
        for(int i = f ; i<=r;i++){
            System.out.println(arr[i]);
        }
        }
}
public class Main{
    public static void main(String[] args) {
        Queue obj = new Queue();
        Scanner sc = new Scanner(System.in);
        int d;
        int l;
        do{
            System.out.println("Enter 1 for enqueue operation");
            System.out.println("Enter 2 for dequeue operation");
            System.out.println("Enter 3 for display operation");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            switch(d){
                case 1:
                    obj.enqueue(sc);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.display();
                    break;
            }
            System.out.println("Enter 0 to go to main menu");
            System.out.println("Enter your choice");
            l = sc.nextInt();
        }
        while(l == 0);
        System.out.println("Exit successfully");
    }
}