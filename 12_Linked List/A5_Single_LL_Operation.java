//Adding of linklist is done by using first add and last add element

public class A5_Single_LL_Operation{
    public int size;        //used to check the size of list
    A5_Single_LL_Operation(){
        this.size=0;        //assign the value of size 0
    }
    class Node{         //inbuild class
        String data;
        Node next;
        Node(String data){      //constructor of linked list
            this.data=data;
            size++;
        }
        
                         //increment the size till now the ele to be added
    
    }

    Node head;                  // Declaration of head variable which pt to 1st ele in list

    //add- first
    public void AddFirst(String data){
        Node newnode=new Node(data);
        if (head==null) {   // if true then make node and pt this node to head
            head=newnode;       // assign newhead value to head
            return;
        }
        newnode.next=head;      // newnode.next value is pt towards head  
        head=newnode;           //head value become the newnode
    }

    //add - Last
    public void AddLast(String data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }

        Node currNode=head;    //while traveling each ele is head step by step then we  call that perticular ele as head;
                                //then thses head value is assign to the currnode (means particular element in that node) 
    
        while (currNode.next!=null) {        //check till null
            currNode=currNode.next;         //move toward next element
        }
        currNode.next=newNode;
    }

    //print linked list
    public void printlist(){
        if (head==null) {
            System.out.println("List is empty");
        }
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    //Delete operation-first
    public void DeleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        size--;             //check the size of list

        head=head.next;         //delete the head element (the element which pt to the head)
    }

    //Delete operation-last
    public void DeleteLast(){
        if(head==null){             // check the list is empty or not
            System.out.println("List is empty");
        }
        size--;     //return the size


        if(head.next==null){        //check the next head element is null if yes then head will be null and return
            head=null;
            return;
        }

        Node SecondLast=head;           //assign second last ele to head for traversing 
        Node LastNode=head.next;

        while (LastNode.next!=null) {   //check till the null
            LastNode=LastNode.next;     //assign the last ele of node to their next ele and delete 
            SecondLast=SecondLast.next; 
        }
        SecondLast.next=null;
    }

    public void sizechecker(){
        System.out.print("The size of list is: "+size);
    }


    public static void main(String[] args) {
        A5_Single_LL_Operation obj=new A5_Single_LL_Operation();        //create the object of linked list 
        obj.AddFirst("Sanjay");     //add element at first
        obj.AddFirst("Shreyas");
        obj.AddLast("Pangavhane");  //add ele at last
        obj.printlist();                   //print list

        obj.DeleteFirst();          //delete first ele
        System.out.println("List after delete First element: ");
        obj.printlist();            //print list
        obj.sizechecker();          //print size

        obj.DeleteLast();
        System.out.println("\nList after delete Last element: ");
        obj.printlist();            //print list
        obj.sizechecker();          //print size
    }
    
}


