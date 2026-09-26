package experiments;

class Stack {
    private int maxSize = 10;
    private int top;
    private int[] stackArray;

    public Stack() {
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Push operation
    public void push(int item) {
        if (top < maxSize - 1) {
            stackArray[++top] = item;
            System.out.println("Pushed: " + item);
        } else {
            System.out.println("Stack is full. Cannot push " + item);
        }
    }

    // Pop operation
    public int pop() {
        if (top >= 0) {
            int item = stackArray[top--];
            System.out.println("Popped: " + item);
            return item;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
    }

    // Display operation
    public void display() {
        System.out.print("Stack: ");

        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }

        System.out.println();
    }
}

public class StackExample {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(5);
        stack.push(20);
        stack.push(15);

        stack.display();

        int poppedItem = stack.pop();

        if (poppedItem != -1) {
            System.out.println("Popped item: " + poppedItem);
        }

        stack.display();

        stack.push(10);
        stack.push(15);

        stack.display();
    }
}
