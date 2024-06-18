import java.util.Scanner;
class CircularQueue2 {
    int n = 10;
    int f = -1;
    int r = -1;
    int[] arr = new int[n];
    public void enqueue(Scanner sc) {
        if (f == (r + 1) % n) {
            System.out.println("Queue is in overflow condition");
        }
        System.out.println("Enter the data");
        int i = sc.nextInt();
        if (f == -1 && r == -1) {
            f = 0;
            r = 0;
            arr[r] = i;
            System.out.println("Element is entered in the queue");
        } else {
            r = (r + 1) % n;
            arr[r] = i;
            System.out.println("Element is entered in the queue");
        }
    }
    public void dequeue() {
        if (f == -1 && r == -1) {
            System.out.println("Queue is in underflow condition");
        } else if (f == r) {
            System.out.println("Queue is in undeflow condition");
        } else {
            f = (f + 1) % n;
        }
    }

        public void display () {
            int i;
            System.out.println("Elements of the queue are:");
            for ( i = f; i != r; i = (i + 1) % n) {
                System.out.println(arr[i]);
            }
            System.out.println(arr[i]);
        }
    }
public class CircularQueue {
    public static void main(String[] args) {
        CircularQueue2 obj = new CircularQueue2();
        Scanner sc = new Scanner(System.in);
        int d;
        int l;
        do {
            System.out.println("Enter 1 for enqueue operation");
            System.out.println("Enter 2 for dequeue operation");
            System.out.println("Enter 3 for display operation");
            System.out.println("Enter your choice");
            d = sc.nextInt();
            switch (d) {
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
        while (l == 0);
        System.out.println("Exit successfully");
    }
}
