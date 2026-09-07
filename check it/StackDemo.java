class Stack {
    private int[] stackArray;
    private int top;
    private final int MAX_SIZE = 10;

    // Constructor
    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1; // stack is empty initially
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Pushing values
        for (int i = 1; i <= 10; i++) {
            stack.push(i * 10);
        }

        // Try pushing beyond capacity
        stack.push(999); // Should show Stack Overflow

        stack.display();

        // Popping a few values
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.display();

        System.out.println("Top element (peek): " + stack.peek());
    }
}