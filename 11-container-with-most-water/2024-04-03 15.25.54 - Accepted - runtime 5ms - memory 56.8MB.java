class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0, right = height.length-1;
        while(left<right){
            maxArea = Math.max(maxArea,
                        Math.min(height[left],height[right]) * (right-left));
            if(height[left]<height[right])
                left++;
            else
                right--;
            
        }
        return maxArea;
    }
}