//Assume the first element is always sorted and to compare to next element and divide array into two parts sorted and unsorted
public class Insertion_Sort {
    public static void Display(int a[]){
        System.out.print("\nSorted array will be: ");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={2,6,34,79,3,7};
        
        System.out.print("Before sorting array will be: ");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i = 1; i < a.length-1; i++) {
            int key=a[i];
            int j=i-1;
            while (j >= 0 && key < a[j]) {
                a[j+1]=a[j];
                j--;
            }
        a[j+1]=key;
        }
    Display(a);
    }
}
