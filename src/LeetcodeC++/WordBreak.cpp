#include <iostream>
#include <vector>
#include <set>

using namespace std;

class WordBreak {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
//        int pos = 0;
//        for(auto word : wordDict) {
//            while((pos = s.find(word))!= -1) {
//                s.erase(pos, word.length());
//            }
//        }
//        return s.empty();


        set<string> word_set(wordDict.begin(), wordDict.end());
        int len = s.size(); // cache s.size()
        vector<bool> dp(len + 1, false);
        dp[0] = true;
        for (int i = 1; i <= len; ++i) { // use ++i instead of i++ to avoid extra copy
            for (int j = i - 1; j >= 0; --j) {
                if (dp[j] && word_set.find(s.substr(j, i - j)) != word_set.end()) { // avoid unnecessary definition of a string copy
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
};