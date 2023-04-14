public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;
    static int size;

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        // empty Linked List
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        size++;
        currNode.next = newNode;
    }

    public void add(int data, int idx) {
        Node newNode = new Node(data);
        Node currNode = head;
        if (idx == 0) {
            AddFirst(data);
            return;
        }
        int i = 1;
        while (i < idx) {
            currNode = currNode.next;
            i++;
        }
        size++;
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("Empty Linked List : ");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) {
            size = 0;
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            size = 0;
            return;
        }

        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        size--;
        currNode.next = null;
    }
  public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.AddFirst(3);
        ll.AddFirst(3);
        ll.AddLast(4);
        ll.AddFirst(4);
        ll.add(9, 2);
        ll.add(9, 2);
        // ll.printLL();
        // ll.deleteFromLast(2);
        // ll.deleteFirst();
        // ll.deleteLast();
        // System.out.println("size of LL is : " + size);
        ll.printLL();
        
    }
}
