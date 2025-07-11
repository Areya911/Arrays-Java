class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int left = nums[i][i];             // main diagonal
            int right = nums[i][n - 1 - i];    // anti-diagonal

            if (isPrime(left)) {
                max = Math.max(max, left);
            }
            if (isPrime(right)) {
                max = Math.max(max, right);
            }
        }

        return max;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
