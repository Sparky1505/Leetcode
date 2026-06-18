/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {

    let n = prices.length;
    if(n<=1) return 0;

    let maxP =0;
    let minPrice = Infinity;

    for(let i=0;i<n;i++){
        minPrice= Math.min(minPrice, prices[i]);
        maxP = Math.max(maxP, prices[i]-minPrice);
    }
    return maxP;
    
};