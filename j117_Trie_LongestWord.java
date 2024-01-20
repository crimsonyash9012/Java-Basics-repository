public class j117_Trie_LongestWord {
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

    public static String ans="";

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

    public static void longestWord(Node root, StringBuilder tmp){
        if(root==null){
            return;
        }
        for(int i=0; i<26;i++){
            if(root.children[i]!=null && root.children[i].eow){
                tmp.append((char)(i+'a'));
                if(tmp.length()>ans.length()){
                    ans=tmp.toString(); // string builder to string
                }
                longestWord(root.children[i], tmp);
                tmp.deleteCharAt(tmp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        String [] str = {"a", "apple", "banana", "app", "appl", "ap", "apply"};

        for(int i=0; i<str.length; i++){
            insert(str[i]);
        }

        StringBuilder s = new StringBuilder();
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
