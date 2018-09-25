#include <iostream>
#include <stack>

using namespace std;

class MinStack {
private:
    std::stack<int> data_stack;
    std::stack<int> min_stack;
public:
    /** initialize your data structure here. */
    MinStack() {
    }

    void push(int x) {
        data_stack.push(x);
        if(min_stack.empty() || x<min_stack.top()) {
            min_stack.push(x);
        } else {
            min_stack.push(min_stack.top());
        }
    }

    void pop() {
        data_stack.pop();
        min_stack.pop();
    }

    int top() {
        return data_stack.top();
    }

    int getMin() {
        return min_stack.top();
    }
};