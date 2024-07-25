// 4 travelling technique: 
        //  1. Preorder:
                    //sequence of printing-    root -- left subtree  --  right subtree 
        //  2.  Inorder:
                    //sequnce-->>     left subtree -- root -- right subtree
        //  3.  Postorder:
                    //sequnce-->>     left subtree -- right subtree -- root 
//VIMP  //  4.  Level order:

import java.util.*;

public class A2_Tree_Travelling  {
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
        //recurrision concept
        static void preorder(Node root){        //printing by using preorder
            if (root==null) {
                return;
            }
            System.out.print(root.data+" ");    
            preorder(root.left);
            preorder(root.right);
        }

                //recurrision concept

        static void Inorder(Node root){        //print by inorder sequence
            if(root==null){
                return;
            }

            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }

        //recurrision concept

        static void Postorder(Node root){        //print by Postorder sequence
            if(root==null){
                return;
            }

            Inorder(root.left);
            Inorder(root.right);
            System.out.print(root.data+" ");
        }

        //recurrision concept
        static void LevelOrder(Node root){          //PRINT LEVELORDER MANNER
            Queue<Node> q=new LinkedList<>();       //create queue
            q.add(root);                            //add element of nodes i.e root
            q.add(null);

            while (!q.isEmpty()) {              //check untill get empty
                Node CurrChar=q.remove();       //assign any number to cuurent char which are going to rempve before that its value store in the CurrChar 
                if(CurrChar==null){
                    System.out.println();       //if null then print on next` linr
                    if(q.isEmpty()){            //empty then return
                        break;
                    }
                    else{                   
                        q.add(null);
                    }
                }
                else{               //if not null then print the element
                    System.out.print(CurrChar.data+" ");
                    if (CurrChar.left!=null) {
                        q.add(CurrChar.left);
                    }
                    if(CurrChar.right!=null){
                        q.add(CurrChar.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);     //represent the whole tree
        
        System.out.print("Printing in Preorder form: ");
        tree.preorder(root);
        
        System.out.print("\nPrinting in Inorder form: ");
        tree.Inorder(root);

        System.out.print("\nPrinting in Postorder form: ");
        tree.Postorder(root);

        System.out.print("\nPrinting in Postorder form: ");
        tree.LevelOrder(root);
    } 
}