#include <iostream>
using namespace std;

// Instrucciones:
// 1. Escribe una línea de código que imprima "El área del triangulo es:".
// 2. Declara dos variables numéricas para los lados de un triangulo (largo y ancho).
// 3. Crea una función que calcule el área del triangulo y almacene el resultado en una variable (area).
// 4. Imprime el resultado del área.

// escribe codigo de función aquí
float areaTriangulo(float lado1, float lado2){
    return (lado1 * lado2) / 2;
}

int main() {
    // Escribe tu código aquí
    cout << "El área del triangulo es:" << endl;
    float ancho = 4;
    float largo = 10;
    float area = areaTriangulo(ancho, largo);
    cout << area << endl;

    return 0;
}
