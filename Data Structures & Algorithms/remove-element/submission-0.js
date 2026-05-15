class Solution {
    /**
     * @param {number[]} nums
     * @param {number} val
     * @return {number}
     */
    removeElement(nums, val) {
        let auxIndex = 0;
        for(let i = 0; i < nums.length; i++){
            if(nums[i] !== val){
                nums[auxIndex++] = nums[i];
            }
        }
        return auxIndex;
    }
}
