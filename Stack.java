public class Stack{
 private Node top;

    private Node createNode(char data) {
        return new Node(data);
    }

    public void push(char data) {
        Node newnode = createNode(data);
        if (isEmpty()) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("pop(): Stack Underflow!");//this will be displayed if the stack is empty already
        } else {
            Node temp = top;
            top = top.next;
            temp.next = null;
        }
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return top.data;
        }
    }

    /*public void displayStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println();
    }*/

    public boolean isEmpty() {
        return top == null;

    }


}