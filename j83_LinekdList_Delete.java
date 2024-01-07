public class j83_LinekdList_Delete {
    Node head;
    private int size;

    j83_LinekdList_Delete(){
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


    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next;

    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        size--;

        if(head.next==null){
            head=null;
        }

        Node secondLast = head;
        Node Last = head.next;

        while (Last.next!=null){
            Last = Last.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    public static void main(String[] args) {
        j83_LinekdList_Delete LL = new j83_LinekdList_Delete();
        LL.addFirst("yash");
        LL.addFirst("is");
        LL.addFirst("This");
        LL.addLast("gola");
        LL.deleteFirst();
        LL.printList();

        System.out.println(LL.getSize());
    }
}
