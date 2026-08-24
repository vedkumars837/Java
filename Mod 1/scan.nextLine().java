import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the leftover newline
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}



// Q. Why scan.nextLine() is needed?
// The input buffer(is a temporary storage area where the keyboard input is kept until your program reads it.
// Think of it like a queue.) still contains the newline (\n).Before your program reads anything, the input buffer contains:42\n3.14\nHello\n
// So after nextInt(), the buffer contains:\n

// Now if you write:
// nextLine() reads everything until it finds a newline.
