public class A2_Search_BST {
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
        public static Node Insert(Node root,int val){
            if (root==null) {
                root=new Node(val);
                return root;

            }

            if (root.data>val) {
                root.left=Insert(root.left, val);
                
            }

            else{
                root.right=Insert(root.right, val);
            }
            return root;
        }
        
        public static void Inorder(Node root){
            if (root==null) {
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }

        public static Boolean Search(Node root,int key){
            if (root==null) {
                return false;
            }

            if (root.data>key) {                //check is key small then search toward the left ele
                return Search(root.left, key);         //is key present at the left subtree
            }

            else if (root.data==key) {          //if data value equal to null then key is found
                return true;
            }

            else{
                return Search(root.right, key);        //is key present at the Right subtree
            }
            
        }

    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for (int i = 0; i < value.length; i++) {
            root=Insert(root, value[i]);
        }

        Inorder(root);
        System.out.println();

        if (Search(root, 11)) {
            System.out.println("Key is found");
        }
        else{
            System.out.println("Key is not Found");
        }
    }
}