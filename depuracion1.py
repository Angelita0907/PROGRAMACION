temperatura = int(input("Dame un número:"))
mes = int(input("Dame un mes:"))
if temperatura > 26 and mes > 6 :
   print("Enciendo")
   temperatura = temperatura-1

if temperatura == 29:
    print("Hace 29 grados")

else: 
    if mes < 3 : #cond2 == true
        if temperatura < 10 :
            print("Encendiendo calefacción")
            temperatura = temperatura -1
        else: 
            print("No hace frio") 
    else:
        print("En este mes no se usa el aire")

print("Temperatura registrada:"+ str(temperatura))
