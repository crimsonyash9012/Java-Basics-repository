public class j98_Queue_LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }

    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail==null;
        }

        // enqueue

        // O(1)
        public static void add(int data){

            Node newNode = new Node(data);

            if(tail==null){
                tail= head = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // dequeue

        // O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            if(head==tail){
                tail=null;
            }

            int front = head.data;
            head = head.next;

            return front;
        }

        // O(1)_
        static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        q.add(1);
        System.out.println(q.remove());
        q.add(2);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
