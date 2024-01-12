public class j96_Queue_Array {
    static class Queue{
        static int []arr;
        static int size;
        static int rear = -1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear ==-1;
        }

        // enqueue

        // O(1)
        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        // dequeue

        // O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return rear;
            } 

            int first = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return first;
        }

        // O(1)_
        static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return rear;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(4);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
