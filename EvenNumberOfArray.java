package DSA;

import java.util.*;
import java.io.*;
public class EvenNumberOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n =sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array even element : ");
        for(int i : arr){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
