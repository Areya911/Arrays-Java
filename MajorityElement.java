class Solution {
    public int majorityElement(int[] nums) {
        int max=nums.length/2;
        HashMap <Integer,Integer> frequency= new HashMap<>();
        for(int i:nums){
            frequency.put(i,frequency.getOrDefault(i,0)+1);
            if(frequency.get(i)>max){
               return i;
            }
        }
          return -1;
    }
}