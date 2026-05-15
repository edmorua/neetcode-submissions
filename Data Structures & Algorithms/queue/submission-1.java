class Deque {

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int val) {
            this.value = val;
        }
    }

    private Node head;
    private Node tail;

    public Deque() {
        this.head = new Node(0);  // Dummy head
        this.tail = new Node(0);  // Dummy tail
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public boolean isEmpty() {
        return this.head.next == this.tail;
    }

    public void append(int value) {
        Node node = new Node(value);  // CREATE the node first!
        node.next = tail;
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;
    }

    public void appendleft(int value) {
        Node node = new Node(value);
        node.prev = head;
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
    }

    public int pop() {
        if (isEmpty()) return -1;
        Node node = tail.prev;
        node.prev.next = tail;
        tail.prev = node.prev;
        return node.value;  // Only ONE return statement
    }

    public int popleft() {
        if (isEmpty()) return -1;
        Node node = head.next;
        head.next = node.next;
        node.next.prev = head;
        return node.value;  // Only ONE return statement
    }
}