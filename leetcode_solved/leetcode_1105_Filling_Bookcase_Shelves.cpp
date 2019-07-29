class Solution {
public:
	int solve(vector<vector<int> >& books, vector<int> & record, int pos, int nowH, int restW, int shelf_width) {
		if(pos >= books.size())
			return nowH;
		if(books[pos][0] <= restW && books[pos][1] <= nowH)
			return solve(books, record, pos + 1, nowH, restW - books[pos][0], shelf_width);
		int t = record[pos];
		if(t < 0) {
			t = solve(books, record, pos + 1, books[pos][1], shelf_width - books[pos][0], shelf_width);
			record[pos] = t;
		}

		if(books[pos][0] <= restW)
			return min(nowH + t, solve(books, record, pos + 1, max(books[pos][1], nowH), restW - books[pos][0], shelf_width));
		else
			return nowH + t;
	}
    int minHeightShelves(vector<vector<int>>& books, int shelf_width) {
        vector<int> record(books.size(), -1);
        return solve(books, record, 1, books[0][1], shelf_width - books[0][0], shelf_width);
    }
};
