//Diameter_of_Tree-->> Number of nodes in the longest pathbetween any 2 nodes

public class A6_Diameter_of_Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Tree{
        static int idx=-1;
        public static Node MakeTree(int[] nodes){
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=MakeTree(nodes);
            newnode.right=MakeTree(nodes);
            return newnode;

        }

        public static int HeightofNode(Node root){
            if (root==null) { 
                return 0;
            }
            int leftHeight=HeightofNode(root.left);
            int rightHeight=HeightofNode(root.right);
            int myHeight= Math.max(leftHeight, rightHeight)+1;
            return myHeight;
            
        }
        public static int DiameterTree(Node root){
            int diam1=DiameterTree(root.left);
            int diam2=DiameterTree(root.right);
            int diam3=HeightofNode(root.left)+HeightofNode(root.right)+1;
            return Math.max(diam3, Math.max(diam1, diam2));
        }
    } 

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Tree t=new Tree();
        Node root=t.MakeTree(nodes);
        //System.out.println(root.data);
        System.out.println(t.HeightofNode(root));
        System.out.println("Diameter is: ");
        System.out.println(t.DiameterTree(root));
    }
     
    
}
