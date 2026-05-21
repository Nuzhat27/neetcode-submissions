class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        /*Map<Integer , Integer> mpp = new HashMap<>();
        for(int num : nums){
            mpp.put(num , mpp.getOrDefault(num , 0) + 1);
            if(mpp.containsKey(num)){
                if(mpp.get(num) > n ) return num;
            }
        }
        return nums[0];*/
        int res = 0 , count = 0 ;
        for(int num : nums){
            if(count == 0)res = num;
            count += (res == num) ? 1 : -1;
        }
        return res;
    }
}