/*
 Input:  [1,2,3,4]
Output: [24,12,8,6]

 1, 1, 2, 6
 */

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int len = nums.size();
        vector<int> product(len,1);
        int temp = 1;

        // first loop, product from left to right
        for(int i=1; i<nums.size(); i++) {
            product[i] = nums[i-1] * product[i-1];
        }

        // second loop, product from right to left
        for(int j = nums.size()-1; j>=0; j--) {
            product[j] = product[j] * temp;
            temp = temp * nums[j];
        }

        return product;
    }
};