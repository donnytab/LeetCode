/*
 Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */

#include <vector>

using namespace std;

 class SortArrayByParity {
 public:
     // Solution 1: using partition() in <algorithm>
     vector<int> sortArrayByParity1(vector<int>& A) {
         auto is_even = [] (auto e) { return e % 2 == 0; };
         partition (A.begin (), A.end (), is_even);
         return A;
     }

     // Solution 2: using extra O(n) space, O(n) time
     vector<int> sortArrayByParity2(vector<int>& A) {
         int size = A.size();
         vector<int> res(size, 0);
         int start = 0, end = size - 1;
         for (int i = 0; i < size; i++) {
             if (A[i] % 2 == 1) {
                 res[end--] = A[i];
             } else {
                 res[start++] = A[i];
             }
         }
         return res;
     }

     // Solution 3: using sorting, O(nlogn) time
     vector<int> sortArrayByParity(vector<int>& A) {
         sort(A.begin(),A.end(),[](auto &i1, auto &i2){return i1%2 < i2%2;});
         return A;
     }
 };