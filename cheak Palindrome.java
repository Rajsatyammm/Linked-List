public boolean cheakPalindrome() {
        // Find mid
        Node mid = findMid(head);

        // reverse head2 half
        Node rightHead = reverse(mid);
        Node leftHead = head;

        // cheak palindrome
        while (rightHead != null) {
            if (rightHead.data != leftHead.data) {
                return false;
            }
            rightHead = rightHead.next;
            leftHead = leftHead.next;
        }
        return true;
    }
