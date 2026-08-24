class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { // Controls the rows
            for (int j = 1; j <= i; j++) { // Prints multiples of 3
                System.out.print((3 * j) + " ");
            }
            System.out.println(); // Move to the next line
        }

    }
}