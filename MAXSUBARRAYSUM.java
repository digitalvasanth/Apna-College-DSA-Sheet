import java.util.*;
public class MAXSUBARRAYSUM{

    public static int find(int arr[]){
        int max_sum=Integer.MIN_VALUE;
        int curr_sum=0;

        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
                if(curr_sum>max_sum)
                max_sum=curr_sum;

            if(curr_sum<0)
            curr_sum=0;
    }
        return max_sum;

    }
    public static void main(String args[]){
        int arr[]= { 5,4,-1,7,8};//answer should be 23

        
        System.out.println(find(arr));
    }
}