//cpp. Leetcode OJ Contest23 Minimum Time Difference_Leetcode539

//source code

class Solution
{
public:
    int findMinDifference(vector<string> &timePoints)
    {
        sort(timePoints.begin(), timePoints.end());
        int min_time = 1440, n = timePoints.size();
        for (int i = 0; i < timePoints.size(); i++)
        {
            if (Time_abs(timePoints[i], timePoints[(i + 1) % n]) < min_time)
                min_time = Time_abs(timePoints[i], timePoints[(i + 1) % n]);
        }
        return min_time;
    }

private:
    int Time_abs(string s1, string s2)
    {
        int h1 = stoi(s1.substr(0, 2));
        //截取小时，下同理
        int h2 = stoi(s2.substr(0, 2));
        int m1 = stoi(s1.substr(3, 2));
        int m2 = stoi(s2.substr(3, 2));
        int time = abs((h2 - h1) * 60 + (m2 - m1));
        return min(time, 1440 - time);
    }
};
