class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueValues = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[uniqueValues++] = nums[i]; 
            }
        }
        return uniqueValues;
    }
}