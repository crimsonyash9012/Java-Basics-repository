public class j116_Trie_prefix {
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

    public static boolean startsWith(String prefix){
        Node curr = root;

        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {

        String [] keys = {"i", "like", "samsung", "mobile"};
       for(int i=0; i< keys.length; i++){
           insert(keys[i]);
       }
        System.out.println(startsWith("th"));
        System.out.println(startsWith("an"));
        System.out.println(startsWith("app"));
        System.out.println(startsWith("mob"));
    }
}
