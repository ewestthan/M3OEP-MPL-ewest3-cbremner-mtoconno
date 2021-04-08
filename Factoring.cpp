#include <string>
#include<iostream>
using namespace std;

string factor(string numStr);

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