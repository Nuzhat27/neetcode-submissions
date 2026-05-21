class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int left = 1;
        for(int i = 1 ; i < n ; i ++){
            if(nums[i] != nums[i - 1]){
                nums[left ++] = nums[i]; 
            }
        }
        return left;
    }
}