public class pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {

            char ch;

            // Every 2 rows, change the symbol
            if (((i - 1) / 2) % 2 == 0) {
                ch = '*';
            } else {
                ch = '+';
            }

            // Print the symbol i times
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}