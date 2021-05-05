#include <iostream>
#include <string>
#include <vector>
using namespace std;

int main() {

    vector<string> palabras_ingresadas;
    string palabras;

    for (int i = 0; i<6 ; i++){
        cin>>palabras;
        palabras_ingresadas.push_back(palabras);
    }

    for (int i = 0; i < palabras_ingresadas.size(); i++){
        if (i%2==0){
            cout<<palabras_ingresadas[i]<<"-";
        }
    }

    for (int i = 0; i < palabras_ingresadas.size(); i++){
        if (i%2!=0){
            cout<<palabras_ingresadas[i]<<"-";
        }
    }


//ejercicio 2

    vector<string>productos;
    vector<int>precios;

    productos.clear();
    precios.clear();

    int a,b,c,ingresar_precios,precio_por_cada_registro, resultado, resultado_final, suma;
    string ingresar_productos;

    cout<<"Para ingresar productos ponga 1"<<endl;
    cout<<"Para saber el importe parcial a pagar ponga 2"<<endl;
    cout<<"Para Finalizar el registro ponga 3"<<endl;
    cin>>a;

    while (a==1 || a==2|| a==3){

        while(a==1){
            cout<<"¿Cuantos registros desea hacer?"<<endl;
            cin>>b;
            for (int i = 0; i < b; i++){
                cin>>ingresar_productos;
                productos.push_back(ingresar_productos);
                cout<<productos[i]<<endl;
                cin>>ingresar_precios;
                precios.push_back(ingresar_precios);
            }

            cout<<"Para saber el importe parcial a pagar ponga 2"<<endl;
            cout<<"Para Finalizar el registro ponga 3"<<endl;
            cin>>a;
        }

        while(a==2){
            for (int i = 0; i < precios.size(); i++){
                precio_por_cada_registro = precios[i];
                resultado == resultado + precio_por_cada_registro;
            }
            cout<<"El importe a pagar es: "<<resultado<<endl;
            cout<<"Si desea registrar mas ponga 1"<<endl;
            cin>>a;
        }


        while(a==3){
            for (int i = 0; i < precios.size(); i++){
        
            }
            cout<<"El importe a pagar es: "<<resultado<<endl;
        }
    }
}
