import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int product1 = nums[n-1] * nums[n-2] * nums[n-3]; // three largest
        int product2 = nums[0] * nums[1] * nums[n-1];     // two smallest and the largest

        return Math.max(product1, product2);
    }
}

// why do we compare
// [-100, -98, -1, 2, 3, 4]
// Sorted: [-100, -98, -1, 2, 3, 4]

// product1 = 4 * 3 * 2 = 24  
// product2 = -100 * -98 * 4 = 39200

// Answer: 39200 ✅