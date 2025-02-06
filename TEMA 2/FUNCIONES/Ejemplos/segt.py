def suma(n1, n2):
    n1.insert(0, n2)
    return n1

n1 = [2, 3, 4]
n2= 3
print(suma(n1,n2))
print(n1)