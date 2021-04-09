#include <string>
#include<iostream>
using namespace std;

string factor(int num);


int main(int argc, char** argv) {
    ifstream fileIn;
    fileIn.open("number.txt");
    string numStr;
    fileIn >> numStr;
    int num = stoi(numStr);
    string factors_out = factor(num);
    cout << factors_out << endl;
    fileIn.clear();
    fileIn.close();
}


string factor(int num){
    string factors;
    for(int i = 1; i <= num; i++) {
        if (num % i == 0) {
            factors.append(to_string(i) + " ");
        }
    }
    return factors;
};