class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        /*for(int i = 0 ; i < n ; i ++){
            int product = 1;
            for(int j = 0 ; j < n ; j ++){
                if(j == i)continue;
                product *= nums[j];
            }
            res[i] = product;
        }
        */
        res[0] = 1;
        for(int i = 1 ; i < n ; i ++){
            res[i] = res[i - 1] * nums[i - 1];
        }
        int postfix = 1;
        for(int i = n - 1 ; i >= 0 ; i --){
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}  
