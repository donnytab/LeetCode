#include <iostream>
#include <vector>

using namespace std;

class ContainerMostWater {
public:
    int maxArea(vector<int>& height) {
        int result = 0, begin = 0, end = height.size()-1;
        while(begin < end) {
            result = max(result, (end - begin) * min(height[begin], height[end]));
            height[begin] > height[end] ? end-- : begin++;
        }
        return result;
    }
};