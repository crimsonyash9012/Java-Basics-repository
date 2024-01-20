public class j115_Trie_Count {
    static class Node{
        Node [] children;
        boolean eow;

        public Node(){
            children = new Node[26];

            for(int i=0; i<26; i++){
                children[i] = null;
            }

            eow = false;

        }
    }

    static Node root = new Node();

    public static void insert(String word){

        Node curr = root;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';

            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }

            if(i==word.length()-1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }
    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }

        int count=0;

        for(int i=0; i<26; i++){
            if(root.children[i]!=null){
                count+=count(root.children[i]);
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        String str = "apple";

        for(int i=0; i<str.length(); i++){
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(count(root));
    }
}
