
// Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.

import java.util.*;

public class ChocolateDistributionProblem {
    public static int find(int packets[],int students){
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(packets);
        for(int i=0;i+students-1<students;i++){
            int diff=packets[i+students-1]-packets[i];
            minDiff=Math.min(minDiff,diff);
        }
        return minDiff;
    }
    public static void main(String []args){
        int packets[]={7, 3, 2, 4, 9, 12, 56};
        int students=3;
        
        int ans=find(packets,students);
        System.out.println(ans);
        }
}
