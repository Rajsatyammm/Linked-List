public void zigZagLL() {
        Node mid = getMid(head);
        Node head2 = reverse(mid.next);
        mid.next = null;

        Node left = head;
        Node right = head2;
        Node nextL, nextR;
        while (left != null && right != null) {
            // zig zag step
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            // updation step
            left = nextL;
            right = nextR;
        }
    }
