# Diseñar un programa que muestre el producto de los 10 primeros números impares.

producto = 1

for i in range(1,21,2):
    if i % 2 != 0:
        print(i, "x", producto,"=", producto*i)
        producto = producto * i
