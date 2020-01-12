/**
 * AC：
 * 思路：直接转二进制，挨个判断。注意这样顺序性的思维有坑，容易罚时过多。。
 *
 */
class Solution {
public:
    int minFlips(int a, int b, int c) {
    	int reverseCount = 0;
        vector<int> bitA;
        vector<int> bitB;
        vector<int> bitC;
        while(a) {
        	bitA.push_back(a % 2);
        	a /= 2;
        }
        while(b) {
        	bitB.push_back(b % 2);
        	b /= 2;
        }
        while(c) {
        	bitC.push_back(c % 2);
        	c /= 2;
        }

        int sizeA = bitA.size();
        int sizeB = bitB.size();
        int sizeC = bitC.size();
        int maxAB = sizeA > sizeB ? sizeA : sizeB;
        if(maxAB > sizeC) {
        	for(int i = maxAB - 1; i > sizeC - 1; i--) {
        		int tempA = 0, tempB = 0;
        		if(i <= sizeA - 1)
        			tempA = bitA[i];
        		if(i <= sizeB - 1)
        			tempB = bitB[i];
        		if(tempA == 1)
        			reverseCount++;
        		if(tempB == 1)
        			reverseCount++;
        	}
        }
        for(int i = bitC.size() - 1; i >= 0; i--) {
        	if(i > maxAB - 1) {
        		if(bitC[i] == 1)
        			reverseCount++;
        		continue;
        	}
        	if(bitC[i] == 0) {
        		int tempA = 0, tempB = 0;
        		if(i <= sizeA - 1)
        			tempA = bitA[i];
        		if(i <= sizeB - 1)
        			tempB = bitB[i];
        		if(tempA == 1)
        			reverseCount++;
        		if(tempB == 1)
        			reverseCount++;
        	} else {
        		int tempA = 0, tempB = 0;
        		if(i <= sizeA - 1)
        			tempA = bitA[i];
        		if(i <= sizeB - 1)
        			tempB = bitB[i];
        		if(tempA == 0 && tempB == 0)
        			reverseCount++;
        	}
        }

        return reverseCount;
    }
};