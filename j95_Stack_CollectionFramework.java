import java.util.Stack;

public class j95_Stack_CollectionFramework {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

//        pushAtBottom(5, s);
        reverseStack(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
