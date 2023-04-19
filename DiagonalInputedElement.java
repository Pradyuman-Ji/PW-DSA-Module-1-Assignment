package DSA1;

import java.util.*;

public class DiagonalInputedElement {
    public static void diagonalInputed(int [][]arr){

        int m=arr.length;
        int n = arr[0].length;
        System.out.print("Element above secondry diagonal :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j || j==n-i-1){
                    System.out.print(arr[i][j]+ "  ");
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enetr the number of row : ");
        int m = sc.nextInt();
        System.out.print("Enetr the number of column : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[][]=new int[m][n];
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }

        }
        diagonalInputed(arr);
    }
}

