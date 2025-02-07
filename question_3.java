
import java.util.*;

class minstack {
    private Stack<int[]> stack;
    private int capacity;

    public minstack(int capacity) {
        this.stack = new Stack<>();
        this.capacity = capacity;
    }

    public void push(int x) {
        if (isfull()) {
            System.out.println("Stack is full! Cannot push " + x);
            return;
        }
        int min = stack.isEmpty() ? x : Math.min(x, stack.peek()[1]);
        stack.push(new int[]{x, min});
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return;
        }
        stack.pop();
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Returning -1.");
            return -1;
        }
        return stack.peek()[0];
    }

    public int getmin() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Returning -1.");
            return -1;
        }
        return stack.peek()[1];
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isfull() {
        return stack.size() >= capacity;
    }
}
public class question_3{
    public static void main(String[] args) {
        minstack stack = new minstack(3);
        stack.push(5);
        stack.push(2);
        stack.push(8);
        System.out.println("Is Full: " + stack.isfull());
        stack.push(10);

        System.out.println("Min: " + stack.getmin());
        stack.pop();
        System.out.println("Min: " + stack.getmin());
        stack.pop();
        System.out.println("Min: " + stack.getmin());

        System.out.println("Is Empty: " + stack.isEmpty());
        stack.pop();
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
