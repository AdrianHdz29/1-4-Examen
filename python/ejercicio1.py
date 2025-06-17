# Instrucciones:
#1.-Escribe una línea de código que imprima "El área de un triangulo es:".
#2.-Declara dos variables numéricas para la base y la altura de un triángulo.
#3.-Crea una función que calcule el área del triángulo y almacene el resultado en una variable (area).
#4.-Imprime el resultado del área.
# Escribe tu código debajo de esta línea.
print("El área de un triangulo es:")
n_base = 5
n_altura = 6
def areaTriangulo(base, altura):
    return  (base * altura) / 2
area = areaTriangulo(n_base, n_altura)
print(area)