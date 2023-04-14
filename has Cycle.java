public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
