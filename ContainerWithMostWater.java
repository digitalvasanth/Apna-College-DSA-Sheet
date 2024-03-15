import java.util.*;
public class ContainerWithMostWater {
    public static void main(String []args){
        int arr[]={1,8,6,2,5,4,8,3,7};

        int maxarea=Integer.MIN_VALUE;

        int lp=0;
        int rp=arr.length-1;

        while(lp<rp){
            int height=Math.min(arr[lp],arr[rp]);
            int weight=rp-lp;
            int area=height*weight;
            maxarea=Math.max(maxarea,area);

            if(arr[lp]<arr[rp])
            lp++;
            else
            rp--;
        }
       System.out.println(maxarea);
    }
    
}
