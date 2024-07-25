//count of node=   count of left+count of right


public class A3_Count_of_Node {
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
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;      //used for travelling in tree
            if (nodes[idx]==-1) {   
                return null;        //-1 is represent the null i.e not left and norb right

            }
            //for remaning data
            Node newnode=new Node(nodes[idx]); //travelling for print
            //frist go to the left side element the for right
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);

            return newnode;  
        }      
        public static int CountofNOdes(Node root){
            if (root==null) {
                return 0;
            }
            int leftcount=CountofNOdes(root.left);
            int rightcount=CountofNOdes(root.right);

            return leftcount+rightcount+1;
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);     //represent the whole tree
        System.out.println(root.data);

        System.out.print("Count of Nodes: ");
        System.out.println(tree.CountofNOdes(root));
    }
}