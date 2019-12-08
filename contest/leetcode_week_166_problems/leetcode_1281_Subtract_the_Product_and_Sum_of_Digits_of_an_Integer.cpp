/**
 * 给定一个正数，求各位之积减去各位之和。
 *
 * AC: Runtime: 0 ms | Memory Usage: 8.3 MB
 */
class Solution {
public:
    int subtractProductAndSum(int n) {
    	if(n == 0)
    		return 0;
        int product = 1, sum = 0;
        while(n != 0) {
        	product *= n % 10;
        	sum += n % 10;
        	n /= 10;
        }

        return product - sum;
    }
};