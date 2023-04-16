public Node merge(Node head1, Node head2) {
        Node temp = new Node(-1);
        Node curr = temp;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
                // temp = temp.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            curr.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            curr.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return temp.next;
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);

        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }
