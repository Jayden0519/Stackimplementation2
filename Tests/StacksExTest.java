import static org.junit.jupiter.api.Assertions.assertEquals;

class StackExTest extends StacksEx {
    public String videoGames;
    public int getNum;

    public String getNum()
    {
        return null;
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


        public void checkInv() throws Exception {
            if (!(next_index >= 0 && next_index < stack.length)) {
                throw new Exception("next_index out of range: " + next_index + " for stack length "
                        + stack.length);
            }
        }

        private int next_index;

        private String[] stack;
    }
}