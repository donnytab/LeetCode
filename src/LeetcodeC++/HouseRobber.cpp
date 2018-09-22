/*

 */
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int rob(vector<int>& nums) {
        int sum1 = 0, sum2 = 0;
        for(int i=0; i<nums.size(); i++) {
            if(i&1) {
                sum2 = max(nums[i]+sum2, sum1);
            } else {
                sum1 = max(sum2, nums[i]+sum1);
            }
        }
        return max(sum1, sum2);
    }
};