#include <vector>
#include <iostream>
#include "ejercicios.h"

using namespace std;

int main() {

    vector<int> a;
    a.push_back(1);
    a.push_back(2);
    a.push_back(3);
    cout << "El tamaño del vector es: " << a.size() << endl;
    imprimirValores(a);
    
    a.pop_back();
    a.pop_back();
    cout << "El tamaño del vector es: " << a.size() << endl;
    imprimirValores(a);


    return 0;
}