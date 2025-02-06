#Ejemplo condicional con temperaturas

temperatura=int(input("Dime la temperatura: "))

if temperatura > 23:
    print("Enciende el aire")
    temperatura=int(input("Dime la temperatura: "))
    if temperatura < 20 :
        print("Apago")

print("Sistema monitorizado automaticamente")