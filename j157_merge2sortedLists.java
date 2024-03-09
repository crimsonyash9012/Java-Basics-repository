public class j157_merge2sortedLists {
    static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
                }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }
    
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(2));
        ListNode head2 = new ListNode(1, new ListNode(3));
        ListNode node = mergeTwoLists(head1, head2);
        System.out.println(node.val);


    }
}
