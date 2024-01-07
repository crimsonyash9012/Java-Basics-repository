public class j85_LinkedList_reverseRecursive {
    Node head;
    private int size;

    j85_LinkedList_reverseRecursive(){
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

    public static void main(String[] args) {
        j85_LinkedList_reverseRecursive LL = new j85_LinkedList_reverseRecursive();
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
