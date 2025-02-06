# esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa 
# y falso en caso contrario.  

numero = "67321234376"
i = 0
iguales = True
ultimaposicion = len(numero)-1
posicionmedia = int(len(numero)/2)
cadenaimpar = len(numero)%2!=0

while i <= posicionmedia and not iguales:
    if numero[i] != numero [ultimaposicion-i]:
        iguales = False
        print("Distintos")
    else:
        print("Iguales")
    i+=1
if iguales:
    print("Es capicua")
else:
    print("No es capicua")
