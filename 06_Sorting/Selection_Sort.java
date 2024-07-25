// Selection Sort ==>> Assume 1st element is smallest then compare to adjcent and swap if it is large then swap directly to that index
    
public class Selection_Sort{
     
    public static void Display(int a[]){
       
        System.out.print("\nThe Sorted Array will be:");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={3,8,2,5,4,9,1};
         System.out.print("Array before sorted:");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i < a.length-1; i++) {
            int min=i;
            for (int j = i+1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min=j;   
                }
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
    Display(a);
    }
}