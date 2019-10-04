class MinStack {
public:
    /** initialize your data structure here. */
    vector<int>a;
    vector<int>min;
    MinStack() {
        min.push_back(INT_MAX);
    }
    
    void push(int x) {
        a.push_back(x);
        if(x < min.back())
            min.push_back(x);
        else
            min.push_back(min.back());
    }
    
    void pop() {
        a.pop_back();
        min.pop_back();
    }
    
    int top() {
        return a.back();
    }
    
    int getMin() {
        return min.back();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(x);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */