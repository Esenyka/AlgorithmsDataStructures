public class hw_3 {
    private Node head;
    private Node tail;
    private int size;


    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public void bubleSort() {
        int count = 0;
        do{ Node currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.value > currentNode.next.value) {
                    Integer temp = currentNode.value;
                    currentNode.value = currentNode.next.value;
                    currentNode.next.value = temp;
                    count ++;
                }
                currentNode = currentNode.next;
            }
        }
        while (count != size-1);
    }

    public void add(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
            size++;
        }else {
            tail.next = node;
            node.previous = tail;
            tail = node;
            size++;
        }
    }

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println(" ");
    }


    private class Node {
        int value;
        Node next;
        Node previous;

        Node() {}

        Node (int _value) {this.value = _value;}

        Node(int _value, Node _next, Node _previous) {this.value = _value; this.next = _next; this.previous = _previous;}
    }
}
