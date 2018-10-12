/*
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

 */

#include <iostream>
#include <vector>

using namespace std;

class ShortestUnsortedContinuousSubarray {
    int findUnsortedSubarray(vector<int>& nums){
        int start = 0, end = nums.size()-1, min = INT_MIN, max = INT_MAX;
        while (start < end && nums[start] <= nums[start + 1]) start++;
        if(start == end) return 0;

        while (nums[end] >= nums[end - 1]) end--;

        for(int i = start; i <= end; i++) {
            max = max > nums[i] ? max : nums[i];
            min = min < nums[i] ? min : nums[i];
        }

        while(start >= 0 && min < nums[start]) start--;
        while(end < nums.size() && nums[end] < max) end++;
        return end - start + 1;
    }
};