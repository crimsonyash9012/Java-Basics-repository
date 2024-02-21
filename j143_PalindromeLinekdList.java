public class j143_PalindromeLinekdList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
   
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
   
    public static ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
   
        while(hare.next!=null && hare.next.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public static boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null){
            return true;
        }
        
        ListNode middle = findMiddle(head);
        ListNode secondHead = reverse(middle.next);

        ListNode firstHead = head;

        while(secondHead!=null){
            if(secondHead.val!=firstHead.val){
                return false;
            }
            firstHead = firstHead.next;
            secondHead = secondHead.next;            
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(isPalindrome(head));

    }
}
