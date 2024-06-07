import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
     int n =nums.length;
     PriorityQueue<BigInteger> pq= new PriorityQueue();
     for(int i=0;i<n;i++){
        pq.offer(new BigInteger(nums[i]));
     }
     BigInteger number=null;
     int limit=(n-k+1);

     int i=0;
     while(i<limit){
        number=pq.poll();
        i++;
     }
     return number.toString();
    }
}