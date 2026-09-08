import java.util.Scanner;

public class GenericArrayInsert {

    public static <T> void insert(T[] arr, T value, int position, int currentSize) {
        for (int i = currentSize; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n + 1]; 
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();
        System.out.print("Enter position to insert at (0-based): ");
        int position = sc.nextInt();

        insert(arr, value, position, n); 

        sc.close();
    }
}