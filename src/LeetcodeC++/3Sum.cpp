#include <iostream>
#include <vector>

using namespace std;

class 3Sum {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int size = nums.size();
        std::sort(nums.begin(), nums.end());
        vector<vector<int>> result;
        for(int i=0; i<nums.size(); i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1, r=nums.size()-1;
            while(l<r) {
                int s = nums[l] + nums[r] + nums[i];
                if(s>0) {
                    r--;
                } else if(s<0) {
                    l++;
                } else {
                    result.push_back(vector<int>{nums[l], nums[r], nums[i]});
                    while(nums[l]==nums[l+1]) l++;
                    while(nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }
            }
        }
        return result;
    }
};