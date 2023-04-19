package DSA;

import java.util.*;
import java.io.*;
public class ArrayElementSum {

    // Time complexity : O(n)
    // Space complexity : O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1-d Array : ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the matrix");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i =0;i<n;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of element : " +sum);
    }
}
