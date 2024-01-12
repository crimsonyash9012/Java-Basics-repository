public class j97_Queue_CircularArray {
    static class Queue{
        static int []arr;
        static int size;
        static int front = -1;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear ==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        // enqueue

        // O(1)
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        // dequeue

        // O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return rear;
            }

            int result = arr[front];
            if(rear==front){
                rear = front = -1;
            }
            else{
                front = (front+1)%size;
            }

            return result;
        }

        // O(1)_
        static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return rear;
            }

            return arr[front];
        }
    }
    public static void main(String[] args) {
        j96_Queue_Array.Queue q = new j96_Queue_Array.Queue(4);
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
