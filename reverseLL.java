/*

*/

public void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextP = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextP;
        }
        head = prev;
    }


    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextP = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextP;
        }
        return prev;
    }
