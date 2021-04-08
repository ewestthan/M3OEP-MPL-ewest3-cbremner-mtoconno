#include <string>
#include<iostream>
using namespace std;

string factor(string numStr);

/*
int main() {
    int i = 543;
    string number = to_string(i);
    string s = factor(number);
    cout << s << endl;
}
*/

string factor(string numStr){
    int num = stoi(numStr);
    string factors;
    for(int i = 1; i <= num; i++) {
        if (num % i == 0) {
            factors.append(to_string(i) + " ");
        }
    }
    return factors;
};