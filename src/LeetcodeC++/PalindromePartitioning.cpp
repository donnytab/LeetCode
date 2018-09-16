/*
Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

Example:

Input: "aab"
Output:
[
  ["aa","b"],
  ["a","a","b"]
]
*/

#include <vector>
#include <string>

using namespace std;

class PalindromePartitioning {
public:
    vector<vector<string>> partition(string s) {
        vector<vector<string>> result;
        vector<string> partition;

        if(s.empty()) return result;

        backtrack(0, s, partition, result);

        return result;
    }

    bool isPalindrome(const string& str, int first, int last) {
        while(first <= last) {
            if(str[first++] != str[last--]) return false;
        }
        return true;
    }

    void backtrack(int begin, const string& str, vector<string>& partition, vector<vector<string>>& result) {
        if(begin == str.size()) {
            result.push_back(partition);
            return;
        }

        int length = str.size();
        for(int i = begin; i<length; i++) {
            if(isPalindrome(str, begin, i)) {
                partition.push_back(str.substr(begin, i-begin+1));
                backtrack(i+1, str, partition, result);     // recursively call backtrack() on the rest of sub string
                partition.pop_back();
            }
        }
    }
};

