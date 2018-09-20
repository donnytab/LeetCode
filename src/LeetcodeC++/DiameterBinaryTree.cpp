#include <iostream>

struct TreeNode {
    int val;
    TreeNode *left, *right, *next;
    TreeNode(int x) : val{x}, left{nullptr}, right{nullptr}, next{nullptr} {}
};

class DiameterBinaryTree {
public:
    int diameterOfBinaryTree(TreeNode* root) {
        if(root == nullptr) return 0;
        int current = findHelper(root->left) + findHelper(root->right);
        return std::max(current, std::max(diameterOfBinaryTree(root->left), diameterOfBinaryTree(root->right)));
    }

    int findHelper(TreeNode* root) {
        if(root == nullptr) return 0;
        return std::max(findHelper(root->left), findHelper(root->right)) + 1;
    }
};