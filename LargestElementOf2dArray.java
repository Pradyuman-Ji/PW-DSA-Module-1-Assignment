
package DSA1;

        import java.util.*;


        public class LargestElementOf2dArray {


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int m = sc.nextInt();
            System.out.println("Enter the number of column : ");
        int n= sc.nextInt();
        System.out.println("Enter the array :");
        int arr[][]=new int[m][n];

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        System.out.print("Maximum element of array : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
