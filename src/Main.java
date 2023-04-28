/*
Question : Given an array, print all its values recursively.
_______________________________________________________________
I/O = 5,4,3,2,1
O/P = 5,4,3,2,1
 */
import java.util.Scanner;
public class Main {
    static void PrintArray(int[] Array, int index){
        if (index == Array.length)return;
        System.out.println(Array[index]);
        PrintArray(Array, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialize,ArrayElements,index = 0;
        System.out.println("Enter the length of array :");
        ArrayElements = sc.nextInt();
        int[] Array = new int[ArrayElements];
        System.out.println("Enter the elements of array :");
        for (initialize = 0; initialize < Array.length; initialize++){
            Array[initialize] = sc.nextInt();
        }
        System.out.println("Printing the result without using recursion :");
        for (initialize = 0; initialize < Array.length; initialize++){
            System.out.print(Array[initialize]);
        }
        System.out.println("Printing the result with help of recursion :");
        PrintArray(Array,index);
    }
}