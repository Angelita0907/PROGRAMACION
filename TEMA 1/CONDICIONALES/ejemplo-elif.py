# temperatura mayor 26 enciendo aire
# temperatura menor 16 enciendo calefacción
# distinto, imprime "sin acciones"
# mostrar temperatura

temperatura = int(input("Indica la temperatura: "))

if temperatura > 26:
    print("Enciende el aire")
elif temperatura < 16:
    print("Enciende la calefacción")

else:
    print("Sin acciones")

print("La temperatura es",temperatura)