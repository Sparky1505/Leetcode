/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {

    const n = nums.length;
    if(n===0) return 0;
    let count=0;
    let maxCount=0;
    for(let i =0;i<n;i++){
        if(nums[i]===1){
            count++;
        }else{
            maxCount= Math.max(maxCount,count);
            count=0;
        }
    }
    if(count>maxCount){
        maxCount=count;
    }
    return maxCount;
    
};