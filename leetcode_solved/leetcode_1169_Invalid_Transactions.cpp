#include<algorithm>
#include<cmath>
class Solution {
public:
    vector<string> invalidTransactions(vector<string>& transactions) {
        int size = transactions.size();
        vector<vector<string>> raw;
        string comma = ",";

        for(int i = 0; i < size; i++) {
        	vector<string> tempTrans = explode(transactions[i], ',');
        	raw.push_back(tempTrans);
        }

        vector<string> ret;
        vector<int> record(size, 0);

        for(int i = 0; i < size; i++) {
        	if(stoi(raw[i][2]) > 1000) {
        		if (record[i] == 0) {
					string temp = raw[i][0] + comma + raw[i][1] + comma + raw[i][2] + comma + raw[i][3];
					ret.push_back(temp);
					record[i] = 1;
				}
        	} else {
	        	for(int j = 0; j < size; j++) {
	        		if(j == i)
	        			continue;
	        		if(raw[i][0] == raw[j][0] && (abs(stoi(raw[i][1]) - stoi(raw[j][1])) <= 60) && raw[i][3] != raw[j][3]) {
	        			if(record[i] == 0) {
		        			string tempI = raw[i][0] + comma + raw[i][1] + comma + raw[i][2] + comma + raw[i][3];
		        			ret.push_back(tempI);
		        			record[i] = 1;
	        			}
	        			if(record[j] == 0) {
	        				string tempJ = raw[j][0] + comma + raw[j][1] + comma + raw[j][2] + comma + raw[j][3];
	        				ret.push_back(tempJ);
	        				record[j] = 1;
	        			}
	        		}
	        	}
        	}
        }

        return ret;
    }

    const vector<string> explode(const string& s, const char& c)
	{
	    string buff{""};
	    vector<string> v;

	    for(auto n:s)
	    {
	        if(n != c) buff+=n; 
	        else if(n == c && buff != "") { v.push_back(buff); buff = ""; }
	    }
	    if(buff != "") v.push_back(buff);

	    return v;
	}
};
