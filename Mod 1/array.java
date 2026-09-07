import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        int m, n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array index for row :");
        m = sc.nextInt();

        System.out.print("Enter the array index for column :");
        n = sc.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the value for arr[" + i + "][" + j + "] :");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
