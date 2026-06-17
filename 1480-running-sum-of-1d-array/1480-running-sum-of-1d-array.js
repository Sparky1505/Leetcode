/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {

    let sum=0; // O(1)
    for(let i =0; i<nums.length; i++){ // O(n) iterating through each element for running sum
        sum+=nums[i]; // re initializing the sum = sum + nums[i];
        nums[i]=sum; // poining the i to the same array index for sum
    }
    return nums;
    
};