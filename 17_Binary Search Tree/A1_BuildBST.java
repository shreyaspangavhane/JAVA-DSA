public class A1_BuildBST {
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
        public static Node Insert(Node root , int val){
            if(root==null){                 //root is empty then insert the value
                root=new Node(val);         //insert the value by creating the new node
                return root;
            }
            if (root.data>val) {        //check the root ele is greter then that value
                //inserting the ele at left subtree
                root.left=Insert(root.left, val);
            }
            else{                       //here the root value is smaller than the ele of subtree
                //insert the value at the right
                root.right=Insert(root.right, val);
            }
            return root;            
        }

        public static void Inorder(Node root){      //for the print the ele in the inorder sequence       seq-->>  left node , root , right node
            if (root==null) {
                return;                 //if empty the simply return
            }
            
            //inorder sequence
            Inorder(root.left);                     //left node
            System.out.print(root.data+" ");        //root value
            Inorder(root.right);                    //right node
        }
    
    public static void main(String[] args) {
        int value[]={5,1,3,2,4,7};
        Node root=null;

        for (int i = 0; i < value.length; i++) {        //for travesing the element
            root=Insert(root,value[i]);                 //insert the value into the root
        }

        Inorder(root);                          //print the sequence
        System.out.println();
    }
}