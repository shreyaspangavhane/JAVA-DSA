public class Merge_sort {

    public static void conqure(int arr[],int low , int mid, int high){
        int merge[]=new int[low-high+1];

        int idx1=low;     // idx 1 track the low
        int idx2=mid+1 ;   //idx2 track the mid+1 value
        int x=0;          // x track the merge and start from 0;

        while (idx1<=mid && idx2<=high) {
            if (arr[idx1]<=arr[idx2]) {
                merge[x++]=arr[idx1++];
            }
            else{           
                merge[x++]=arr[idx2++];
            }
        }
        
        while (idx1<=mid){
                merge[x++]=arr[idx1++];
        }
        
        while (idx2<=high){
                merge[x++]=arr[idx2++];
        }
        
        for (int i = 0,j=low ;i < merge.length; i++,j++) {
            arr[j]=merge[i];
            
        }

    }
    public static void divide(int arr[],int low,int high){
        if (low>=high) {
            return;
        }
        int mid=(low+high)/2;

        divide(arr, low, mid);
        divide(arr, mid+1, high);

        conqure(arr,low,mid,high);

    }
    public static void main(String[] args) {
        int arr[]={2,5,1,9,6};
        int n=arr.length;
    
        divide(arr, 0, n-1);
    
        //print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    
}
