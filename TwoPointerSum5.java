//Sorted and 2 pointer sum method to check pair sum exists or not in  sorted array
import java.util.*;
class TwoPointerSum5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array in sorted order:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target:");
        int target = sc.nextInt();
        boolean res = is2Sum(arr,n,target);
        System.out.print("Does a pair with sum equals target exists or not:"+res);
    }
    public static boolean is2Sum(int[] a, int n, int target){
        //Arrays.sort(a);
        for(int i=0;i<n;i++){
            int x = target-a[i];
            if(binarySearch(x,a,n)){
                return true;
            }
        }
        return false;
        
    }
    
    public static boolean binarySearch(int x,int a[],int n){
        int i=0,j=n-1;
        while(i<j){
            int mid = (i+j)/2;
            if(a[mid]==x){
                return true;
            }
            else if(x<a[mid]){
                j--;
            }
            else{
                i++;
            }
            
        }
        return false;
    }
}
