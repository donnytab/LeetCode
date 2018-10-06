#include <iostream>
#include <vector>

using namespace std;

class BinaryTreeFromInorderPreorder {
public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        return helper(preorder, inorder, 0, 0, inorder.size()-1);
    }

    TreeNode* helper(vector<int>& preorder, vector<int>& inorder, int preorder_start, int inorder_start, int inorder_end) {
        if(preorder_start > preorder.size()-1 || inorder_start > inorder_end) return nullptr;
        int root_index = 0;
        TreeNode *new_node = new TreeNode(preorder[preorder_start]);
        for(int i=inorder_start; i<=inorder_end; i++) {
            if(inorder[i] == new_node->val) root_index = i;
        }
        new_node->left = helper(preorder, inorder, preorder_start+1, inorder_start, root_index-1);
        new_node->right = helper(preorder, inorder, preorder_start+root_index-inorder_start+1, root_index+1, inorder_end);
        return new_node;
    }
};