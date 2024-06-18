import java.util.*;
class Main{
    int top = -1;
    int n = 10;
    int[] arr =  new int[n];
    public void overflow(){
        if(top == (n-1)){
            System.out.println("Stack is in overflow condtion");
        }
    }
    public void underflow(){
        if(top == -1){
            System.out.println("Stack is in underflow condition");
        }
    }
    public void push(Scanner sc){
        overflow();
        System.out.println("Enter the number");
        int i = sc.nextInt();
        if(top == -1){
            top = top + 1;
            arr[top] = i;
        }
        else{
            top = top + 1;
            arr[top] = i;
        }
        System.out.println("Element is inserted into the stack");
    }
    public void pop(){
        underflow();
        top = top - 1;
        System.out.println("Element is deleted from the stack");
    }
    public void display(){
        for(int  i = top; i >= 0; i--){
            System.out.println(arr[i]);
        }
        System.out.println("Elements of the stack are displayed");
    }
}
public class Stack {
    public static void main(String[] args) {
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        int d;
        int l;
        do {
            System.out.println("Enter 1  for push operation");
            System.out.println("Enter 2 for pop operation");
            System.out.println("Enter 3 for display operation");
            System.out.println("Enter your choice");


            d = sc.nextInt();
            switch (d) {
                case 1:
                    obj.push(sc);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
            }
            System.out.println("Enter 0 to go to the main menu");
            System.out.println("Enter any key to exit");
            l = sc.nextInt();
        }
        while (l == 0);
        System.out.println("Exit successfully");
    }
}