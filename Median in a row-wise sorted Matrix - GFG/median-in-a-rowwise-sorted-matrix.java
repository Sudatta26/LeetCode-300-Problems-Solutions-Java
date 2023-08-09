//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here    
        int N=R*C;
        int assumed=N/2;
        int low=0;
        int high=2000;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(medianfun(matrix,mid)<=assumed)low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    int medianfun(int[][] matrix, int median){
        int presentnumber=0;
        for(int i=0;i<matrix.length;i++){
            int low=0;
            int high=matrix[i].length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(matrix[i][mid]<=median)low=mid+1;
                else high=mid-1;
            }
            presentnumber=low+presentnumber;
        }
        return presentnumber;
    }
}