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
            
            String a = sc.next();
            String b = sc.next();
            Solution ob = new Solution();
            if(ob.isSubSequence(a,b))
            System.out.println(1);
            else
            System.out.println(0);
 		
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    boolean isSubSequence(String A, String B){
       if (A.length() == 0) {
    return true;
}

int index_A = 0;
int index_B = 0;

while (index_A < A.length() && index_B < B.length()) {
    if (A.charAt(index_A) == B.charAt(index_B)) {
        index_A++;
        index_B++;
    } else {
        index_B++;
    }

    if (index_A == A.length()) {
        return true;
    }
}

return false;


    }
}