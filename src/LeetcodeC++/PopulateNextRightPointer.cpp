/*
 Example:

Given the following perfect binary tree,

     1
   /  \
  2    3
 / \  / \
4  5  6  7
After calling your function, the tree should look like:

     1 -> NULL
   /  \
  2 -> 3 -> NULL
 / \  / \
4->5->6->7 -> NULL
 */

#include <queue>

using namespace std;

struct TreeLinkNode {
    int val;
    TreeLinkNode *left, *right, *next;
    TreeLinkNode(int x) : val{x}, left{nullptr}, right{nullptr}, next{nullptr} {}
};

class PopulateNextRightPointer {
public:
    void connect(TreeLinkNode *root) {
        if(root == nullptr) return;

        while(root->left) {
            TreeLinkNode *temp = root;
            while(temp) {
                temp->left->next = temp->right;
                if(temp->next) temp->right->next = temp->next->left;
                temp = temp->next;
            }
            root = root->left;
        }
    }

    // Queue solution
    void connectQueue(TreeLinkNode *root) {
        if (!root) return;

        queue<TreeLinkNode*> q;

        //Trick: Push NULL to maintain depth information
        q.push(root);
        q.push(NULL);

        while(!q.empty())
        {
            TreeLinkNode* curr = q.front();
            q.pop();

            if (curr==NULL)
            {
                if (q.size() > 0) q.push(NULL);
            }
            else
            {
                curr->next = q.front();
                if(curr->left!=NULL) q.push(curr->left);
                if(curr->right!=NULL) q.push(curr->right);
            }
        }
    }
};