class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,maxarea=0;
        while(left<right){
            int area= Math.min(height[right],height[left])*(right-left);
            maxarea=Math.max(maxarea,area);
            if(height[left]<height[right]){
                left++;
            }
           else right--;
        } 
        return maxarea;
    }
}