/*
 Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 */
struct TreeNode {
    int val;
    TreeNode *left, *right, *next;
    TreeNode(int x) : val{x}, left{nullptr}, right{nullptr}, next{nullptr} {}
};

class SymmetricTree {
public:
    bool isSymmetric(TreeNode* root) {
        if(root == nullptr) return true;
        return helper(root->left, root->right);
    }

    bool helper(TreeNode *left, TreeNode *right) {
        if(left == nullptr && right == nullptr) return true;
        if(left == nullptr || right == nullptr) return false;
        if(left->val == right->val) return helper(left->left, right->right) && helper(left->right, right->left);
        return false;
    }
};