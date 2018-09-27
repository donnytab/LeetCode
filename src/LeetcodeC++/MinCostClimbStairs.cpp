#include <iostream>
#include <vector>

using namespace std;

class MinCostClimbStairs {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int size = cost.size();
        vector<int> dp2(size);
        dp2[0] = cost[0];
        dp2[1] = cost[1];
        for(int i=2; i<size; i++) {
            dp2[i] = cost[i] + std::min(dp2[i-1], dp2[i-2]);
        }
        return std::min(dp2[size-1], dp2[size-2]);
    }
};