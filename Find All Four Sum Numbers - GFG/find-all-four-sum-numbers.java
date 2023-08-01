//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
      ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (arr.length < 4) {
            return result;
        }
        Arrays.sort(arr);
        for (int m = 0; m < arr.length - 3; m++) {
            if (m > 0 && arr[m] == arr[m - 1]) continue;
            for (int i = m + 1; i < arr.length - 2; i++) {
                if (i != m + 1 && arr[i] == arr[i - 1]) continue;
                int j = i + 1;
                int l = arr.length - 1;
                while (j < l) {
                    long sum = arr[m];
                    sum = sum + arr[i];
                    sum = sum + arr[j];
                    sum = sum + arr[l];
                    if (sum == k) {
                        result.add(new ArrayList<>(Arrays.asList(arr[m], arr[i], arr[j], arr[l])));
                        while (j < l && arr[j] == arr[j + 1]) j++; // Skip duplicates
                        while (j < l && arr[l] == arr[l - 1]) l--; // Skip duplicates
                        j++;
                        l--;
                    } else if (sum > k) {
                        l--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return result;
    }
}