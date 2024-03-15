public class PairSum{
    public static boolean find(int arr[],int target){
        int n=arr.length;
        
int bp=-1;

for(int i=0;i<n-1;i++){

        if(arr[i]>arr[i+1]){
       bp=i;
        }

    }
    int lp=bp+1;
    int rp=bp;
        while(lp!=rp)
        {
            if(arr[lp]+arr[rp]==target)
            return true;
            else if(arr[lp]+arr[rp]<target)
            lp=(lp+1)%n;
            else
            rp=(n+rp-1)%n;
        }
        return false;
    }
public static void main(String [] args)
{
int arr[]={11, 15, 6, 8, 9, 10};
int target=16;
System.out.println(find(arr,target));
}
}