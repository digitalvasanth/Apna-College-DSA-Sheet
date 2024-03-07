import java.util.*;
public class CONTAINISDUPLICATE {
    public static int check(int arr[]){
        HashSet<Integer> set=new HashSet<Integer>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]))
            return 1;
            else
            set.add(arr[i]);
        }
        return 0;
    }

    public static void main(String [] args){
        int arr[]={3,2,2,44,9};
        if(check(arr)==1)
        System.out.println("Duplicates found");
        else
        System.out.println("Duplicates Not Found");
        
    }
    
}
