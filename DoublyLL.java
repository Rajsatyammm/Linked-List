public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void print() {
        Node curr = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        Node curr = head;
        if (head == null) {
            addFirst(data);
            return;
        }
        while (curr.next != null) {
            curr = curr.next;
        }
        newNode.prev = curr;
        curr.next = newNode;
        size++;
    }

    public void deleteFirst() {
        Node curr = head;
        int val = curr.data;
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        if(head.next == null) {
            head = tail = null;
            size--;
            System.out.println("Deleted : "+ val);
            return;
        }
        curr.next.prev = null;
        head = curr.next;
        curr.next = null;
        size--;
        System.out.println("Deleted : " + val);
    }

    public void deleteLast() {
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        int val = curr.next.data;
        curr.next.prev = null;
        curr.next = null;
        size--;
        System.out.println("Deleted : " + val);

    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        while(curr != null) {
            Node nextp = curr.next;
            curr.next = prev;
            curr.prev = nextp;

            //update
            prev = curr;
            curr = nextp;
        }
        head = prev;
    }

    public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();
        // dll.print();
        dll.addFirst(3);
        dll.addFirst(5);
        dll.addLast(9);
        // dll.deleteLast();
        // dll.deleteFirst();
        // dll.deleteFirst();
        // System.out.println("size : " + size);
        dll.print();
        dll.reverse();
        dll.print();
    }
}
