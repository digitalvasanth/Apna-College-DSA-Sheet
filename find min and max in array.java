import java.util.*;


public class Main
{
    public static void findminandmax(int arr[]){
        Arrays.sort(arr);
        System.out.println("Minimum element is "+ arr[0]);
        System.out.println("Maximum element is "+arr[arr.length-1]);
    }
	public static void main(String[] args) {
		int arr[]={45,42,678,2,345};
		findminandmax(arr);
	}
}
