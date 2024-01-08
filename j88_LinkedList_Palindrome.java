public class j88_LinkedList_Palindrome {
    Node head;
    private int size;

    j88_LinkedList_Palindrome(){
        size=0;
    }
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public void reverseIterate(){
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    public void addFirst(String data){
        Node node = new Node(data);
//        size++;

        if(head==null){
            head = node;
            return; // signifies that the function is ended even if it's void
        }

        node.next = head;
        head = node;

    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }
//        size++;

        Node lastNode = head;

        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;

        if(head==null){
            System.out.println("List is empty");
            return;
        }

        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public int getSize(){
        return size;
    }

    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public boolean isPalindrome(Node head) {
        if(head==null || head.next == null){
            return true;
        }

        Node middle = findMiddle(head);
        Node secondHead = reverse(middle.next);

        Node firstHead = head;

        while(secondHead!=null){
            if(secondHead.data!=firstHead.data){
                return false;
            }
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }
        return true;
    }

    public static void main(String[] args) {
        j88_LinkedList_Palindrome LL = new j88_LinkedList_Palindrome();
        LL.addFirst("yash");
        LL.addFirst("is");
        LL.addFirst("This");
        LL.addLast("gola");
        LL.printList();

        LL.head = LL.reverseRecursive(LL.head);

        LL.printList();

        System.out.println(LL.getSize());
    }
}
