import java.util.Scanner;

public class A1_Array_of_Stack{
    static int[] a;
    static int top = -1;
    static int n, x, i;     

    static void push() {
        if (top == n - 1)           //n=size of array of stack
        {
            System.out.println("Stack is overflow");        //means stack is full
        }

        else 
        {
            top++;
            System.out.print("Enter the element: ");
            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            a[top] = x;
        }
    }

    static void pop() {
        if (top == -1) {                        
            System.out.println("Stack is underflow (empty)");
        } else {
            System.out.println("The element deleted is " + a[top]);
            top--;
        }
    }

    static void display() {
        if (top == -1) 
        {
            System.out.println("Stack is underflow (empty)");
        }

        else 
        {
            System.out.println("Stack elements:");
            for (i = 0; i <= top; i++) 
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the stack size: ");
        n = scanner.nextInt();
        a = new int[n];

        int choice, ch;
        do {
            System.out.println("Menu\n1.Push\n2.Pop\n3.Display");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
            }

            System.out.print("\nDo you want to continue? (1 for yes, 0 for no): ");
            ch = scanner.nextInt();
        } while (ch == 1);

        scanner.close();
    }
}
