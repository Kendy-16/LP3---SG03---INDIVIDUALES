def sumar_arreglo(arr):
    suma = 0
    for num in arr:
        suma += num
    return suma

# Pedir cantidad de números
n = int(input("Introduce la cantidad de números: "))

# Crear lista vacía y llenarla con datos del usuario
numeros = []
print(f"Introduce los {n} números:")
for i in range(n):
    num = int(input())
    numeros.append(num)

# Calcular y mostrar la suma
print("La suma es:", sumar_arreglo(numeros))
