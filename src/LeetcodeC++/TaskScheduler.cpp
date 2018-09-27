#include <iostream>
#include <vector>

using namespace std;

class TaskScheduler {
public:
    int leastInterval(vector<char>& tasks, int n) {
        int index = 25;
        int size = tasks.size();
        int *character = new int [26];
        for(int i=0; i<size; i++)
            character[tasks[i] - 'A']++;
        std::sort(character, character+25);

        while(index>=0 && character[index]==character[25])
            index--;

        return std::max(size, (n+1)*(character[25]-1)+25-index);
    }
};