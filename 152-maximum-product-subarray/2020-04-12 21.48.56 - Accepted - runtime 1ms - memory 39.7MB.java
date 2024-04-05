/*There are 3 * 3 = 9 cases in total, after you cover all the cases,
you will notice we just need to pick the newMin and newMax from set {num, num X oldMin, num X oldMax}

num > 0 E.g num = 3
num == 0
num < 0 E.g. num = -3
A) min < max < 0 E.g {-5,-2}
B) 0 < min < max E.g. {2,5}
C) min < 0 < max E.g {-2,5}
*/
class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int prevMax= nums[0];
        int prevMin= nums[0];
        int curMax,curMin;
        for(int i = 1;i<nums.length;i++){
            
            curMax = Math.max(nums[i],Math.max(nums[i]*prevMin,nums[i]*prevMax));
            curMin = Math.min(nums[i],Math.min(nums[i]*prevMin,nums[i]*prevMax));
            ans = Math.max(ans,curMax);
            prevMin = curMin;
            prevMax = curMax;
        }
        return ans;
    }
}