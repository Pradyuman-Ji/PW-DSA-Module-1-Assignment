package DSA1;

import java.util.*;
import java.io.*;
public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array :");
        int arr[]=new int[n];

        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        System.out.print("First peak element of array : ");
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                if(max>arr[i-1] && max>arr[i+1])
                    break;
            }
        }
        System.out.println(max);
    }
}

