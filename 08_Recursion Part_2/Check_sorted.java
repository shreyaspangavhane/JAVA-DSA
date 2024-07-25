public class Check_sorted {
    public static void isSorted(int arr[],int idx)
    {
        if (arr[idx]==arr.length-1) {
            
            System.out.println("array is sorted");            
            return;
        }
        if(arr[idx]<arr[idx+1]){
            //array is sorted
            isSorted(arr, idx+1);
            
        }
        else{
            System.out.println("Array is not sorted");
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,4,5};
        isSorted(arr, 0);
    }
    
}
