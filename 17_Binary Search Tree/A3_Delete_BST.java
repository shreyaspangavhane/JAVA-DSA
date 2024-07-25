//cases:
    //Case 1: delete the child (left node)
            //delete the node and return null to the parent
    //Case 2: delete the one child 
            //delete the node and replace with child node
    //Case 3: delete the two child 
            //replace value with inorder successor and delete the node for inorder successor

    
public class A3_Delete_BST {
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

        public static Node delete(Node root, int val){
            if (root.data > val) {
                root.left= delete(root.left,val);
            }

            else if (root.data < val) {
                root.right= delete(root.right,val);
            }

            else{       //root.data == val
                //case 1
                if (root.left==null && root.right==null) {
                    return null;
                }

                //case 2
                if(root.left ==null){
                    return root.right;
                }
                else if(root.right == null){
                    return root.left;
                }

                //case 3
                Node IS=inordersuccessor(root.right);
                root.data=IS.data;
                root.right=delete(root.right, IS.data);
            }
            return root;

        }
        public static Node inordersuccessor(Node root){
            while (root.left!=null) {
                root=root.left;
            }
            return root;
        }

    public static void main(String[] args) {
        int value[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for (int i = 0; i < value.length; i++) {
            root=Insert(root, value[i]);
        }

        Inorder(root);
        System.out.println();

        delete(root, 4);
        delete(root, 10);
    }
}