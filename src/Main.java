public class Main
{
    public static void main(String[] args) {
        StacksEx stack = new StacksEx(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("stack is full " + stack.isFull());

        try {
            stack.push(60); // This will throw an exception because the stack is full
        } catch (IllegalStateException j) {
            System.out.println("cant push element onto stack: " + j.getMessage());
        }

        System.out.println("top element : " + stack.peek());

        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println("popped element : " + element);
        }

        System.out.println("stack is empty : " + stack.isEmpty());
    }
}