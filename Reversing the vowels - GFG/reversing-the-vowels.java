//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        int low=0,high=s.length()-1;
        char[] arr=s.toCharArray();
        while(low<high){
              if(vow(arr[low])==true && vow(arr[high])==true){
                  swap(arr,low,high);
                  low++;
                  high--;
              }
              else if(vow(arr[low])==true && vow(arr[high])==false)high--;
              else low++;
          }
          return new String(arr);
       
    }
    public boolean vow(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
      private void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
      }
}