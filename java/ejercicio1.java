// Instrucciones:
// 1. Escribe una línea de código que imprima "El área del triangulo es:".
// 2. Declara dos variables numéricas para los lados de un triangulo (base y altura).
// 3. Crea una función que calcule el área de un triangulo y almacene el resultado en una variable (area).
// 4. Imprime el resultado del área.

public class ejercicio1 { //modificación del nombre
    /**
     * Error: Este método debería ser static porque no depende de ninguna variable de instancia
     * y puede ser utilizado sin necesidad de crear un objeto de la clase.
     */
    public static double areaTriangulo(double lado1, double lado2){ 
        return (lado1 * lado2) / 2;
    }
    public static void main(String[] args) {
        // Escribe tu código aquí
        System.out.println("El área del triangulo es:");
        double base = 8;
        double altura = 15;
        double area = areaTriangulo(base, altura);
        System.out.println(area);
    }
}

