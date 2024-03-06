import java.util.*;


public class Main
{     //method 1
    // public static void findminandmax(int arr[]){
    //     Arrays.sort(arr);
    //     System.out.println("Minimum element is "+ arr[0]);
    //     System.out.println("Maximum element is "+arr[arr.length-1]);
    // }

	//method 2
	 public static void findminandmax(int arr[]){
	 int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
            min=arr[i];
            else if(arr[i]>max)
            max=arr[i];
        }
        
        System.out.println("Minimum element is "+min);
        System.out.println("Maximum element is "+max);
	 }


	public static void main(String[] args) {
		int arr[]={45,42,678,2,345};
		findminandmax(arr);
	}
}
