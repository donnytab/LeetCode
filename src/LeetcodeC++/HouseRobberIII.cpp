/*
 Input: [3,2,3,null,3,null,1]

     3
    / \
   2   3
    \   \
     3   1

Output: 7
Explanation: Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
 */
#include <iostream>

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left, *right, *next;
    TreeNode(int x) : val{x}, left{nullptr}, right{nullptr}, next{nullptr} {}
};

class Solution {
public:
    int rob(TreeNode* root) {
        int left = 0, right = 0;
        return robHelper(root, left, right);
    }

    int robHelper(TreeNode *root, int& left, int& right) {
        if(root == nullptr) return 0;
        int left_left = 0, left_right = 0, right_left = 0, right_right = 0;
        left = robHelper(root->left, left_left, left_right);
        right = robHelper(root->right, right_left, right_right);
        return max(left+right, root->val + left_left + left_right + right_left + right_right);
    }
};