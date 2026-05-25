package array_stack;

public class LinkedStack {
    private Node top;
    private int size = 0;

    public LinkedStack() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node n = new Node(value);
        n.next = top;
        top = n;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public int size() {
        return size;
    }

}
