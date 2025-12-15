#include <iostream>
#include <string>
using namespace std;

void say_hello(string name) {
    cout << "Hello " << name << "!" << endl;
}

int main() {
    say_hello("Ahmad Iqbal");
    say_hello("Programmer");
    say_hello("Coder");

    return 0;
}
