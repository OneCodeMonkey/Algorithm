struct pair_hash {
	template<class T1, class T2>
	std::size_t operator() (const std::pair<T1, T2>&pair) const {
		return std::hash<T1>()(pair.first) * 37 + std::hash<T2>()(pair.second);
	}
};
class Solution {
	unordered_map<string, int> skill_dict;
	unordered_map<pair<int, unsigned>, int, pair_hash> path_dict;
	unordered_map<pair<int, unsigned>, pair<int, unsigned>, pair_hash> prev;

	vector<unsigned> toggle_list;
	vector<unsigned> impossible_list;
	unsigned dest;

public:

    vector<int> smallestSufficientTeam(vector<string>& req_skills, vector<vector<string> >& people) {
    	int i = 0;
    	for(auto x:req_skills)
    		skill_dict[x] = i++;
    	toggle_list.resize(people.size());
    	for(int i = 0; i < people.size(); i++) {
    		unsigned new_state = 0;
    		for(auto & x:people[i])
    			new_state = toggle(new_state, skill_dict[x]);
    		toggle_list[i] = new_state;
    	}    

    	impossible_list.resize(people.size() + 1);
    	for(int i = people.size() - 1; i >= 0; i--)
    		impossible_list[i] = impossible_list[i + 1] | toggle_list[i];

    	dest = (1 << req_skills.size()) - 1;
    	dfs(0, 0);
    	auto current = make_pair(0, 0u);
    	vector<int> res;

    	while(prev.count(current)) {
    		if(prev[current].second != current.second)
    			res.push_back(current.first);
    		current = prev[current];
    	}

    	return res;
    }

    int dfs(int i, unsigned cur_state) {
    	if(cur_state == dest)
    		return 0;
    	if((cur_state | impossible_list[i]) != dest)
    		return 10000;

    	auto pr = make_pair(i, cur_state);
    	if(path_dict.count(pr))
    		return path_dict[pr];
    	auto l = dfs(i + 1, cur_state);
    	int new_state = cur_state | toggle_list[i];
    	auto r = dfs(i + 1, new_state);
    	r += 1;
    	if(r > l) {
    		prev[pr] = make_pair(i + 1, cur_state);
    		return path_dict[pr] = l;
    	} else {
    		prev[pr] = make_pair(i + 1, new_state);
    		return path_dict[pr] = r;
    	}
    }

    unsigned toggle(unsigned i, unsigned d) {
    	unsigned pointer = 1 << d;
    	return i | pointer;
    }
};
