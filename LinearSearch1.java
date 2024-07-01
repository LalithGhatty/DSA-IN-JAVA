import java.util.*;
public class LinearSearch1 {
    public static void main(String[] args) {
        Random random  = new Random();
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("Enter how many numbers you want to generate randomly");
        int randomInt = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0;i<len;i++){
            arr[i] = random.nextInt(randomInt);
        };
        System.out.println("Enter the number you want to search in the array");
        int required = sc.nextInt();
        LinearSearch(arr,required);
    }
    public static int LinearSearch(int[] array,int target){
        int count = 0;
        for(int i = 0 ;i<array.length;i++){
            if(array[i] == target){
               System.out.println(array[i]);
               System.out.println("Match found at :" + i + "th  position");
               count++;
            }
        }
        System.out.println("Number of times required number is found in the array is:" + " " + count);
        return -1;
    }
}