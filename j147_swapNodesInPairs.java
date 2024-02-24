public class j147_swapNodesInPairs {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode dummy = pre;
        
        while (pre.next != null && pre.next.next != null) {
            ListNode a = pre.next;
            ListNode b = a.next;
            
            a.next = b.next;
            b.next = a;
            pre.next = b;
            
            // Move
            pre = pre.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println(swapPairs(head).val);
    }
}
