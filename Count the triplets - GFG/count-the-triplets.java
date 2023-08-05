//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        int ans = 0;
Arrays.sort(arr);
for (int i = arr.length - 1; i > 1; i--) {
    int j = i - 1;
    int k = 0;
    while (j > k) {
        if (arr[j] + arr[k] == arr[i]) {
            ans++;
            j--;
            k++;
        } else if (arr[j] + arr[k] < arr[i]) {
            k++;
        } else {
            j--;
        }
    }
}
return ans;

    }
}