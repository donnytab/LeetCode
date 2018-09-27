struct TreeNode {
    int val;
    TreeNode *left, *right, *next;
    TreeNode(int x) : val{x}, left{nullptr}, right{nullptr}, next{nullptr} {}
};

class SameTree {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if(p == nullptr && q == nullptr) return true;
        if(p == nullptr || q == nullptr) return false;
        return (p->val == q->val) && isSameTree(p->left, q->left) && isSameTree(p->right, q->right);
    }
};