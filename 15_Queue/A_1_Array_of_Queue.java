//Queue is empty  ==>>    rear=-1 &&front==-1 
//Queue id Full   ==>>     rear=size-1


import java.util.Scanner;

public class A_1_Array_of_Queue {
    public static final int size = 5; 
    public int[] queue = new int[size]; 
    public int front = -1;          //set front and rear to -1 b/c it is always start from -1
    public int rear = -1; 

    public void enqueue(int element) {              //insert element       
        if (rear == size - 1)                       //check is the queue is full or not
        {                     
            System.out.println("Queue is full");
            return;
        } 
        else 
        {
            
            queue[rear] = element;        // Add element at the rear of the queue
            rear++;
        }
        return;
    }

    
    public void dequeue() {                         //remove the ele from the queue
        if (front ==-1 && rear==-1)            //checkbthe queue is empty or not
        {
            System.out.println("Queue is empty");
        } 
        else 
        {
            System.out.println("Deleted element is " + queue[front]); // Display the dequeued element
            front++;
            if (front > rear) {             // Reset queue if it becomes empty
                front = -1;
                rear = -1;
            }
        }
    }

    // Method to display elements of the queue
    public void display() {
        if (front ==-1 && rear==-1) 
        {
            System.out.println("Queue is empty");
        } 
        
        else 
        {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " "); // Print each element in the queue
            }
            System.out.println();
        }
    }

    // Main method to run the queue operations
    public static void main(String[] args) {
        A_1_Array_of_Queue q = new A_1_Array_of_Queue(); // Creating an instance of Queue
        Scanner scanner = new Scanner(System.in); // Scanner for input
        int choice;

        do {
            System.out.println("\nMenu\n1. Insert\n2. Delete\n3. Display\nEnter your choice: ");
            choice = scanner.nextInt(); // Reading the user's choice

            switch (choice) {
                case 1:
                    System.out.println("Enter the element:");
                    int element = scanner.nextInt(); // Reading the element to enqueue
                    q.enqueue(element);
                    break;
                case 2:
                    q.dequeue(); // Perform dequeue operation
                    break;
                case 3:
                    q.display(); // Display the queue
                    break;
                default:
                    System.out.println("Invalid choice"); // In case of invalid choice
                    break;
            }
        } while (choice == 1 || choice == 2 || choice == 3); // Loop to continue operations

        scanner.close(); // Close the scanner resource
    }
}
