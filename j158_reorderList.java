import java.util.ArrayList;
import java.util.List;

public class j158_reorderList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void reorderList(ListNode head) {
        // ListNode curr1 = head.next;
        // ListNode prev1 = head;
        // ListNode curr2=head;
        // ListNode prev2=head.next;
        // int size=0;
        // ArrayList<ListNode> list = new ArrayList<>();

        // while(prev2.next!=null){
        //     size++;
        //     list.add(curr2);
        //     curr2 = curr2.next;
        //     prev2 = prev2.next;
        // }
        // size++;
        // list.add(prev2);
        // int j=size-2;

        // while(curr1!=curr2 || curr1.next!=curr2){
        //     prev1.next=prev2;
        //     prev2.next=curr1;
        //     prev1=curr1;
        //     curr1=curr1.next;
        //     curr2 = list.get(--j);
        //     prev2 = curr2.next;
        // }

        List<ListNode> arr = new ArrayList<>();
        ListNode prev1 = head;
        while(prev1 != null) {
            arr.add(prev1);
            prev1 = prev1.next;
        }
        prev1 = head;
        for(int i = 0 ; i < arr.size()/2 ; i++) {
            ListNode prev2 = arr.get(arr.size()-i-1);
            ListNode curr2 = arr.get(arr.size()-i-2);
            curr2.next = null;
            ListNode curr1 = prev1.next;
            prev1.next = prev2;
            prev2.next = curr1;
            if(curr1 != null) prev1 = curr1;
        }
        
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(4);
        ListNode h5 = new ListNode(5);
        h2 = h1.next;
        h3 = h2.next;
        h4 = h3.next;
        h5 = h4.next;
        h5.next=null;
        reorderList(h1);
        
    }
}
