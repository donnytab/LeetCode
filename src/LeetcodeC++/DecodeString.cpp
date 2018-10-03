/*
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 */

#include <iostream>

using namespace std;

class DecodeString {
public:
    // Sample solution
    string decodeString(string s) {
        int index = 0;
        return helper(s, index);
    }

    string helper(const string& s, int& i) {
        string result;
        while(i<s.length() && s[i] != ']') {
            if(!isdigit(s[i])) {
                result += s[i++];
            } else {
                int n = 0;
                while(i<s.length() && isdigit(s[i])) {
                    n = n*10 + s[i++] - '0';
                }
                i++;  // '['
                string temp = helper(s, i);
                i++;  // ']'

                while(n-- > 0)
                    result += temp;
            }
        }
        return result;
    }
};