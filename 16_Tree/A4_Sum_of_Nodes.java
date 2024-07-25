public class A4_Sum_of_Nodes {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;  // Initialize to null
            this.right = null; // Initialize to null
        }
    }

    static class Tree {
        static int idx = -1;

        public static Node makeTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); // Use value from nodes array
            newNode.left = makeTree(nodes);
            newNode.right = makeTree(nodes);

            return newNode;
        }

        public static int SumofNode(Node root){
            if (root==null) {
                return 0;
            }
            int leftSum=SumofNode(root.left);
            int rightSum=SumofNode(root.right);

            return leftSum+rightSum+root.data;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree t = new Tree();
        Node root = t.makeTree(nodes);
        System.out.println(root.data);
        System.out.println();

        System.out.println(t.SumofNode(root));

    }
}
