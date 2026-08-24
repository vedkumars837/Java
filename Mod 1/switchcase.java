public class switchcase {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        char operator = '+';

        switch (operator) {

            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}