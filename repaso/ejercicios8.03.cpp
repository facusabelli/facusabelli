#include "ejercicios.h"
#include <iostream>

bool esPar(int n){
    if (n%2==0)
    {
        return true;
    }
    return false;
}

bool todosSonPares(vector<int> numeros){
    int a;
    float res;
    a==0;
    for (int i = 0; i < numeros.size() || a==1; ++i) {
        res==numeros[i]%2;
	    if (res!=0){
            return false;
            a==1;
        }
    }
    return true;
}
    

void agregarNumeros(vector<int> numeros, vector<int> elementosNuevos){
    for (int i = 0; i < elementosNuevos.size(); ++i){
        numeros.push_back(elementosNuevos[i]);
    }
}

void imprimirValores(vector<int> numeros){
    for (int i = 0; i < numeros.size(); i++){
        cout<<numeros[i]<<endl;
    }
}

vector<vector<int> > multiplicarMatriz(vector<vector<int> > matriz){

}

void mezclarMatrices(vector<vector<int> > matrizA, vector<vector<int> > matrizB){

}