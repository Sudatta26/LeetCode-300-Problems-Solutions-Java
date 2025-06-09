class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0;
        int area=0;
        while(left<=right){
            if(area<Math.min(height[left],height[right])*(right-left)){
                area=Math.min(height[left],height[right])*(right-left);
            }
            if(height[left]<height[right]){
                left++;
            }
            else if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
                right--;
            }
        }

        return area;
    }
}