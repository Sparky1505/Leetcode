/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {

    let n = nums.length;
    const seen = new Set();
    for(let i =0;i<n;i++){
        if(seen.has(nums[i])){
            return true;
        }
        seen.add(nums[i]);
    }
    return false;
    
};