class Solution {
public:
	/**
	 * 思路：数组先按照 hours[i] > 8 ? 1 : -1 转换成一个 0，1 数组
	 * 然后我们来一个两重for 循环，但是会进行一些判断，来跳过大量的不需要考虑的清醒。
	 * 具体如何对此进行剪支的，详细见下面代码。
	 */
    int longestWPI(vector<int>& hours) {
		int n = hours.size();
		if (n == 0)
			return 0;
		if (n == 1)		// 极端情况
			return hours[0] > 8 ? 1 : -1;

		vector<int> raw;
		for (int i = 0; i < n; i++)
			raw.push_back(hours[i] > 8 ? 1 : -1);

		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			int rawMaxLength = maxLength;			// j 的起始跳过量，由于 maxLength 中途会变更，所以这里存一个不变的副本。
			int tempSum = raw[i];		// 临时累积和。方便中途做判断，提前退出
			int isAccumulated = 0;		// 头一次需要从 [i, i + maxLength - 1] 算出 tempSum, 后面就不需要了
			for (int j = i + rawMaxLength - 1; j < n; j++) {	// 从 (i + maxLength) 开始,因为长度至少要大于等于现在的最大长度，否则不是我们要的结果
				if (maxLength == 0) {	// 长度突破0
					if (raw[i] == 1) {		// 注意，不要直接写 if(raw[i]), 因为 -1 也能为 true
						maxLength++;
						break;
					}
					else
						continue;
				}
				if (maxLength == 1) {
					continue;
				}

				if (!isAccumulated) {
					for (int k = i + 1; k <= (j - 1); k++)	// 累加到 j 的前面一个。起始时 j 单独判断
						tempSum += raw[k];
					isAccumulated = 1;	// 已累加过和，j++ 时不需要再累加
				}
				if (tempSum + raw[j] < 1 /* 当前已经不满足 */ || tempSum + raw[j] + n - 1 - j < 1	/* 负的太多，即使后面都是 1 也满足不了 */) {
					if (j - i + 1 > maxLength)	// 更新最大长度
						maxLength = j - i + 1;
					break;	// i++
				}
				else {		// 加上 raw[j] 仍满足
					maxLength++;
					tempSum += raw[j];
				}
			}
		}

		return maxLength;
	}
};
