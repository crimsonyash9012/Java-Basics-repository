public class j109_BinaryTrees_Diameter2 {
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
    }

    static class TreeInfo{      // O(n)
        int dm;
        int ht;

        TreeInfo(int ht, int dm){
            this.ht = ht;
            this.dm = dm;
        }
    }

    public static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht) + 1;

        int diam1 = left.dm;
        int diam2 = right.dm;
        int diam3 = left.ht + right.ht+1;

        int myDiam = Math.max(diam3, Math.max(diam1,diam2));
        TreeInfo info = new TreeInfo(myHeight, myDiam);
        return info;
    }


    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        binaryTree b = new binaryTree();
        Node root = b.buildTree(nodes);

        System.out.println(diameter2(root).dm);

    }
}
