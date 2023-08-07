//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().search (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        int low = 1;
    int high = A.length - 2;
    if (A.length < 2)
        return A[0]; // edge case for only one element
    if (A.length > 1) { // edge case as if there is only one element low-1 can't be there
        if (A[low] != A[low - 1])
            return A[low - 1];
        if (A[high] != A[high + 1])
            return A[high + 1];
    }
    while (low <= high) {
        int mid = (low + high) / 2;

        if (A[mid] != A[mid - 1] && A[mid] != A[mid + 1])
            return A[mid];
        if (mid % 2 == 0) {
            if (A[mid] == A[mid - 1])
                high = mid - 1; // Imagine equal pair like 11, 22, 33 index are 01
            else
                low = mid + 1;
        } else {
            if (A[mid] == A[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
    }
    return -1;
    }
}