// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    int largest=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        
        int current=0,second=-1;
        for(int i=0;i<n;i++){
            current=a[i];
            if(current<largest){
                second=Math.max(second,current);
            }
        }
         current=0;
         int third=-1;
        for(int i=0;i<n;i++){
            current=a[i];
            if(current<second){
                third=Math.max(current,third);
            }
        }
        
        return third;
    }
}
