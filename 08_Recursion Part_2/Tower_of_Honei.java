public class Tower_of_Honei{

    
    public static void Tower_of_Honei(int n,String src,String helper,String dest){
    //n==size   src ==source(in which disk is alraedy puts)  helper==help for inserting disk  dist==last in which we enter the
        if (n==1) {
            System.out.println("Transfer the disk from "+n+" to the "+dest);
            return;        
        }

        Tower_of_Honei(n-1,src,dest,helper);
        System.out.println("Transfer the disk from "+n+" to the "+dest);
        
        Tower_of_Honei(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=5;
        Tower_of_Honei(n, "S", "H", "D");
    }
} 