#include <iostream>
using namespace std;

// Función que recibe un arreglo y su tamaño
int sumarArreglo(int arr[], int n) {
    int suma = 0;
    for (int i = 0; i < n; i++) {
        suma += arr[i];
    }
    return suma;
}

int main() {
    int n;
    cout << "Introduce la cantidad de números: ";
    cin >> n;

    int* numeros = new int[n]; // Arreglo dinámico

    cout << "Introduce los " << n << " números:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> numeros[i];
    }

    cout << "La suma es: " << sumarArreglo(numeros, n) << endl;

    delete[] numeros; // Liberar memoria
    return 0;
}
