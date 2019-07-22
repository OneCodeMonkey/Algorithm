class Solution {
public:
	/**
	 * 思路：题目大意，给出一个n个点的有向图，其中的有向边要么是红色，要么是蓝色。
	 * 欲求数组 a[n]，表示从节点0到 k (0 <= k <= n-1) 的最短路径的长度，且每条最短路径上的边都必须是红蓝交替的形式。如果不存在
	 * 这样的最短路径，则 a[k] = -1.
	 */
    vector<int> shortestAlternatingPaths(int n, vector<vector<int>>& red_edges, vector<vector<int>>& blue_edges) {
        vector<int> ans;
        if(n == 0)
        	return ans;
        if(n == 1) {
        	ans.push_back(0);
        	return ans;
        }
        vector<int> red_edge[n];
        vector<int> blue_edge[n];
        for(int i = 0; i < red_edges.size(); i++) {
        	red_edge[red_edges[i][0]].push_back(red_edges[i][1]);
        }
        for(int i = 0; i < blue_edges.size(); i++) {
        	blue_edge[blue_edges[i][0]].push_back(blue_edges[i][1]);
        }
        for(int i = 0; i < n; i++)
        	ans.push_back(INT_MAX);
        int dis[n];
        memset(dis, INT_MAX, sizeof(dis));

        bool red_mark[n];
        bool blue_mark[n];
        memset(red_mark, false, sizeof(red_mark));
        memset(blue_mark, false, sizeof(blue_mark));
        dis[0] = ans[0] = 0;
        red_mark[0] = blue_mark[0] = true;
        queue<pair<int, int> > Q;
        for(int i = 0; i < red_edge[0].size(); i++) {
        	pair<int, int> p;
        	p.first = red_edge[0][i];
        	p.second = 1;
        	Q.push(p);
        	dis[red_edge[0][i]] = ans[red_edge[0][i]] = 1;
        	red_mark[red_edge[0][i]] = true;
        }
        for(int i = 0; i < blue_edge[0].size(); i++) {
        	pair<int, int> p;
        	p.first = blue_edge[0][i];
        	p.second = 0;
        	Q.push(p);
        	dis[blue_edge[0][i]] = ans[blue_edge[0][i]] = 1;
        	blue_mark[blue_edge[0][i]] = true;
        }
        int cnt = 1;
        while(Q.empty() == false) {
        	cnt++;
        	int size = Q.size();
        	for(int i = 0; i < size; i++) {
        		pair<int, int> p = Q.front();
        		Q.pop();
        		int node = p.first;
        		int color = p.second;
        		if(color == 1) {
        			for(int j = 0; j < blue_edge[node].size(); j++) {
        				int next_node = blue_edge[node][j];
        				if(blue_mark[next_node])
        					continue;
        				blue_mark[next_node] = true;
        				dis[next_node] = cnt;
        				if(dis[next_node] < ans[next_node])
        					ans[next_node] = dis[next_node];
        				pair<int, int> temp;
        				temp.first = next_node;
        				temp.second = 0;
        				Q.push(temp);
        			}
        		} else {
        			for(int j = 0; j < red_edge[node].size(); j++) {
        				int next_node = red_edge[node][j];
        				if(red_mark[next_node])
        					continue;
        				red_mark[next_node] = true;
        				dis[next_node] = cnt;
        				if(dis[next_node] < ans[next_node])
        					ans[next_node] = dis[next_node];
        				pair<int, int> temp;
        				temp.first = next_node;
        				temp.second = 1;
        				Q.push(temp);
        			}
        		}
        	}
        }
        for(int i = 0; i < n; i++) {
        	if(ans[i] == INT_MAX)
        		ans[i] = -1;
        }

        ans[0] = 0;

        return ans;
    }
};
