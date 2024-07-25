// Bubble sort ==>> compare the adjecent element
// comparision(passes) =n-1 passes
// Time Complexity= O(n^2)

public class Bubble_Sort{
    public static void printarray(int a[]) {
        System.out.println("The Sorted Array become: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={8,2,5,3,1,9,6};
        for (int i = 0; i < a.length-1; i++) {          //a.length-1 = n=1 where n=size
            for (int j = 0; j < a.length-i-1; j++) {
                
                if (a[j] > a[j+1]) {      //compare
                    int temp=a[j];       //swaping
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
    printarray(a);
    }
}