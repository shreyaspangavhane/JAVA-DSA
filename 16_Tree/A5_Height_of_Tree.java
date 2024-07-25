
public class A5_Height_of_Tree {

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

        public static int HeightofNode(Node root){
            if (root==null) { 
                return 0;
            }
            int leftHeight=HeightofNode(root.left);
            int rightHeight=HeightofNode(root.right);

            if(leftHeight>rightHeight){
                return leftHeight+1;
            }
            else{
                return rightHeight+1;
            }

          //  return leftSum+rightSum+root.data;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree t = new Tree();
        Node root = t.makeTree(nodes);
        System.out.println(root.data);
        System.out.println();

        System.out.println(t.HeightofNode(root));

    }
}
