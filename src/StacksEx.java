public class StacksEx {
    private int top; //index of the top element of StacksEx
    private int[] elements; //integer that holds the elements in the stack
    private int size; //the number of integers in my stack

    public StacksEx(int capacity)
    {
        elements = new int[capacity];
        size = 0;
        top = -1;
    }

    public void push(int element)
    {
        if (size == elements.length)
        {
            throw new IllegalStateException("your stack is full");  //checks to see if stack is full itll throw an IllegalStateException but iff not full
        }
        elements[++top] = element; //"top" would then increment top
        size++;
    }

    public int pop()
    {
        if (size == 0)
        {
            throw new IllegalStateException("your stack is empty");
        }
        size--;
        return elements[top--];
    }

    public int peek()
    {
        if (size == 0)
        {
            throw new IllegalStateException("your stack is empty");
        }
        return elements[top];
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size == elements.length;
    }

    public void show()   //for loop to show message
    {
        if (isEmpty())
        {
            System.out.println("your stack is empty");
            return;
        }
        System.out.print("Stack cap : ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}