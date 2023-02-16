import static org.junit.jupiter.api.Assertions.assertEquals;

class StackExTest extends StacksEx {

    public void testEmpty() throws Exception {
        MyStack stack = new MyStack();

        stack.checkInvariant();
        stack.push("sample");
        stack.checkInvariant();

        assertEquals("sample", stack.pop());
        stack.checkInvariant();

        stack.delete(1);
        stack.checkInvariant();
    }

}

class MyStack {
    public MyStack() {
        stack = new String[100];
        next_index = 0;
    }

    public String pop() {
        return stack[--next_index];
    }

    public void delete(int n) {
        next_index -= n;
    }

    public void push(String aString) {
        stack[next_index++] = aString;
    }

    public String top() {
        return stack[next_index - 1];
    }

    public void checkInvariant() throws Exception {
        if (!(next_index >= 0 && next_index < stack.length)) {
            throw new Exception("next_index out of range: " + next_index + " for stack length "
                    + stack.length);
        }
    }

    private int next_index;

    private String[] stack;
}