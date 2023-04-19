package DSA1;

import java.util.*;
import java.io.*;
public class NumberCheck {
    public static void numCheck(int [][]arr){
        int evenNum=0,oddNum=0,posNum=0,negNum=0,num0=0;
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>0){
                    posNum++;
                } else if (arr[i][j]<0) {
                    negNum++;
                }
                else{
                    num0++;
                }
                if(arr[i][j]%2==0){
                    evenNum++;
                }
                else{
                    oddNum++;
                }
            }
        }
        System.out.println("Number of psitive number : "+ posNum);
        System.out.println("Number of negative number : "+ negNum);
        System.out.println("Number of odd number : "+ oddNum);
        System.out.println("Number of even number : "+ evenNum);
        System.out.println("Number of 0 : "+num0);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enetr the number of row : ");
        int m = sc.nextInt();
        System.out.println("Enetr the number of column : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[][]=new int[m][n];
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        numCheck(arr);
    }
}
