#include <iostream>
#include <vector>

using namespace std;

class MaxProductSubarray {
public:
    int maxProduct(vector<int>& nums) {
        if(nums.size()==0) return 0;
        int crr_max = nums[0], crr_min = nums[0], result = nums[0];
        for(int i=1; i<nums.size(); i++) {
            int prev_max = crr_max;
            crr_max = max(max(nums[i]*crr_max, nums[i]*crr_min), nums[i]);
            crr_min = min(min(nums[i]*prev_max, nums[i]*crr_min), nums[i]);
            result = crr_max > result ? crr_max : result;
        }
        return result;
    }
};