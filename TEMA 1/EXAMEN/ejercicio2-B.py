# modifica el programa anterior para preguntar por los rangos
impar1 = int(input("Introduce un número: "))
impar2 = int(input("Introduce otro número: "))

while impar1 !=0 or impar2 !=0:

    impares = []

    if impar1 >= impar2:
        print("Introduzca de nuevo los números solicitados")
        impar1 = int(input("Introduce un número: "))
        impar2 = int(input("Introduce otro número: "))

    elif impar1 < impar2:
        for i in range (impar1,impar2+1):
            if  i % 2 !=0:
                impares.append(i)

            print("===========================================================")
            print("Impares que existen entre ", impar1, "-", impar2,": ",impares[0:i])
            print("En total existen ", len(impares), "números impares en el rango")
            print("===========================================================")

    impar1 = int(input("Introduce un número: "))
    impar2 = int(input("Introduce otro número: "))