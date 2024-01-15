public class j108_BinaryTrees_Diameter {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;

        }
    }

    static class binaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static int height(Node root){ // O(n)
            if(root==null){
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);

            return Math.max(left,right) + 1;
        }
        
        public static int diameter(Node root){ // O(n^2)
            if(root==null){
                return 0;
            }
            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = height(root.left) + height(root.right) + 1;

            return Math.max(dia3, Math.max(dia2, dia1));
        }  
    }


    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        binaryTree b = new binaryTree();
        Node root = b.buildTree(nodes);

        System.out.println(b.diameter(root));

    }
}
