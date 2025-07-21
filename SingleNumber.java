class Solution {
    public int singleNumber(int[] nums) {
        int number;
        // count frequencies of numbers using hashmap
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int key : freqMap.keySet()) {
            if(freqMap.get(key)==1){
                return key;}}
             return -1; // returns when there is an array  with no single numbers
}
 }